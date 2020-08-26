package br.com.fiap.xandao;

public class Cliente {
	String nome;
	String sobrenome;
	String genero;
	String dataNasc;
	String telefone;
	
	public Cliente () {
	
	}
	
	public Cliente(String nome, String sobrenome, String genero, String dataNasc, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.genero = genero;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
