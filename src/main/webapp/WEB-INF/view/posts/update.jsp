<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>열린공간 | 동네도서관</title>
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath }/css/style.css?<%=System.currentTimeMillis() %>" />
</head>
<body>
	<%@ include file="/WEB-INF/view/common/header.jsp"%>
	<div style="width: 840px; margin: 0 auto;">
		<h2>글 수정하기</h2>
		<p style="text-align: right">
			수정 &gt; <span style="color: hotpink;"></span>
		</p>
		<form >
			<input type="hidden" name="no" value=" "/>
			<table style="border-collapse: collapse; width: 100%">
				<tr>
					<td
						style="border: 1px solid #ccc; padding: 12px; text-align: center; background-color: #eee"><span
						style="color: red">*</span>작성자</td>
					<td style="border: 1px solid #ccc; padding: 12px;"></td>
				</tr>
				<tr>
					<td
						style="border: 1px solid #ccc; padding: 12px; text-align: center; background-color: #eee"><span
						style="color: red">*</span>제목</td>
					<td style="border: 1px solid #ccc; padding: 12px;"><input
						name="title" type="text" value=" "
						style="padding: 6px 10px; width: 500px; border: 1px solid #ccc" /></td>
				</tr>
				<tr>
					<td style="border: 1px solid #ccc; padding: 12px;" colspan="2">
						<textarea name="body" 
							style="height: 200px; resize : none; 
							width: 100%; box-sizing: border-box; padding: 6px 10px; border: 1px solid #ccc"> </textarea>
					</td>
				</tr>
			</table>
			<div style="text-align: center; margin-top: 20px;">
				<button type="submit" style="padding: 10px 20px;">변경</button>
				<button type="reset" style="padding: 10px 20px;">취소</button>
			</div>
		</form>
	</div>
</body>
</html>