package service.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BoardEntity;
import service.BoardService;

public class BoardIndexService implements BoardService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<BoardEntity> list=dao.listAll();
		
		request.setAttribute("list", list);
		
		return "index.jsp";
	}

}
