<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=utf-8"%>
<%
	//포워딩을 통해 넘겨받은 request 객체에 담겨진 데이터 꺼내기
	List boardList = (List)request.getAttribute("boardList");
	out.print("게시물 수는 "+boardList.size());
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
table {
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
	border: 1px solid #ddd;
}

th, td {
	text-align: left;
	padding: 16px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Points</th>
		</tr>
		<tr>
			<td>Jill</td>
			<td>Smith</td>
			<td>50</td>
		</tr>
		<tr>
			<td>Eve</td>
			<td>Jackson</td>
			<td>94</td>
		</tr>
		<tr>
			<td>Adam</td>
			<td>Johnson</td>
			<td>67</td>
		</tr>
		<tr>
			<td colspan="3" style="text-align:center">
				[1][2][3]
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<button onClick="location.href='/board/regist_form.jsp'"> 글등록</button>
			</td>
		</tr>
	</table>

</body>
</html>