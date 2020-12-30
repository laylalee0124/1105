package service.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BoardEntity;
import dto.BoardRequestDTO;
import service.BoardService;

public class BoardRegService implements BoardService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String subject=request.getParameter("subject");
		String content=request.getParameter("content");
		String writer=request.getParameter("writer");
		
		BoardRequestDTO dto=new BoardRequestDTO();
		dto.setSubject(subject);
		dto.setContent(content);
		dto.setWriter(writer);
		
		dao.insert(dto);
		
		//uri주소를 변경해서 서버에 요청한다.
		response.sendRedirect("index.bo");
		return null;
	}

}
