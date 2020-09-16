<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INTEGRAÇÃO</title>
</head>
<body>
		
		<h1>EXEMPLO INTEGRAÇÃO</h1>
		
		<p><a href="exemplo?nome=Alexandre&loginUser=1">LINK</a></p>
		
		<div>
			<h2>Atributo da Servlet : ${param.texto}</h2>
		</div>	
		
		<div>
			${pageContext.setAttribute("tipoUsuario","Admin")}
			<h2>Contexto de página : ${pageContext.getAttribute("tipoUsuario")}</h2>
		</div>
		
		<div>
			<h2>Contexto de aplicação : ${login}</h2>
		</div>
		
		<div>	<h2>LOGIN</h2>
				<p><a href=exemplo?nome=Alexandre&loginUser=1>LOGIN</a></p>
		</div>
		<div>	<h2>LOGOUT</h2>
				<p><a href=exemplo?nome=Alexandre&loginUser=0>LOGOUT</a></p>
		</div>
		
		<div>
			<h2>Contexto de SESSÃO</h2>
			<div>
				<p>Username : ${userName}</p>
				<p>Id da sessão : ${idSession}</p>
				
				<script type="text/javascript">
					
					for(var x = 0; x < 1000; x++){
						console.log("Valor inatividade : " + /${inatividade});
					}
				
				</script>
				
			</div>
		</div>
		
		
		
		
</body>
</html>