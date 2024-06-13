<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = (String)session.getAttribute("idKey");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="../js/script.js"></script>

<script type="text/javascript">
window.onload = () => {
	document.querySelector("#btnLogin").addEventListener("click", funcLogin);
	document.querySelector("#btnNewMember").addEventListener("click", funcNewMember);
}
</script>
</head>
<body>
<%
if(id != null) { // 로그인 한 경우
%>
<!--  
	<b><%=id %></b> 어서오고 ~<p/>
	<a href="../guest/guest_index.jsp">[기능 사용 ㄱㄱ~]</a>
-->
	<script type="text/javascript">
		location.href="../guest/guest_index.jsp";
	</script>
	
	<a href="logout.jsp">로그아웃</a>
<%
} else { // 로그인 안한 경우
%>
	<form name="loginForm">
	<table>
		<tr>
			<td colspan="2">* 회원 로그인 *</td>
		</tr>
		<tr>
			<td>아이디 : </td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호 : </td>
			<td><input type="text" name="passwd"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="로 그 인" id="btnLogin">
				<input type="button" value="회원가입" id="btnNewMember">
			</td>
		</tr>
	</table>
	</form>
<%
}
%>
</body>
</html>