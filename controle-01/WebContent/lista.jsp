<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="./css/bootstrap.css">

<title>LISTAGEM</title>
</head>
<body>

	<header>
		<nav></nav>
	</header>
	<div></div>
	<section>

		<table class="table table-hover">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Dt Nasc</th>
				<th>Genêro</th>
				<th>Tel</th>
				<th colspan="3">Editar</th>
			</tr>

			<c:forEach var="cli" items="${listaCli}" varStatus="id">
				<tr>
					<td>${id.count}</td>
					<td>${cli.nome} ${cli.sobrenonme}</td>
					<td><f:formatDate value="${cli.dataNasc}" pattern="dd/MM/yyyy"/> </td>
					<c:choose>
						<c:when test="${cli.genero eq 'm'.charAt(0)}">
							<td>Masculino</td>
						</c:when>
						<c:when test="${cli.genero eq 'f'.charAt(0)}">
							<td>Feminino</td>
						</c:when>
						<c:otherwise>
							<td>Outros</td>
						</c:otherwise>
					</c:choose>
					<td>${cli.telefone}</td>
					<td><a href="update?id-cli=${cli.idCli}">Atualizar</a></td>
					<td><a href="excluir?id-cli=${cli.idCli}">Excluir</a></td>
				</tr>
			</c:forEach>

		</table>

	</section>
	<footer></footer>

	<script type="text/javascript" src="./js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.js"></script>

</body>
</html>




