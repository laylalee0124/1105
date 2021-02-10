package city.service;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import city.domain.dto.GoodsDto;
import city.domain.entity.Goods;
import city.domain.entity.GoodsRepository;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	HttpServletResponse response;
	
	@Override
	public void tempFileUpload(MultipartFile tempFile) throws IOException {
		ClassPathResource cpr=new ClassPathResource("static/temp");
		File dir=cpr.getFile();
		//String dir="D:\\spring\\workspace\\city\\src\\main\\resources\\static\\temp\\";
		//String origin=URLDecoder.decode(tempFile.getOriginalFilename(), "utf-8");
		//System.out.println(origin);
		String origin=new String(tempFile.getOriginalFilename().getBytes(), "utf-8");
		String[] strs=origin.split("[.]");
		String newFileName=strs[0];
		newFileName += "_"+System.nanoTime()+".";
		String fileExtension=strs[1];
		newFileName += fileExtension;
		
		tempFile.transferTo( new File(dir, newFileName) );
		
		//String tempPath=File.separator+"temp"+File.separator+newFileName;
		
		response.setCharacterEncoding("utf-8");
		response.getOutputStream().println(newFileName);
		
		
	}

	@Override
	public boolean tempFileDelete(String fileName) throws IOException {
		ClassPathResource cpr=new ClassPathResource("static/temp");
		File dir=cpr.getFile();
		//String dir="D:\\spring\\workspace\\city\\src\\main\\resources\\static\\temp\\";
		//String path=dir+ fileName;
		String path=dir.getAbsolutePath()+"\\"+ fileName;
		System.out.println("path : "+path);
		File file=new File(path);
		boolean result=false;
		if(file.exists()) {
			
			result=file.delete();
		}else {
			System.out.println();
		}
			
		return result;
		
	}
	
	@Autowired
	private GoodsRepository repository;

	@Override
	public void save(GoodsDto dto, String fileName) {
		
		dto.setImgPath("/temp/"+fileName);
		repository.save(dto.toEntity());
	}

	@Override
	public List<GoodsDto> getList() {
		
		Sort sort=Sort.by(Direction.DESC, "no");
		return repository.findAll(sort).stream()
				.map(goods->new GoodsDto(goods))//.map(GoodsDto::new)
				.collect(Collectors.toList());
	}

	@Override
	public void updateOption(long no, String title, String checked) {
		Goods entity=repository.findById(no).orElse(null);
	
		
	}

}
