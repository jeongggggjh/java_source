<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="ConnClass3" class="pack.ConnClass3"></jsp:useBean>
<%
// 입력자료를 전송 받아 insert하는 로직
request.setCharacterEncoding("utf-8");
// String sang = request.getParameter("sang"); <- 대신 폼빈 사용
// ...
%>
<jsp:useBean id="SangpumBean" class="pack.SangpumBean"></jsp:useBean>
<jsp:setProperty property="*" name="SangpumBean"/>
<%
// 수신 데이터 검증 필요...
%>
<jsp:useBean id="connClass3" class="pack.ConnClass3"></jsp:useBean>
<% 
connClass3.insertData(SangpumBean);

// 상품 추가 후 상품 목록보기로 이동
response.sendRedirect("jsp16paging.jsp");

// 주의 : 추가, 수정, 삭제 후 목록보기 할때는 forwarding 하지 않음.
// request.getRequestDispatcher("jsp16paging.jsp").forward(request, response);
%>