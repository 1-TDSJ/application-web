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
		//System.out.println("Ol� mundo!");
		
		/**
		 * Bloco de Processamento dos par�metros
		 * 
		 */
			
		//Vari�veis para armazenar os par�metros do FORM.
		String emailUsuario = "";
		String senhaUsuario = "";
		
		emailUsuario = request.getParameter("txtEmail");
		senhaUsuario = request.getParameter("txtSenha");
		
		System.out.println("Email usu�rio :" + emailUsuario);
		System.out.println("Senha usu�rio :" + senhaUsuario);
		
		/**
		 * Bloco de Processamento dos par�metros
		 * 
		 */
		
		//Redirecionamento
		response.sendRedirect("sucesso.html");
		
		
	}


}
