package service.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BoardEntity;
import dto.BoardRequestDTO;
import service.BoardService;

public class BoardDetailService implements BoardService {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int no=Integer.parseInt( request.getParameter("no"));
		
		//n DB에 파라미터 정보로 넘기고 실행후 상세정보를 리턴
		BoardEntity entity=dao.detail(no);
		
		//detail.jsp 페이지에서 detail정보를 확인할수있도록 request저장소에 저장
		request.setAttribute("detail", entity);
		
		//페이지이동
		return "detail.jsp";
	}

}
