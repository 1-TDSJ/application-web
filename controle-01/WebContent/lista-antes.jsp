<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List"%>
<%@ page import="br.com.fiap.bean.Cliente"%>


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
	
	<!-- Agora vamos trabalhar com Scriptlets, que é parecido com a EXPRESSION
		porém ele não possui o sinal de =
	-->
	<% 
		//Scriptlets
		//E você pode criar código JAVA nesta área.
		String nome = "Alexandre";
	%>
	
	
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Dt Nasc</th>
				<th>Genêro</th>
				<th>Tel</th>
				<th>Editar</th>
			</tr>
		
		<%
			List<Cliente> listagem = (List<Cliente>)request.getAttribute("listaCliente");
			int count = 1;
			for(Cliente cli : listagem){
				out.println("<tr>");
				out.println("<td>"+ count +"</td>");
				out.println("<td>"+ cli.getNome() + " " + cli.getSobrenonme()+"</td>");
				out.println("<td>"+ cli.getDataNasc() +"</td>");
				
				if(cli.getGenero() == 'm'){
					out.println("<td>Masculino</td>");
				}else if(cli.getGenero() == 'f'){
					out.println("<td>Feminino</td>");
				}else if(cli.getGenero() == 'o'){
					out.println("<td>Outros</td>");
				}
				
				out.println("<td>"+ cli.getTelefone() +"</td>");
				out.println("<td><a href=editar?id-cli="+ count +">Editar</a></td>");
				out.println("</tr>");
				count++;
			}
		%>			
		</table>
	
	</section>
	<footer></footer>

	<script type="text/javascript" src="./js/jquery-3.5.1.min.js"></script>
	<script type="text/javascript" src="./js/bootstrap.js"></script>

</body>
</html>




