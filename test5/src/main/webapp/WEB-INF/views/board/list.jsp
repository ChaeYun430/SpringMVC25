<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="com.test.domain.BoardVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>#번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>수정일</th>
			</tr>
		</thead>

		<c:forEach var="boardVO" items="${list}">
			<tr>
				<td><c:out value="${boardVO.getBno}" /></td>
				<td><c:out value="${boardVO.getTitle}" /></td>
				<td><c:out value="${boardVO.getWriter}" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${board.regDate}" /></td>
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${board.updateDate}" /></td>
			</tr>
		</c:forEach>
	</table>
	
	<form action="select">
		수정할 게시물 번호 : <input name="choose" type="text"> 
		<input type="submit">
	</form>

</body>
</html>

