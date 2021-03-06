<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</head>
<body>
	<h1>게시판</h1>
	<table class="table table-striped">
	<thead>
	<tr>
	<th>글번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>작성일자</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${list}" var="lst">
	<tr>
	<td>${lst.idx}</td>
	<td>
	<a href="/board/view?bno=${lst.idx}">${lst.title}</a>
	</td>
	<td>${lst.writer}</td>
	<td>${lst.inserttime}</td>
	</tr>
	</c:forEach>
	</tbody>

	</table>

<button type="button" class="btn btn-light" onclick="location.href='http://localhost:8080/write'">글쓰기</button>

</body>
<script>


</script>
</html>