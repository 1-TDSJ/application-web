<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<%@ include file="imports.jsp" %>
<title>IMAGENS</title>
</head>
<body>
	<%-- RECUPERANDO PARÂMETROS COM EL(Expression Language) --%>
	

	<div>
	
		<c:choose>
			<c:when test="${param.img_url != ''}">
				<figure>
					<img alt="" src="${param.img_url}">
				</figure>
			</c:when>
			<c:when test="${param.img_url == ''}">
				<jsp:forward page="img-nao-disponivel.html"/>
			</c:when>
		</c:choose>
		
	</div>
	<div>
		<a href="index.jsp">INÍCIO</a>
	</div>

	<%@ include file="rodape.jsp" %>
</body>
</html>