package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuildAction
 */
@WebServlet("/montador")
public class BuildAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuildAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//Recuperando os parâmetros que estão no Request
		//Utilizamos o método getParameter(nomeDoCampo)
		String nomeImg    = request.getParameter("uri-img");
		String caminhoImg = request.getParameter("url-img");
		String tamanhoImg = request.getParameter("wid-img");
		
		//Testar o caminho completo das imagens
		//Concatenando e imprimindo os dados.
		System.out.println("PATH : " + caminhoImg+nomeImg);
		
		//Criar um atributo no request para que este seja encaminhado para
		// o cliente na página index.jsp, utilizamos o método
		// setAttribute(nomeDoAtributo,o atributo em si que vai ser encaminhado)
		request.setAttribute("attrSrcImg", (caminhoImg+nomeImg));
		request.setAttribute("attrWidthImg", tamanhoImg);
		
		//Para criar o o encaminhamento precisamos trabalhar com o dispatcher.
		//O dispatcher recebe o local para onde vai a requesição.
		//Passamos isso através do request, utilzando o método getRequestDispatcher(passando aqui uma URI ou URL)
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		//Para que realmente ocorra o encaminhamento das informações
		// precisamos enviar tanto o request, quando o response, que possuem
		// os dados que foram criados aqui neste processo.
		//Para fazer isso utilizamos o método forward(passando o request e response).
		rd.forward(request, response);
		
	}
}
