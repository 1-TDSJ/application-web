<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	
	<%@ include file="imports.jsp" %>
	
	
<title>EXEMPLO</title>
</head>
<body>

	<header>
		<nav class="nav">
			<ul>
				<li class="nav-item"><a href="info.jsp?img_url=./img/jsp-1.png">IMG-1</a></li>
				<li class="nav-item"><a href="info.jsp?img_url=./img/jsp-2.jpg">IMG-2</a></li>
				<li class="nav-item"><a href="info.jsp?img_url=./img/jsp-3.png">IMG-3</a></li>
			</ul>
		</nav>
	</header>
	
	<%@ include file="rodape.jsp" %>
</body>
</html>