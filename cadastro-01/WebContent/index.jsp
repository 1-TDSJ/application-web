<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
<link href ="./bootstrap-4.1.3-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
	<header>
		<nav></nav>
	</header>
	<div></div>
	<section class= "container">
		<form class= "form-horizontal" action="formulario-envio" method= "POST">
			<div class= "form-group">
				<label class="control-label col-sm-2" for="nome">Nome: </label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="txtNome" id="nome" placeholder="Digite o seu Nome"> 					
				</div>
			</div>
			<div class="form-group"> 
				<label class="control-label col-sm-2" for="sobrenome">Sobrenome:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="txtSobrenome" id="sobrenome" placeholder="Digite o seu sobrenome">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-4 col-form-label" for="data-nasc">Data de nascimento:</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="txtDataNasc" id="data-nasc" placeholder="DD/MM/AAAA">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-4 col-form-label" for="telefone">Telefone: </label>
				<div class="col-sm-4">
					<input type="number" class="form-control" name="numTelefone" id="telefone">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2" for="genero"> Genero: </label>
				  <div class="col-sm-4">
				    <input type="text" class="form-control" name="txtGenero" id="genero"> 
				</div>
			</div>
			<button type="submit" class="btn btn-outline-primary btn-lg">Enviar</button>
		</form>
	</section>
	<footer>
	
	</footer>
	<script src="./bootstrap-4.1.3-dist/js/jquery-3.5.1.js"></script>
	<script src="./bootstrap-4.1.3-dist/js/bootstrap.js"></script>
</body>
</html>