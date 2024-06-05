<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 세션 읽기 
HttpSession ses = request.getSession(false);

if(ses != null && ses.getAttribute("userid") != null) {
	String userid = (String)ses.getAttribute("userid");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 성공 페이지</h2>
<p>환영한다 <%= userid %> ㅋㅋ </p>
인증에 성공한 경우 처리할 무언가를 작업 Authorization(인가)
<br>
쇼핑, 게시판, 방명록, 회의 참여...
<br>
<br>
<a href="jsp09logout.jsp">로그아웃</a>
</body>
</html>
<%
} else {
	// 로그인 없이 호출된 경우
	response.sendRedirect("jsp09sessinlogin.html");
}
%>
