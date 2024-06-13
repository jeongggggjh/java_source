<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="memberMgr" class="pack.member.MemberMgr"/>

<%
String id = request.getParameter("id");
boolean b = memberMgr.idCheckProcess(id);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>id 검사</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script src="../js/script.js"></script>
</head>
<body style="text-align: center; margin-top: 30px;">
<b><%=id %></b>
<%
if(b) {
%>
	: 이미 사용중 ㅋㅋ ㅅㄱ<p/>
	<a href="#" onclick="opener.document.regForm.id.focus();window.close()">닫기</a>
<%	
} else {
%>
	: 사용가능 ㅋ
	<a href="#" onclick="opener.document.regForm.passwd.focus();window.close()">닫기</a>
<%	
}
%>
</body>
</html>