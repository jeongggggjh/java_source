<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/script.js"></script>
</head>
<body>
<table>
	<tr>
		<td style="font-size: 24px;">특별 상품 전문 쇼핑몰</td>
	</tr>
</table>

<%@ include file="guest_top.jsp" %>
<table>
<%
if(memid != null) {
%>
	<tr style="text-align: center;">
		<td>
		<br><br><br><br><br><br><br><br>
			<%=memid %> 어서오고 ~
			<img src="../images/pic2.gif" />
		</td>
	</tr>
<%
} else {
%>
	<tr style="text-align: center;">
		<td style="font-size: 22px; background-image:url(../images/pic.jpg); background-size: 100%;">
		<br><br><br><br><br><br><br><br>
		어서오고~
		<br><br><br>
		로그인 하고 이용 ㄱㄱ;
		</td>
	</tr>
<%
}
%>
</table>
<%@ include file="guest_bottom.jsp" %>
</body>
</html>