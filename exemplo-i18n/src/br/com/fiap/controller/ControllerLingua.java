package br.com.fiap.controller;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

/**
 * Servlet implementation class ControllerLingua
 */
@WebServlet("/change")
public class ControllerLingua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLingua() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Criando a variável que vai receber o parâmetro que foi a escolha do
		//usuário ou seja, o locale a ser determinado para o sistema e para o usuário.
		//Obs: Locale é igual á : pt-br,en,en-US,de,fr,es,jp, etc;
		String language = req.getParameter("lingua");
		
		//Setando o locale selecionado pelo usuário.
		Locale locale = new Locale(language);
		
		//Alterando o locale do sistema.
		Config.set(req.getSession(), Config.FMT_LOCALE, locale);
		//Alterando o locale do usuário.
		Config.set(req.getSession(), Config.FMT_FALLBACK_LOCALE, locale);
		
		//Redirecionando o usuário para a página que iniciou o request.
		resp.sendRedirect("index.jsp?lingua="+locale);
	}

}







