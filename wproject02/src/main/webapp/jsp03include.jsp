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
--- 여기는 include action tag로 파일 포함 결과 출력 지역 ---<br>
<jsp:include page="jsp03tag1.jsp"></jsp:include>
<br>
뭔가를 작업 ... 
<br>
<div style="color:red; font-size:30px;">
	<jsp:include page="jsp03tag2.jsp">
		<jsp:param value="good" name="msg"/>
	</jsp:include>
</div>

<%@ include file="jsp03bottom.jsp" %>
</body>
</html>