<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Inicio</title>
	<link href ="./bootstrap-4.1.3-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
	<body>
		<header> 
			<nav class="navbar navbar-light bg-light" > 
				<a href="index.jsp" class="navbar-brand"> INICIO </a>
				<a href="montador?uri-img=um.jpg&url-img=./img/&wid-img=200px&title-img=numero1&alt-img=imagem do numero um" class="nav-item nav-link"> IMG-1 </a>
				<a href="montador?uri-img=dois.jpg&url-img=./img/&wid-img=200px&title-img=numero2&alt-img=imagem do numero dois" class="nav-item nav-link"> IMG-2 </a>
				<a href="montador?uri-img=tres.jpg&url-img=./img/&wid-img=200px&title-img=numero3&alt-img=imagem do numero tres" class="nav-item nav-link"> IMG-3 </a>
				<a href="montador?uri-img=quatro.jpg&url-img=./img/&wid-img=200px&title-img=numero4&alt-img=imagem do numero quatro" class="nav-item nav-link"> IMG-4 </a>
				<a href="montador?uri-img=cinco.jpg&url-img=./img/&wid-img=200px&title-img=numero5&alt-img=imagem do numero cinco" class="nav-item nav-link"> IMG-5 </a>
			</nav> 
		</header> 
		<div></div> 
		<section> 
			<figure> 
				<img alt="<%= request.getAttribute("attrAltImg")%>" width="<%= request.getAttribute("attrWidthImg") %>" title="<%= request.getAttribute("attrImgTitle") %>" src="<%= request.getAttribute("attrSrcImg") %>"> 
				<figcaption><%= request.getAttribute("attrAltImg")%></figcaption> 
			</figure> 
		</section> 
		<footer></footer>
		<script src="./bootstrap-4.1.3-dist/js/jquery-3.5.1.js"></script>
		<script src="./bootstrap-4.1.3-dist/js/bootstrap.js"></script>
	</body>
</html>