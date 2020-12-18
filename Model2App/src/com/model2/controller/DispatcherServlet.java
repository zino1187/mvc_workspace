/*
 * ������ ��� Ŭ���̾�Ʈ�� ��û�� �ް�, ������ �����ϴ� ��Ʈ�ѷ� ����
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
	FileReader fis; //��Ʈ�ѷ� ���� ���������� �б����� ��Ʈ��
	
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
	
	//doXXX�� �޼��带 �����Ͽ� ��û�� ����!!
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		//2�ܰ�: ��û�� �м��Ѵ�
		String uri = request.getRequestURI(); //Ŭ���̾�Ʈ�� ��û�� �����uri��ü�� ��û�� ���а����� ���� �� �ִ�.
		
		//if���� ����� ����ȭ�� �����͸� ��������!!(xml, json, properties)
	}
	
	
	
}






