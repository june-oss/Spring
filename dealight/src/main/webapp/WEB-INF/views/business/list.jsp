<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매장 리스트</title>
</head>
<body>
<h1>Business List Page</h1>
<h2>${userId}</h2>
<h2><a href="/business/register">등록하기</a></h2>
<c:forEach items="${storeList}" var="store">
============================================
	<h2>매장 이름 : <c:out value="${store.storeNm}" /></h2>
	<h2>매장 전화번호 : <c:out value="${store.telno}" /></h2>
	<h2>매장 소유자 아이디 : <c:out value="${store.bstore.buserId}" /></h2>
	<h2>매장 영업 시작 시간 : <c:out value="${store.bstore.openTm}" /></h2>
	<h2>매장 영업 종료 시간 : <c:out value="${store.bstore.closeTm}" /></h2>
	
============================================
</c:forEach>
</body>
</html>