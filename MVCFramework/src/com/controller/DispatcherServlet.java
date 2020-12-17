/*
 * MVC패턴으로 개발하다보면, 늘어나는 컨트롤러에 대해 일일이 매핑과정을 진행해야 한다..
 * 이때 너무 많은 매핑은 관리하기가 까다롭다 따라서 유지보수성이 떨어진다..
 * 현실과 유사하게, 어플리케이션에서도 대형 업무처리시 클라이언트의 요청을 곧바로 해당 컨트롤러에게
 * 처리하게 하지 않고, 중간에 메인 컨트롤러를 두고, 모든 요청을 이 메인 컨트롤러에서 처리하여
 * 적절한 하위 컨트롤러에게 전담시키는 방식을 이용한다..
 * 
 * 이 컨트롤러는 웹어플리케이션의 모든~~~~~everything 요청을 1차적으로 받는다!!
 * */
package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.controller.MovieController;

public class DispatcherServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	
	//get or post상관없이, 모든 요청을 이 메서드에서 처리하자!!
	public void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1단계:요청을 받는다!!
		System.out.println("제가 요청을 받았어요 ㅜㅜ");
		//클라이언트가 영화를 원하면? --> 영화담당 컨트롤러에게 전가
		//클라이언트가 혈액형를 원하면? --> 혈액형담당 컨트롤러에게 전가
		
		//2단계:요청을 분석하여, 알맞는 컨트롤러에게 요청을 전달
		//글쓰기?, 삭제?혈액형? 영화? 핸드폰?....
		//클라이언트가 원하는게 무엇인지를 알아야 한다..
		//해답은 클라이언트 요청 자체에 있다..즉 요청시 사용된 URI가 곧 요청 구분값이다!!
		String uri = request.getRequestURI();
		System.out.println("지금 들어온 요청은 "+uri);
		
		if(uri.equals("/movie.do")) {//영화를 원하면...			
			System.out.println("영화전문 컨트롤러인 MovieController에게 전달할께요");
			//하위 컨트롤러 생성 하기 
			MovieController controller = new MovieController();
			
			//3단계: 알맞는 로직 객체에게 일 시킨다
			controller.execute(request, response);
			
		}else if(uri.equals("/blood.do")) {
			System.out.println("혈액형전문 컨트롤러인 BloodController에게 전달할께요");
			
		}
	}
	
}









