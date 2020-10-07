package br.com.fiap.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
@WebServlet(urlPatterns = { "/cliente", "/listagem", "/update", "/pagina"})

public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		switch (req.getRequestURI()) {
	
		case "/controle-01/cliente":
			inserirCliente(req, res);
			break;
			
		case  "/controle-01/listagem":
			listarCliente(req, res);
			break;

		case  "/controle-01/update":
			listarClienteById(req, res);
			break;
		
		case  "/controle-01/pagina":
			controlePaginacao(req, res);
			break;

		default:
			res.sendRedirect("erro404.jsp");
			break;
		}
	}
	
	//CONTROLE DE PÁGINAS
	public void controlePaginacao(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/"+req.getParameter("uri")).forward(req, res);
		
	}

	//INSERINDO CLIENTE
	public void inserirCliente(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//Recuperação dos dados do index.jsp
		Cliente cli = new Cliente();
		cli.setNome(req.getParameter("txtNm"));
		cli.setSobrenonme(req.getParameter("txtSnm"));
		try {
			cli.setDataNasc(new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("txtDtNasc")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cli.setGenero(req.getParameter("txtGen").charAt(0));
		cli.setTelefone(req.getParameter("txtTel"));
		
		//Instanciando a classe BO
		ClienteBO cb = new ClienteBO();
		boolean status = cb.gravarCliente(cli);
		
		if(status) {
			//Criando uma mensagem de SUCESSO.
			req.setAttribute("msgStatus", "Os dados foram gravados com sucesso!");
		}else {
			//Criando uma mensagem de ERRO.
			req.setAttribute("msgStatus", "Ocorreu um erro ao tentar gravar os dados.");
		}
		
		//Encaminhamento
		req.getRequestDispatcher("index.jsp").forward(req, res);
	}
	
	//LISTANDO CLIENTE
	public void listarCliente(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//Instanciar a classe BO
		ClienteBO cb = new ClienteBO();
		
		//Criando a lista de clientes
		List<Cliente> lista = cb.listarClientes();
		
		//Realizando a validação na lista.
		if(lista != null) {
			//Cria um atributo no request com a lista dos clientes.
			req.setAttribute("listaCli", lista);
			
			//Encaminhamento para a página lista.jsp em caso de sucesso.
			req.getRequestDispatcher("lista.jsp").forward(req, res);
		}else {
			//Cria um atributo no request com uma mensagem para o usuário.
			req.setAttribute("msgStatus", "Ocorreu um erro com a listagem.");
			
			//Encaminhamento para a página index.jsp em caso de erro.
			req.getRequestDispatcher("index.jsp").forward(req, res);
		}
		
	}
	
	//LISTANDO CLIENTE POR ID
	public void listarClienteById(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//Instanciando a classe BO
		ClienteBO cb = new ClienteBO();
		
		//Instanciar a classe cliente
		Cliente cli = cb.listarClientes(Integer.parseInt(req.getParameter("id-cli")));
		
		//Realizando a validação na lista.
		if(cli != null) {
			//Cria um atributo no request com o cliente.
			req.setAttribute("cliUpdate", cli);
			
			//Encaminhamento para a página lista.jsp em caso de sucesso.
			req.getRequestDispatcher("/WEB-INF/update.jsp").forward(req, res);
		}else {
			//Cria um atributo no request com uma mensagem para o usuário.
			req.setAttribute("msgStatus", "Ocorreu um erro com a seleçao desejada.");
			
			//Encaminhamento para a página index.jsp em caso de erro.
			req.getRequestDispatcher("index.jsp").forward(req, res);
		}
		
	}
	
	//ATUALIZANDO CLIENTE
	public void atualizarCliente(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
	}
	
}
































