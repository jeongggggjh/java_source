<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if(id.equals("admin") && pwd.equals("111")) {
	// 로그인에 성공해서 세션 생성
	session.setAttribute("adminOk", id);
	out.println("로그인 성공ㅋ<br>");
	
} else {
	out.println("로그인 실패ㅋ<br>");
}
%>

<a href="javascript:window.close()">[창닫기]</a>
</body>
</html>