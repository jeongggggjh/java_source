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
request.setCharacterEncoding("utf-8"); // 한글 깨짐 방지
String pwd = request.getParameter("pwd1");
if(!pwd.equals("kor")) { // 비밀번호가 kor이 아닌 경우
	response.sendRedirect("jq03check.html");
}
String id = request.getParameter("userid");
String age = request.getParameter("age");
out.println(id + "님의 나이는 " + age + "살");
%>
</body>
</html>