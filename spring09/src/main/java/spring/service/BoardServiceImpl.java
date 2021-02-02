package spring.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import spring.commons.FileUtils;
import spring.domain.dto.BoardDto;
import spring.domain.entity.BoardEntity;
import spring.domain.entity.BoardEntityRepository;
import spring.domain.entity.FileEntity;
import spring.domain.entity.FileEntityRepository;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardEntityRepository repo;
	
	@Autowired
	FileEntityRepository fRepo;
	
	@Autowired
	FileUtils fileUtils;
	
	@Override
	public void saveAndUpload(BoardDto dto, MultipartFile file) throws IOException {
		
		//upload처리
		
		long fileSize=file.getSize();
		ClassPathResource cpr=new ClassPathResource("static/upload");
		File dir=cpr.getFile();
		String fileName=file.getOriginalFilename();
		
		File dest=new File(dir, fileName);
		
		
		System.nanoTime();
		
		
		file.transferTo(dest);
	}

	@Override
	public void saveAndPartUpload(BoardDto dto, Part file) throws IOException {
		long fileSize=file.getSize();
		ClassPathResource cpr=new ClassPathResource("static/upload");
		File dir=cpr.getFile();
		String fileName=file.getSubmittedFileName();
		
		System.out.println("fileName : "+ fileName);
		
		
		//////////////////////////////////////////////////
		//파일을 파일이름 과 확장자로 나누고
		//이름뒤에 숫자를 붙여서 새로운 파일이름으로 변경
		//////////////////////////////////////////////////
		// fileName : aaa.png
		// .문자 기준으로 문자열 나누기
		String[] strs=fileName.split("\\.");
		
		String newName=strs[0];//aaa
		String fileExtension=strs[1];//png
		newName += "_"+System.nanoTime()+".";//aaa_840002276669700.
		newName += fileExtension;//aaa_840002276669700.png
		//aaa_840002276669700.png
		////////////////////////////////////////////////////
		System.out.println(newName);
		
		//////////////////////////////////////////////////
		//오늘 날짜를 폴더이름으로 만들기위해서
		//Formatter로 연월일(yyyyMMdd) 설정후 디렉토리 생성
		//////////////////////////////////////////////////
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDateTime now=LocalDateTime.now();
		String fm=now.format(format);//포멧이 적용된 날짜
		
		File nowDir=new File(dir, fm);
		if(nowDir.exists()==false) {
			nowDir.mkdir();
		}
		//////////////////////////////////////////////////
		
		
		
		file.write(nowDir.getPath()+"/"+newName);
		
	}

	@Override
	public void multipart( BoardDto dto, MultipartFile[] files) throws IOException {
		//파일선택이 없을때 는 파일 처리 않함.
		//System.out.println(ObjectUtils.isEmpty(files));
		if(files!=null && !files[0].isEmpty()) {
			List<FileEntity> fileList=fileUtils.fileUploadList(files);
			dto.setFileList(fileList);
		}
		////////////////////////////////////////////
		
		//db에 저장
		System.out.println(dto.toEntity());
		repo.save( dto.toEntity());
	}

	@Override
	public ModelAndView getFileBoard(int pno) {
		
		Sort sort=Sort.by(Direction.DESC, "bno");
		int index=pno-1; //0
		// page zero-based page index
		Pageable pageable=PageRequest.of(index, 10, sort);
		
		Page<BoardEntity> page=repo.findAll(pageable);
		System.out.println(page.getTotalElements());
		System.out.println(page.getTotalPages());
		
		
		
		
		ModelAndView mv=new ModelAndView();
		//mv.addObject("list", page.getContent());
		mv.addObject("page", page);
		return mv;
	}

	@Override
	public BoardEntity detail(long bno) {
		BoardEntity result=repo.findById(bno).orElse(null);
		return result;
	}

	@Override
	public void fileDown(long fno, HttpServletResponse response) throws IOException{
		FileEntity result=fRepo.findById(fno).orElse(null);
		
		fileUtils.fileDownload(result, response);
		
	}

	@Override
	public void delete(long bno) {
		repo.deleteById(bno);
	}

	@Override
	public void delFile(long fno) {
		
		fRepo.deleteById(fno);
		
	}

	@Override
	public void update(BoardDto dto) {
		
		//원래 저장된 데이터 불러오기
		BoardEntity entity=repo.findById(dto.getBno()).orElse(null);
		//변경할 정보만 수정
		entity.update(dto.getSubject(), dto.getContents());
		//저장
		repo.save(entity);
	}

	

}
