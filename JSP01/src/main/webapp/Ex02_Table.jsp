<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- i는 %=안에..  -->	
	
	<table border="1">
		<tr>
	<% 
		for(int i=1; i<=10; i++){ 
	%>
		<td><%= i %></td>	
	<%	} %>
	
		</tr>
	</table>
	
	<!-- 다른 방법 -->
	
	<br>
		<table border="1">
		<tr>
	<% 
		for(int i=1; i<=10; i++){ 
			// out은 JSP의 내장객체로 따로 선언하지 않아도
			// 호출해서 사용할 수 있다
			out.print("<td>"+i+"</td>");
		} %>
	
		</tr>
	</table>
	


</body>
</html>