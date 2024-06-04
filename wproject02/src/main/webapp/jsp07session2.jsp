<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>결과 보기</h2>
<%
request.setCharacterEncoding("utf-8");

String movie = request.getParameter("movie");
String idkey = (String)session.getAttribute("idkey");
System.out.println("idkey : " + idkey);

if(idkey != null) {
%>
	<%= idkey %>를 가진분이 선택한 영화는 <%= movie %> 입니다.
	<br>
	세션 아이디 : <%= session.getId() %><br>
	세션 유효시간 : <%= session.getMaxInactiveInterval() %>초
	<!-- 세션 삭제는 session.invalidate() -->
<%	
} else {
	out.println("ㅠㅅㅠ 세션이 설정 안됐어유");
}
%>
</body>
</html>