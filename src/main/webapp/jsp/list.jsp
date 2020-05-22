<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
</head>
<body>

	<table>
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td>密码</td>
		</tr>	
		<c:forEach items="${list}" var="s">
			<tr>
				<td>${s.id}</td>
				<td>${s.name}</td>
				<td>${s.pwd}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>