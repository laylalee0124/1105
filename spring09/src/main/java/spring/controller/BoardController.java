package spring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import spring.domain.dto.BoardDto;
import spring.domain.entity.BoardEntity;
import spring.domain.entity.FileEntity;
import spring.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@GetMapping("/board/write")
	public String write() {
		return "/board/write";
	}
	
	
	@PostMapping("/board/write")
	public String write(BoardDto dto, MultipartFile file) throws IOException {
		
		service.saveAndUpload(dto, file);
		
		return "redirect:/board/write";
	}
	
	@PostMapping("/board/partWrite")
	public String write(BoardDto dto, Part file) throws IOException {
		
		service.saveAndPartUpload(dto, file);
		
		return "redirect:/board/write";
	}
	
	
	@GetMapping("/board/multiFile")
	public String multiFile() {
		return "/board/multiFile";
	}
	
	@PostMapping("/board/multiFile")
	public String multiFile(BoardDto dto, MultipartFile[] files) throws IOException {
		
		service.multipart(dto, files);
		
		return "redirect:/board/FileBoard";
	}
	
	@GetMapping("/board/FileBoard/{pno}")
	public ModelAndView FileBoard(@PathVariable int pno) {
		
		ModelAndView mv=service.getFileBoard(pno);
		mv.setViewName("/board/list");
		
		return mv;
	}
	
	@GetMapping("/board/detail/{bno}")
	public ModelAndView detail(@PathVariable long bno) {
		ModelAndView mv=new ModelAndView("/board/detail");
		BoardEntity detail=service.detail(bno);
		
		mv.addObject("detail", detail);
		
		return mv; 
	}
	
	@GetMapping("/board/fileDown/{fno}")
	public void fileDown(@PathVariable long fno, HttpServletResponse response)throws IOException {
		service.fileDown(fno, response);
		//return "redirect:/board/detail/"+bno;
	}
	
	@GetMapping("/board/delete/{bno}")
	public String delete(@PathVariable long bno) {
		service.delete(bno);
		
		return "redirect:/board/FileBoard";
	}
	
	
	@GetMapping("/board/delFile/{bno}/{fno}")
	public String delFile(@PathVariable long bno,@PathVariable long fno) {
		service.delFile(fno);
		
		return "redirect:/board/detail/"+bno;
	}
	
	
	@PostMapping("/board/edit")
	public String update(BoardDto dto) throws IOException {
		
		//service.multipart(dto, null);
		service.update(dto);		
		return "redirect:/board/detail/"+dto.getBno();
	}
	
	
	

}
