package br.com.fiap.xandao;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientController
 */
@WebServlet("/formulario-envio")
public class ClientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recurerando os parametros do formulario 
		String nomeCliente = request.getParameter("txtNome");
		String sobrenomeCliente = request.getParameter("txtSobrenome");
		String dataNascCliente = request.getParameter("txtDataNasc");
		String telefoneCliente = request.getParameter("numTelefone");
		String generoCliente = request.getParameter("txtGenero");
		
		System.out.print("Resultado: " + nomeCliente + sobrenomeCliente + dataNascCliente + telefoneCliente + generoCliente);
		
		Cliente cliente01 = new Cliente(nomeCliente, sobrenomeCliente, generoCliente ,dataNascCliente, telefoneCliente);
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cliente01);
		
		//Criar um atributo no request para que seja encaminhado para
		//o cliente na página indes.jsp, utilizamos o método
		//setAttribute(nomeDoATributo, o atributo em si que vai ser encaminhado)
		request.setAttribute("listaClienteNome", clientes.get(0).getNome() + " " + clientes.get(0).getSobrenome() );
		request.setAttribute("listaClienteDataNasc", clientes.get(0).getDataNasc());
		request.setAttribute("listaClienteTelefone", clientes.get(0).getTelefone());
		request.setAttribute("listaClienteGenero", clientes.get(0).getGenero());
		
		//Para criar o encaminhamento precisamos trabalhar com o dispatcher.
		//O dispatcher recebe o local para onde vai a requisição.
		//Passamos isso através do request, utilizando o metódo getRequestDispatcher(passando aqui uma URI ou URL)
		RequestDispatcher rd = request.getRequestDispatcher("lista.jsp");
		
		//Para que realmente ocorra o encaminhamento das informações
		//precisamos enviar tanto o request, quando o response, que possuem 
		//os dados que foram criados, aqui neste processo
		//Para faer isso utiiamos o método forward(passando o request e response)
		rd.forward(request, response);
		
		//Usamos o response (resposta) com o metodo sendRedirect(pagina.extensao)
		//para ele ser direcionado para a pagina que esta em parenteses
		response.sendRedirect("lista.jsp");
		
	}

}
