<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="../css/board.css">
<script type="text/javascript">
function check() {
	if(frm.id.value === "" || frm.pwd.value === "") {
		alert("왜 입력 안 해유;;")
		return;
	}
	frm.submit();
}
</script>
</head>
<body>
<form action="adminlogin.jsp" name="frm" method="post">
<table style="width: 100%;">
	<tr>
		<td>
		<%
		String sessionValue = (String)session.getAttribute("adminOk");
		if(sessionValue != null) {
		%>
			이미 로그인 했음 ㅋㅋ ㅅㄱ <br><br>
			<a href="admilogout.jsp">[로그아웃]</a>
			<a href="javascript:window.close()">[창닫기]</a>
		<%	
		} else {
		%>
			<table style="width: 100%;">
				<tr>
					<td>id : <input type="text" name="id"></td>
				</tr>
				<tr>
					<td>pwd : <input type="text" name="pwd"></td>
				</tr>
				<tr>
					<td>
						<a href="#" onclick="check()">[로그인]</a>
						<a href="javascript:window.close()">[창닫기]</a>
					</td>
				</tr>
			</table>
		<% 
		}
		%>
		</td>
	</tr>
</table>
</form>
</body>
</html>