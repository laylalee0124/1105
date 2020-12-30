package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MyDAO;

public interface MyService {
	MyDAO dao=new MyDAO();
	public String execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException ;
}
