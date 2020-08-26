<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista-Tabela</title>
		<link href ="./bootstrap-4.1.3-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
	</head>
	<body>
	<header>
		<nav></nav>
	</header>
	<div></div>
	<section>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Nome</th>
					<th scope="col">Dt Nasc</th>
					<th scope="col">Genêro</th>
					<th scope="col">Tel</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row"> 1 </th>
					<th> <%= request.getAttribute("listaClienteNome") %> </th>
					<th> <%= request.getAttribute("listaClienteDataNasc") %> </th>
					<th> <%= request.getAttribute("listaClienteGenero") %></th>
					<th> <%= request.getAttribute("listaClienteTelefone") %></th>				
				</tr>
			</tbody>
		</table>
	</section>
	<footer></footer>
	<script src="./bootstrap-4.1.3-dist/js/jquery-3.5.1.js"></script>
	<script src="./bootstrap-4.1.3-dist/js/bootstrap.js"></script>
	</body>
</html>