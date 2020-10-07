<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/snnipet/libs/imports-head.jsp" %>
<title>CADASTRO</title>
</head>
<body>

<%@ include file="/WEB-INF/snnipet/menu/menu-header.html" %>
	
	<h2>${param.msgStatus}</h2> 		
	
	<section>
		<form action="cliente" method="post">
			<fieldset>
				<legend>Cadastro de Clientes</legend>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idNm">Nome</label>
					<div class="col-sm-10">
						<input type="text" name="txtNm" id="idNm"
							placeholder="Digite seu nome" required="required"
							class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idSnm">Sobrenome</label>
					<div class="col-sm-10">
						<input type="text" name="txtSnm" id="idSnm"
							placeholder="Digite seu sobrenome" required="required"
							class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idDtNasc">Data
						de Nascimento</label>
					<div class="col-sm-10">
						<input type="date" name="txtDtNasc" id="idDtNasc"
							required="required" class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idGen">Gênero</label>
					<div class="col-sm-10">
						<select name="txtGen" id="idGen" required="required"
							class="form-control">
							<option value="0" selected="selected">Selecione uma
								Opção</option>
							<option value="m">Masculino</option>
							<option value="f">Feminino</option>
							<option value="o">Outros</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idTel">Telefone</label>
					<div class="col-sm-10">
						<input type="tel" name="txtTel" id="idTel"
							placeholder="Digite seu telefone" required="required"
							class="form-control">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-success btn-lg">CADASTRAR</button>
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