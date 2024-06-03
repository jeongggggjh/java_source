<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
<%@ page import="java.time.LocalTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="jsp03top.jsp" %>
<h1>include 연습</h1>
include 지시어 : 여러 jsp파일에서 공통으로 사용할 부분을 별도 파일로 작성 후 필요 할 때 포함해서 씀
<pre>
여기는 본문
</pre>
<%@ include file="jsp03bottom.jsp" %>
</body>
</html>