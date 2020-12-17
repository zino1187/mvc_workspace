/*
	������ jsp�� ����ϰ� �վ��� ��Ʈ�ѷ��μ��� ������ ���� Ŭ������ �и���Ű��!!
	�׷��� jsp�� ������ �������� �Ǳ� ������ ���������� ��ü���� �����ϴ�..
*/
package movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movie.model.MovieAdvisor;

public class MovieController{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�Ķ���� �ޱ� 
		request.setCharacterEncoding("utf-8");//�Ķ���Ϳ� ���� ���ڵ�
		String movie = request.getParameter("movie");
		MovieAdvisor advisor = new MovieAdvisor();
		String msg=advisor.getAdvice(movie);
		HttpSession session=request.getSession();
		session.setAttribute("msg", msg);
		//Ŭ���̾�Ʈ�� �Ͽ��� ������  url�� �������� ��������!!������� 
		response.sendRedirect("/movie/movie_result.jsp");
	}
	
}

















