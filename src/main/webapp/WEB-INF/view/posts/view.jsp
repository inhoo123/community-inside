<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${post.title }</title>
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath }/css/style.css?<%=System.currentTimeMillis() %>" />
</head>
<body>
<%@ include file="/WEB-INF/view/common/header.jsp"%>
<div>
		<div class="container px-1">
<<<<<<< Updated upstream
			<div style="text-align: left;">
				<span style="color: #3b4890; font-weight: 750;"><h2>${post.category }
						갤러리</h2></span>
				<hr width="100%" color="#3b4890" size="3">
				<p style="font-weight: 750;">${post.title }
				<p>
				<div style="text-align: right">
					<span style="color: #777"></span> <span>${writer.name}</span> | <small><span
						style="color: #777"></span> <span>${post.writedAt}</span></small> <span
						style="text-align: right;">조회</span> <span>${post.viewCount}</span>
					<span style="text-align: right;">추천</span> <span>${post.likes}</span>
=======
		<div style=text-align:left;>
	<span style="color: #3b4890;  font-weight: 750;"><h2>${post.category } 갤러리</h2></span>
	<hr width = "100%" color = "#3b4890" size = "3">
	<p style = "font-weight: 750;">${post.title }<p>
				<div style= text-align:right>
				<span style="color : #777"></span>  <span>${post.writerId}</span> | 
				<small><span style="color : #777"></span> <span>${post.writedAt}</span></small>
				<span style=text-align:right;>조회</span> <span>${post.viewCount}</span>
				<span style=text-align:right;>추천</span> <span>${post.likes}</span>
>>>>>>> Stashed changes
				</div>
				<hr style="border:0; height:1px; background: #bbb;">
			<div class = "top">
			<h3 style="text-align: left; margin-bottom:8px; 
				border-bottom: 1px solid #ccc; padding : 8px;">${ post.body}</h3>		
				</div>
			<div style="padding : 4px; text-align: right; ">
			</div>
<<<<<<< Updated upstream
			<div style="text-align: left;">
				<a href="${pageContext.servletContext.contextPath}/list"
					class="no-deco-link"><button>목록</button></a>
			</div>
			<p></p>
=======
		</div>
		<div style="text-align: left;">
			<a href="${pageContext.servletContext.contextPath}/list" class="no-deco-link"><button>목록</button></a>
			</div>
			<p>
					
			</p>
>>>>>>> Stashed changes
		<div style="text-align: right;">
			
			<c:choose>
<<<<<<< Updated upstream
				<c:when
					test="${post.writerId != null &&	post.writerId eq sessionScope.authUser.id }">
					<a
						href="${pageContext.servletContext.contextPath}/delete-handle?no=${post.no}"
						class="no-deco-link">
						<button>삭제</button>
					</a>
					<a
						href="${pageContext.servletContext.contextPath}/update"
						class="no-deco-link">
						<button>수정</button>
					</a>
				</c:when>
			</c:choose>
		</div>
		<p>전체 댓글</p>
		<hr width="100%" color="#3b4890" size="3">
		<div>
			<c:forEach items="${comments }" var="one">
				(${one.writerId})${one.body }
			</c:forEach>
		</div>
		<div class="comment-section">
			<form
				action="${pageContext.servletContext.contextPath}/submit-comment?postNo=${post.no}"
				method="post">
				<input type="hidden" name="postNo" value="${post.no }"/>
				<p style="border: 1px solid #ccc; padding: 12px;">
					<input name="password" type="password"
						style="padding: 6px 10px; width: 100px; border: 1px solid #ccc"
						placeholder="비밀번호" required />
				</p>
				<textarea style="padding: 6px 10px; height: 200px; width: 300px;"
					name="body"  placeholder="내용을 입력하세요" required></textarea>

				<button type="submit">보내기</button>
			</form>
		</div>
	</div>
		</div>

=======
				<c:when test="${post.writerId != null &&	post.writerId eq sessionScope.authUser.id }">
			<a href="${pageContext.servletContext.contextPath}delete-handle?no=${post.no}" class="no-deco-link">
				<button>삭제</button>
			</a>
			<a href="${pageContext.servletContext.contextPath}/update.jsp?no=${post.no}" class="no-deco-link">
				<button>수정</button>
			</a>
	</c:when>
	</c:choose>
		</div>
		</div>
		</div>
>>>>>>> Stashed changes
</body>
</html>