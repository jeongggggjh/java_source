<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="cartMgr" class="pack.order.CartMgr" scope="session" />
<jsp:useBean id="order" class="pack.order.OrderBean" />
<jsp:setProperty property="*" name="order"/>

<%
String orderFlag = request.getParameter("flag"); // 구매목록 보기, 수정, 삭제 판단용
String id = (String)session.getAttribute("idKey");

// out.print(order.getProduct_no() + ", 주문 수량 : " + order.getQuantity());

if(id == null) {
	response.sendRedirect("../member/login.jsp"); // 회원 로그인 안한 경우
} else {
	if(orderFlag == null) {
		// cart에 주문 상품 담기
		order.setId(id); // order : id, quantity, product_no
		cartMgr.addCart(order);
%>
		<script>
		alert("장바구니에 담음 ㅋㅋ");
		location.href = "cartlist.jsp"; // cart에 등록된 상품 목록 보기
		</script>
<%
	} else if(orderFlag.equals("update")) {
		order.setId(id);
		cartMgr.updateCart(order);
%>
		<script>
		alert("장바구니 내용 수정 ㅋㅋ");
		location.href = "cartlist.jsp";
		</script>
<%
	} else if(orderFlag.equals("del")) {
		cartMgr.deleteCart(order);
%>
		<script>
		alert("상품 주문 삭제 ㅋㅋ");
		location.href = "cartlist.jsp";
		</script>
<%		
	}
}
%>