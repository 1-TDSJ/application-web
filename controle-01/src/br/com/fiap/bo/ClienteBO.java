package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.bean.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class ClienteBO {
	
	private ClienteDAO cd = null;
	
	public List<Cliente> listarClientes() {
		cd = new ClienteDAO();
		return cd.select();
	}

	public Cliente listarClientes(int idCli) {
		cd = new ClienteDAO();
		return cd.select(idCli);
	}
	
	public boolean gravarCliente(Cliente cli) {
		cd = new ClienteDAO();
		
		//RN-01 = Verificar nome cliente.
		if(verificaNome(cli.getNome())) {
			return cd.insert(cli);
		}else {
			return false;
		}
		
		
	}

	public int atualizarCliente(Cliente cli) {
		cd = new ClienteDAO();
		return cd.update(cli);
	}
	
	public int apagarCliente(int idCli) {
		cd = new ClienteDAO();
		return cd.delete(idCli);
	}

	public boolean verificaNome(String nome) {
		System.out.println("Esse é o nome que foi passado : " + nome);
		return true;
	}
	
	
}
