<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/snnipet/libs/imports-head.jsp" %>
<title><f:message key="site.paginas.index.titulo"/></title>
</head>
<body>

<%@ include file="/WEB-INF/snnipet/menu/menu-header.html" %>
	
	<h2>${param.msgStatus}</h2> 		
	
	<section>
		<form action="cliente" method="post">
			<fieldset>
				<legend><f:message key="site.paginas.index.form.legenda"/></legend>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idNm"><f:message key="site.paginas.index.form.campo.nome"/></label>
					<div class="col-sm-10">
						<input type="text" name="txtNm" id="idNm"
							placeholder='<f:message key="site.paginas.index.form.campo.placeholder.nome"/>' required="required"
							class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idSnm"><f:message key="site.paginas.index.form.campo.sobrenome"/></label>
					<div class="col-sm-10">
						<input type="text" name="txtSnm" id="idSnm"
							placeholder='<f:message key="site.paginas.index.form.campo.placeholder.sobrenome"/>' required="required"
							class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idDtNasc"><f:message key="site.paginas.index.form.campo.dt_nasc"/></label>
					<div class="col-sm-10">
						<input type="date" name="txtDtNasc" id="idDtNasc"
							required="required" class="form-control">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idGen"><f:message key="site.paginas.index.form.campo.genero"/></label>
					<div class="col-sm-10">
						<select name="txtGen" id="idGen" required="required"
							class="form-control">
							<option value="0" selected="selected"><f:message key="site.paginas.index.form.select.option.sel"/></option>
							<option value="m"><f:message key="site.paginas.index.form.select.option.m"/></option>
							<option value="f"><f:message key="site.paginas.index.form.select.option.f"/></option>
							<option value="o"><f:message key="site.paginas.index.form.select.option.o"/></option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idTel"><f:message key="site.paginas.index.form.campo.telefone"/></label>
					<div class="col-sm-10">
						<input type="tel" name="txtTel" id="idTel"
							placeholder='<f:message key="site.paginas.index.form.campo.placeholder.telefone"/>' required="required"
							class="form-control">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-success btn-lg"><f:message key="site.paginas.index.form.botao.cadastrar"/></button>
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