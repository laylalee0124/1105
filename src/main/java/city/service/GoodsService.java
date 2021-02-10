package city.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import city.domain.dto.GoodsDto;

public interface GoodsService {

	void tempFileUpload(MultipartFile tempFile)throws IOException;

	boolean tempFileDelete(String fileName)throws IOException;

	void save(GoodsDto dto, String fileName);

	List<GoodsDto> getList();

	void updateOption(long no, String title, String checked);

}
