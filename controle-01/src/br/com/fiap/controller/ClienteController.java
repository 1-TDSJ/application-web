package br.com.fiap.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Cliente;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet(
		description = "Controle de requests e parametrização.", 
		urlPatterns = { 
				"/cliente", 
				"/listar"
		})
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static List<Cliente> lista = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        
        //Verificando se a lista está vazia
        //Caso esteja, vai implementar o ArrayList do tipo Cliente e
        // popular alguns registros.
        if(lista == null) {
        	lista = new ArrayList<Cliente>();
        	Cliente cli = new Cliente();
        	cli.setNome("Alexandre");
        	cli.setSobrenonme("Carlos");
        	//Realizando a formatação da Data de Nascimento
        	Calendar c = Calendar.getInstance();
        	SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        	try {
				c.setTime(sf.parse("27/Dez/1975"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
        	cli.setDataNasc(c.getTime());
        	//Realizando a formatação da Data de Nascimento
        	cli.setGenero('m');
        	cli.setTelefone(1178985623);
        	//Por fim adicionando na lista
        	lista.add(cli);
        	
        	//NOVO REGISTRO
        	cli = new Cliente();
        	cli.setNome("Pedro");
        	cli.setSobrenonme("André");
        	//Realizando a formatação da Data de Nascimento
        	c = Calendar.getInstance();
        	sf = new SimpleDateFormat("dd/MM/yyyy");
        	try {
				c.setTime(sf.parse("12/Jan/1974"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
        	cli.setDataNasc(c.getTime());
        	//Realizando a formatação da Data de Nascimento
        	cli.setGenero('m');
        	cli.setTelefone(1178985623);
        	//Por fim adicionando na lista
        	lista.add(cli);

        	//NOVO REGISTRO
        	cli = new Cliente();
        	cli.setNome("Marina");
        	cli.setSobrenonme("Mink");
        	//Realizando a formatação da Data de Nascimento
        	c = Calendar.getInstance();
        	sf = new SimpleDateFormat("dd/MM/yyyy");
        	try {
				c.setTime(sf.parse("23/Mar/1982"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
        	cli.setDataNasc(c.getTime());
        	//Realizando a formatação da Data de Nascimento
        	cli.setGenero('m');
        	cli.setTelefone(1178985623);
        	//Por fim adicionando na lista
        	lista.add(cli);
        	
        }
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}











