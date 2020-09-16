package br.com.fiap.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ExemploServlet
 */
@WebServlet("/exemplo")
public class ExemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExemploServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Contexto de Sess�o/Usu�rio
		//Criando a Sess�o do usu�rio se n�o existir
		HttpSession sessao = request.getSession();
		
		//Controlando a inatividade do usu�rio
		//sessao.setMaxInactiveInterval(10);
		
		//Controlando a sess�o do usu�rio atrav�s de par�metros
		if(request.getParameter("loginUser").equals("0") ) {
			sessao.invalidate();
			//response.sendRedirect("principal.jsp");
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}
		
		//Contexto da Servlet/Aplica��o
		ServletContext ctx = getServletContext();
		ctx.setAttribute("login", "Thiago");
		
		//Respons�vel por escrever o HTML 
		PrintWriter pw = response.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>EXEMPLO HTML SERVLET</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Ol� SERVLET</h1>");

		//Recuperando o ID da sess�o do USU�RIO e imprimindo seu valor.
		pw.println("<h2>Valor da sess�o : "+ sessao.getId() +"<h2>");
		
		//Adicionando um atributo na sess�o do usu�rio
		sessao.setAttribute("userName", ctx.getAttribute("login"));
		//Adicionando mais um atributo na sess�o do usu�rio
		sessao.setAttribute("idSession", sessao.getId());
		//Adicionando mais um atributo na sess�o do usu�rio
		sessao.setAttribute("inatividade", sessao.getMaxInactiveInterval());
		
		//Retorna o valor de inatividade
		pw.println("<h2>Inatividade : "+ sessao.getMaxInactiveInterval() +"<h2>");
				
		//Recuperando o Username do USU�RIO que est� na sess�o.
		pw.println("<h2>Username : "+ sessao.getAttribute("userName") +"<h2>");

		
		//Recuperando o par�metro do JSP e imprimindo seu valor.
		pw.println("<h2>Valor do par�metro : "+ request.getParameter("nome") +"<h2>");
						
		//Recuperando o atributo do contexto da Servlet
		pw.println("<h2>Valor do atributo : "+ ctx.getAttribute("login") +"<h2>");
		pw.println("<p><a href='principal.jsp?texto=exemplo'>LINK</a></p>");
		
		pw.println("</body>");
		pw.println("</html>");
		
		
		
	}

}
