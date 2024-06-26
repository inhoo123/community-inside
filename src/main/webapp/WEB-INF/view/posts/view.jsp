<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath }/css/style.css?<%=System.currentTimeMillis() %>" />
<body>
	<%@ include file="/WEB-INF/view/common/header.jsp"%>
	<h2>${post.title }</h2>
	<p>${post.body }</p>

	<!-- 댓글 작성 폼 -->
	<h3>댓글 작성</h3>
	<form
		action="${pageContext.servletContext.contextPath }/submit-comment"
		method="post">
		 <input type="hidden" name="postNo" value="${post.no }">
		<label for="comment">댓글:</label><br>
		<textarea name="body" rows="4" cols="50" required></textarea>
		<br> <br> <input type="password" name="password">
		<button type="submit">등록</button>
	</form>

	<!-- 기존 댓글 목록 -->
   <h3>댓글</h3>
	<c:forEach var="comment" items="${comments}">
		<div>
			<a href="${pageContext.servletContext.contextPath }/comment-handle"></a> <strong>${comment.writerId}:</strong>
								 <p>${comment.body}</p>
		</div>
	</c:forEach>

</body>
</html>
