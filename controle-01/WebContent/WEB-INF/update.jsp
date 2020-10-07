<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="./css/bootstrap.css">
<title>UPDATE-CLIENTE</title>
</head>
<body>

	<header>
		<nav>
			<ul class="nav justify-content-center">
				<li class="nav-link active"><a href="index.jsp">Início</a></li>
				<li class="nav-link"><a href="listagem">Lista de Clientes</a></li>
			</ul>
		</nav>
	</header>
	
	<section>
		<form action="cliente" method="post">
			<fieldset>
				<legend>Atualizar Dados</legend>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idNm">Nome</label>
					<div class="col-sm-10">
						<input type="text" name="txtNm" id="idNm"
							placeholder="Digite seu nome" required="required"
							class="form-control" value="${cliUpdate.nome}">
					</div> 
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idSnm">Sobrenome</label>
					<div class="col-sm-10">
						<input type="text" name="txtSnm" id="idSnm"
							placeholder="Digite seu sobrenome" required="required"
							class="form-control" value="${cliUpdate.sobrenonme}">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idDtNasc">Data
						de Nascimento</label>
					<div class="col-sm-10">
						<input type="date" name="txtDtNasc" id="idDtNasc"
							required="required" class="form-control" value='<f:formatDate value="${cliUpdate.dataNasc}" pattern="yyyy-MM-dd"/>' pattern="dd/mm/yyyy" >
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idGen">Gênero</label>
					<div class="col-sm-10">
						<select name="txtGen" id="idGen" required="required"
							class="form-control">
							<option value="0" selected="selected">Selecione uma	Opção</option>
					<c:choose>
						<c:when test="${cliUpdate.genero eq 'm'.charAt(0)}">
							<option value="m" selected="selected">Masculino</option>
							<option value="f">Feminino</option>
							<option value="o">Outros</option>
						</c:when>
						<c:when test="${cliUpdate.genero eq 'f'.charAt(0)}">
							<option value="m">Masculino</option>
							<option value="f" selected="selected">Feminino</option>
							<option value="o">Outros</option>
						</c:when>		
						<c:otherwise>
							<option value="m">Masculino</option>
							<option value="f">Feminino</option>
							<option value="o" selected="selected">Outros</option>
						</c:otherwise>
					</c:choose>
							
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idTel">Telefone</label>
					<div class="col-sm-10">
						<input type="tel" name="txtTel" id="idTel"
							placeholder="Digite seu telefone" required="required"
							class="form-control" value="${cliUpdate.telefone}">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-info btn-lg">ATUALIZAR</button>
					</div>
				</div>
			</fieldset>
		</form>
	</section>
	<footer></footer>
	<script type="text/javascript" src="./js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.js"></script>
</body>
</html>