/*
	기존의 jsp가 담당하고 잇었던 컨트롤러로서의 업무를 현재 클래스로 분리시키자!!
	그래야 jsp는 순수한 디자인이 되기 때문에 유지보수시 교체까지 가능하다..
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
		//파라미터 받기 
		request.setCharacterEncoding("utf-8");//파라미터에 대한 인코딩
		String movie = request.getParameter("movie");
		MovieAdvisor advisor = new MovieAdvisor();
		String msg=advisor.getAdvice(movie);
		HttpSession session=request.getSession();
		session.setAttribute("msg", msg);
		//클라이언트로 하여금 지정한  url로 재접속을 유도하자!!명령하자 
		response.sendRedirect("/movie/movie_result.jsp");
	}
	
}

















