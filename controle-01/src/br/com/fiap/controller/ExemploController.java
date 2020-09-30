package br.com.fiap.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Cliente;
import br.com.fiap.bo.ClienteBO;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet(description = "Controle de requests e parametrização.", urlPatterns = { "/exemploController" })
public class ExemploController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<Cliente> lista = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExemploController() {
		super();

		// Verificando se a lista está vazia
		// Caso esteja, vai implementar o ArrayList do tipo Cliente e
		// popular alguns registros.
		if (lista == null) {
			lista = new ArrayList<Cliente>();
			Cliente cli = new Cliente();
			cli.setNome("Alexandre");
			cli.setSobrenonme("Carlos");
			// Realizando a formatação da Data de Nascimento
			Calendar c = Calendar.getInstance();
			SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				c.setTime(sf.parse("27/12/1975"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			cli.setDataNasc(c.getTime());
			// Realizando a formatação da Data de Nascimento
			cli.setGenero('m');
			cli.setTelefone("1178985623");
			// Por fim adicionando na lista
			lista.add(cli);

			// NOVO REGISTRO
			cli = new Cliente();
			cli.setNome("Pedro");
			cli.setSobrenonme("André");
			// Realizando a formatação da Data de Nascimento
			c = Calendar.getInstance();
			sf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				c.setTime(sf.parse("12/01/1974"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			cli.setDataNasc(c.getTime());
			// Realizando a formatação da Data de Nascimento
			cli.setGenero('m');
			cli.setTelefone("1178985623");
			// Por fim adicionando na lista
			lista.add(cli);

			// NOVO REGISTRO
			cli = new Cliente();
			cli.setNome("Marina");
			cli.setSobrenonme("Mink");
			// Realizando a formatação da Data de Nascimento
			c = Calendar.getInstance();
			sf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				c.setTime(sf.parse("23/03/1982"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			cli.setDataNasc(c.getTime());
			// Realizando a formatação da Data de Nascimento
			cli.setGenero('m');
			cli.setTelefone("1178985623");
			// Por fim adicionando na lista
			lista.add(cli);

		}

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getRequestURI().equals("/controle-01/cliente")) {
			try {
				// Recebendo os dados do cliente via request e adicionando em um Bean.
				// Criar a estância da classe Cliente para receber os dados.
				Cliente cli = null;
				// Cria o objeto e adiciona os dados.
				cli = new Cliente();
				cli.setNome(request.getParameter("txtNm"));
				cli.setSobrenonme(request.getParameter("txtSnm"));
				// ************************FORMATANDO A DATA*************
				Calendar c = Calendar.getInstance();
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				c.setTime(sf.parse(request.getParameter("txtDtNasc")));
				cli.setDataNasc(c.getTime());
				// ************************FORMATANDO A DATA*************
				cli.setGenero(request.getParameter("txtGen").charAt(0));
				cli.setTelefone(request.getParameter("txtTel"));

				// Adicionando na lista
				// lista.add(cli);
				
				//Invalidando o request anterior
				request.logout();
				
				// Agora vamos enviar o Objeto para a classe BO
				ClienteBO cb = new ClienteBO();
				
				if(cb.gravarCliente(cli)) {
					//request.setAttribute("msgStatus", "Dados gravados com sucesso!");
					//Criando redirecionamento caso os dados tenhan sido gravados.
					response.sendRedirect("index.jsp?msgStatus=Dados gravados com sucesso!");
				}else {
					//request.setAttribute("msgStatus", "Ocorreu um erro!");
					//Criando redirecionamento caso tenha ocorrido algum erro.
					response.sendRedirect("index.jsp?msgStatus=Ocorreu um erro!");
				}
								
				// Adicionando a lista em um atributo no request.
				//request.setAttribute("listaCliente", lista);

				// *************CRIANDO O ENCAMINHAMENTO*****************//
				// Criando o dispatcher
				//RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

				// Realizando o encaminhamento do request e response para a URI/URL
				//rd.forward(request, response);

				// *************CRIANDO O ENCAMINHAMENTO*****************//

			} catch (ParseException e) {
				e.printStackTrace();
				response.sendRedirect("excecao.jsp");
			}
		}
	}

}
