<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<label>스토어 이름</label> <input name="storeNm" value="<c:out value='${storeNm}'/>"><br>
<label>전화번호</label> <input name="telno"><br>
<label>오픈시간</label> <input name="openTm"><br>
<label>종료시간</label> <input name="closeTm"><br>
<label>가게 소개</label> <textarea rows="3" name="storeIntro"></textarea><br>
<label>가게휴무일</label> <input name="hldy"><br>
<label>가게 평균 식사 시간</label> <input name="avgMealTm"><br>
<label>1인석 테이블 개수</label> <input name="n1SeatNo"><br>
<label>2인석 테이블 개수</label> <input name="n2SeatNo"><br>
<label>4인석 테이블 개수</label> <input name="n4SeatNo">
</body>
</html>