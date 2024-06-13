<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
    %>

<jsp:useBean id="mbean" class="pack.member.MemberBean"/>
<jsp:setProperty property="*" name="mbean"/>
<jsp:useBean id="memberMgr" class="pack.member.MemberMgr"/>
<%
boolean b = memberMgr.memberInsert(mbean);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(b) {
	out.println("<b>가입 ㅊㅊ</b><br>");
	out.println("<a href='login.jsp'>회원 로그인</a><br>");
} else {
	out.println("<b>가입 실패 ㅋㅋ</b><br>");
	out.println("<a href='register.jsp'>가입 재시도</a><br>");
}
%>
</body>
</html>