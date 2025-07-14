<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri ="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html><html><head><meta charset="UTF-8"><title>boardUpdate</title>
</head>
<body>
<form name = "updateForm" action = "board/list">
<table border = "1">
<tr>
<th>#번호</th>
<td><input name = "bnoF" type = "text" value ="${selectedBoard.getBno()}" readonly></td>
</tr>
<tr>
<th>제목</th>
<td><input name = "titleF" type = "text" value ="${selectedBoard.getTitle()}"></td>
</tr>
<tr>
<th>내용</th>
<td><input name = "contentF" type = "text" value ="${selectedBoard.getContent()}"></td>
</tr>
<tr>
<th>작성자</th>
<td><input name = "writerF" type = "text" value ="${selectedBoard.getMemberVO.getName()}" readonly></td>
</tr>
<tr>
<th>작성일</th>
<td><fmt:formatDate pattern="yyyy-MM-dd" value="${selectedBoard.getRegiDate()}"/></td>
</tr>
<tr>
<th>수정일</th>
<td><fmt:formatDate pattern="yyyy-MM-dd" value="${selectedBoard.getUpdaDate()}"/></td>
</tr>		
</table>
<button type = "submit" value = "수정완료"></button>
</form>
</body>
</html>