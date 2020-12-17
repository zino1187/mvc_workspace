/*
	������ jsp�� ����ϰ� �վ��� ��Ʈ�ѷ��μ��� ������ ���� Ŭ������ �и���Ű��!!
	�׷��� jsp�� ������ �������� �Ǳ� ������ ���������� ��ü���� �����ϴ�..
*/
package blood.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import blood.model.BloodAdvisor;

public class BloodController{
	
	protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�Ķ���� �ޱ� 
		String blood = request.getParameter("blood");
		BloodAdvisor advisor = new BloodAdvisor();
		String msg=advisor.getAdvice(blood);
		
		//����� ���� ����� �������� View �� ����ϹǷ�, �� �������� ó���ϸ� �ȵȴ�!!
		//��� jsp ���� �޼����� �����ַ���, ������ �޸𸮿� �ӽ������� �����س��� �ʿ䰡 �մ�
		//����μ��� ���ǿ� ���� 
		HttpSession session=request.getSession();
		session.setAttribute("msg", msg);
		
		//Ŭ���̾�Ʈ�� �Ͽ��� ������  url�� �������� ��������!!������� 
		response.sendRedirect("/blood/blood_result.jsp");
	}
	
}

















