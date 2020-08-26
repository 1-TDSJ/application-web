package br.fiap.xandao.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validacao
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
		String nomeImg = request.getParameter("uri-img");
		String caminhoImg = request.getParameter("url-img");
		String tamanhoImg= request.getParameter("wid-img");
		String titleImg = request.getParameter("title-img");
		String altImg= request.getParameter("alt-img");
		
		//Testar o caminho completo das imagens.
		//Concatenando e imprimindo os dados.
		System.out.println("PATH: " + caminhoImg + nomeImg+ titleImg + altImg);
	
		//Criar um atributo no request para que seja encaminhado para
		//o cliente na página indes.jsp, utilizamos o método
		//setAttribute(nomeDoATributo, o atributo em si que vai ser encaminhado)
		request.setAttribute("attrSrcImg", (caminhoImg+nomeImg));
		request.setAttribute("attrWidthImg", tamanhoImg);
		request.setAttribute("attrImgTitle", titleImg);
		request.setAttribute("attrAltImg", altImg);
		
		//Para criar o encaminhamento precisamos trabalhar com o dispatcher.
		//O dispatcher recebe o local para onde vai a requisição.
		//Passamos isso através do request, utilizando o metódo getRequestDispatcher(passando aqui uma URI ou URL)
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		//Para que realmente ocorra o encaminhamento das informações
		//precisamos enviar tanto o request, quando o response, que possuem 
		//os dados que foram criados, aqui neste processo
		//Para faer isso utiiamos o método forward(passando o request e response)
		rd.forward(request, response);
		
	}
}
