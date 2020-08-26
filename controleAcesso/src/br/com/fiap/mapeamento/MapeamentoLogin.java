package br.com.fiap.mapeamento;

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
public class MapeamentoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapeamentoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("FALA CARAI");
		String emailCorreto = "gsb@gfunk.com";
		String senhaCorreta = "aaa";
		
		String emailUsuario = "";
		String nomeSenha = "";
		
		emailUsuario = request.getParameter("txtEmail");
		nomeSenha = request.getParameter("txtSenha");
		
		while(true) {
			if(emailCorreto.equalsIgnoreCase(emailUsuario) && senhaCorreta.equalsIgnoreCase(nomeSenha)) {
				response.sendRedirect("resultado.html");
				break;
			}
			else {
				response.sendRedirect("login.html");
				System.out.println("LOGIN INCORRETO");
				break;
			}
		}
	}

}
