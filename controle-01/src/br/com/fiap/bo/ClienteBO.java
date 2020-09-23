package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bean.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class ClienteBO {
	
	private ClienteDAO cd = null;
	
	public List<Cliente> listarClientes() {
		
		cd = new ClienteDAO();
		cd.select();
		List<Cliente> listagem = new ArrayList<Cliente>();
		return listagem;
	}

	public boolean gravarCliente(Cliente cli) {
		return false;
	}

	public boolean atualizarCliente(Cliente cli) {
		return false;
	}

	
	public boolean excluirCliente(int idCli) {
		return false;
	}

}
