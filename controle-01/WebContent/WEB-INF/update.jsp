<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="snnipet/libs/imports-head.jsp" %>
<title><f:message key="site.paginas.update.titulo"/></title>
</head>
<body>

<%@ include file="snnipet/menu/menu-header.html" %>
	
	<section>
		<form action="cli-update" method="post">
			<input type="hidden" name="txtIdCli" value="${cliUpdate.idCli}">
			<fieldset>
				<legend><f:message key="site.paginas.update.titulo"/></legend>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idNm"><f:message key="site.paginas.update.form.campo.nome"/></label>
					<div class="col-sm-10">
						<input type="text" name="txtNm" id="idNm"
							placeholder='<f:message key="site.paginas.update.form.campo.placeholder.nome"/>' required="required"
							class="form-control" value="${cliUpdate.nome}">
					</div> 
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idSnm"><f:message key="site.paginas.update.form.campo.sobrenome"/></label>
					<div class="col-sm-10">
						<input type="text" name="txtSnm" id="idSnm"
							placeholder='<f:message key="site.paginas.update.form.campo.placeholder.sobrenome"/>' required="required"
							class="form-control" value="${cliUpdate.sobrenonme}">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idDtNasc"><f:message key="site.paginas.update.form.campo.dt_nasc"/></label>
					<div class="col-sm-10">
						<input type="date" name="txtDtNasc" id="idDtNasc"
							required="required" class="form-control" value='<f:formatDate value="${cliUpdate.dataNasc}" pattern="yyyy-MM-dd"/>' pattern="dd/mm/yyyy" >
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idGen"><f:message key="site.paginas.update.form.campo.genero"/></label>
					<div class="col-sm-10">
						<select name="txtGen" id="idGen" required="required"
							class="form-control">
							<option value="0" selected="selected"><f:message key="site.paginas.update.form.select.option.sel"/></option>
					<c:choose>
						<c:when test="${cliUpdate.genero eq 'm'.charAt(0)}">
							<option value="m" selected="selected"><f:message key="site.paginas.update.form.select.option.m"/></option>
							<option value="f"><f:message key="site.paginas.update.form.select.option.f"/></option>
							<option value="o"><f:message key="site.paginas.update.form.select.option.o"/></option>
						</c:when>
						<c:when test="${cliUpdate.genero eq 'f'.charAt(0)}">
							<option value="m"><f:message key="site.paginas.update.form.select.option.m"/></option>
							<option value="f" selected="selected"><f:message key="site.paginas.update.form.select.option.f"/></option>
							<option value="o"><f:message key="site.paginas.update.form.select.option.o"/></option>
						</c:when>		
						<c:otherwise>
							<option value="m"><f:message key="site.paginas.update.form.select.option.m"/></option>
							<option value="f"><f:message key="site.paginas.update.form.select.option.f"/></option>
							<option value="o" selected="selected"><f:message key="site.paginas.update.form.select.option.o"/></option>
						</c:otherwise>
					</c:choose>
							
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="idTel"><f:message key="site.paginas.update.form.campo.telefone"/></label>
					<div class="col-sm-10">
						<input type="tel" name="txtTel" id="idTel"
							placeholder='<f:message key="site.paginas.update.form.campo.placeholder.telefone"/>' required="required"
							class="form-control" value="${cliUpdate.telefone}">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-info btn-lg"><f:message key="site.paginas.update.form.botao.atualizar"/></button>
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