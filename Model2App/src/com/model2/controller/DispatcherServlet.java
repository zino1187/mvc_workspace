/*
 * 웹상의 모든 클라이언트의 요청을 받고, 응답을 전담하는 컨트롤러 정의
 * */
package com.model2.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.parser.JSONParser;

public class DispatcherServlet extends HttpServlet{
	FileReader fis; //컨트롤러 매핑 설정파일을 읽기위한 스트림
	
	public void init(ServletConfig config) throws ServletException {
		String contextConfigLocation = config.getInitParameter("contextConfigLocation");
		String realPath = config.getServletContext().getRealPath(contextConfigLocation);
		System.out.println(realPath);
		
		try {
			fis = new FileReader(realPath);
			JSONParser jsonParser = new JSONParser();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//jsonParser.p
	}
	
	//doXXX형 메서드를 정의하여 요청을 받자!!
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//2단계: 요청을 분석한다
		String uri = request.getRequestURI(); //클라이언트가 요청시 사용한uri자체가 요청의 구분값으로 사용될 수 있다.
		
		//if문을 대신할 구조화된 데이터를 선택하자!!(xml, json, properties)
	}
	
	
	
}






