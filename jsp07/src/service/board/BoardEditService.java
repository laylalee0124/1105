package service.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BoardEditDTO;
import dto.BoardEntity;
import dto.BoardRequestDTO;
import service.BoardService;

public class BoardEditService implements BoardService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");
		int  no= Integer.parseInt( request.getParameter("no") );
		//System.out.println("subject : "+subject);
		//System.out.println("content : "+content);
		//System.out.println("no : "+no);		
		BoardEditDTO dto=new BoardEditDTO();
		dto.setNo(no);
		dto.setSubject(subject);
		dto.setContent(content);
		/////////////////////////////////////////
		
		dao.edit(dto);

		return null;
	}

}
