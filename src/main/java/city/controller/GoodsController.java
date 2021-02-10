package city.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import city.domain.dto.GoodsDto;
import city.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService service;
	
	@ResponseBody
	@PostMapping("/goods/temp-upload")
	public void upload(MultipartFile tempFile) throws IOException{
		System.out.println(tempFile);
		service.tempFileUpload(tempFile);
	}
	
	@ResponseBody
	@PostMapping("/goods/temp-delete")
	public boolean delete(String fileName) throws IOException{
		return service.tempFileDelete(fileName);
	}
	
	@PostMapping("/goods/reg")
	public String reg(GoodsDto dto, String fileName) {
		service.save(dto, fileName);
		return "redirect:/goods/reg";
	}
	@GetMapping("/goods/reg")
	public String reg() {
		
		return "/admin/goodsReg";
	}
	
	@GetMapping("/goods/list")
	public ModelAndView list() {
		
		ModelAndView  mv=new ModelAndView("/admin/goodsList");
		List<GoodsDto> list=service.getList();
		//System.out.println(list);
		mv.addObject("list", list);
		
		return mv;
	}
	
	@PostMapping("/goods/viewOption")
	public void viewOPtion(long no, String title, String checked) {
		service.updateOption(no, title, checked);
	}

}
