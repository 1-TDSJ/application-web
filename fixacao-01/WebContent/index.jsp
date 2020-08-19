<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css" type="text/css">

<script type="text/javascript">

	document.querySelector("a[target]");
	document.querySelector("h1,h2").style.backgroundColor = "red";

</script>
<title>INICIO</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-light bg-light">
			<a href="index.jsp" class="navbar-brand">INICIO</a>
			<a href="montador?uri-img=um.jpg&url-img=./img/&wid-img=400px" class="nav-item nav-link">IMG-1</a>
			<a href="montador?uri-img=dois.jpg&url-img=./img/&wid-img=400px" class="nav-item nav-link">IMG-2</a>
			<a href="montador?uri-img=tres.jpg&url-img=./img/&wid-img=400px" class="nav-item nav-link">IMG-3</a>
			<a href="montador?uri-img=quatro.jpg&url-img=./img/&wid-img=400px" class="nav-item nav-link">IMG-4</a>
			<a href="montador?uri-img=cinco.jpg&url-img=./img/&wid-img=400px" class="nav-item nav-link">IMG-5</a>
		</nav>
	</header>
	<div></div>
	<section>
		<figure>
			<img alt="" width="<%=request.getAttribute("attrWidthImg")%>" title="" src="<%=request.getAttribute("attrSrcImg")%>">
			<figcaption></figcaption>
		</figure>
	</section>
	<footer></footer>
	<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	
</body>
</html>