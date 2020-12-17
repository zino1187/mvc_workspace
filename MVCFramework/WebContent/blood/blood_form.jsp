<%@page import="blood.model.BloodAdvisor"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%
	String blood = request.getParameter("blood");
	out.print("전송된 혈액형은 "+blood);
	out.print("<p>");
	
	//혈액형에 대한 판단 메시지 작성 및 출력
	BloodAdvisor advisor = new BloodAdvisor();
	String msg=advisor.getAdvice(blood);
	
	out.print(msg);
	out.print("<p>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script>
function send(){
	 var form = document.querySelector("form");
	 form.action="/blood/blood_form.jsp";
	 form.submit(); //전송
}
</script>
</head>
<body>
	<form>
		<select name="blood">
			<option>혈액형을 선택하세요</option>
			<option value="A">A형</option>
			<option value="B">B형</option>
			<option value="O">O형</option>
			<option value="AB">AB형</option>
		</select>
		<button type="button" onClick="send()">분석보기</button>
	</form>
	
</body>
</html>

