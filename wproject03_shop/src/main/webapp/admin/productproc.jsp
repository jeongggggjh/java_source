<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="productMgr" class="pack.product.ProductMgr"/>
<%
request.setCharacterEncoding("utf-8");

String flag = request.getParameter("flag");
boolean result = false;

if(flag.equals("insert")) {
	result = productMgr.insertProduct(request);
} else if(flag.equals("update")) {
	result = productMgr.updateProduct(request);
} if(flag.equals("delete")) {
	result = productMgr.deleteProduct(request.getParameter("no"));
} else {
	response.sendRedirect("productmanager.jsp");
}

if(result) {
%>
	<script>
		alert("처리됐음 ㅋㅋ");
		location.href = "productmanager.jsp";
	</script>
<%
} else {
%>
	<script>
		alert("오류 ㅅㄱ ㅋㅋ");
		location.href = "productmanager.jsp";
	</script>
<%	
}
%>

