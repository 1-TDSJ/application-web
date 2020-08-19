package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/validacao")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Msg inicial
		//System.out.println("Olá mundo!");
		
		/**
		 * Bloco de Processamento dos parâmetros
		 * 
		 */
			
		//Variáveis para armazenar os parâmetros do FORM.
		String emailUsuario = "";
		String senhaUsuario = "";
		
		emailUsuario = request.getParameter("txtEmail");
		senhaUsuario = request.getParameter("txtSenha");
		
		System.out.println("Email usuário :" + emailUsuario);
		System.out.println("Senha usuário :" + senhaUsuario);
		
		/**
		 * Bloco de Processamento dos parâmetros
		 * 
		 */
		
		//Redirecionamento
		response.sendRedirect("sucesso.html");
		
		
	}


}
