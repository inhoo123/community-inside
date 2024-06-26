<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
       <h2>posts</h2>
      <div>
      <c:forEach items="${post}" var="one">
      <a href= "${pageContext.servletContext.contextPath }/posts/view/${one.no}">[제목] ${one.title } </a>
      </c:forEach> 
       </div>
</body>
</html>