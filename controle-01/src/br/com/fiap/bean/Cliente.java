package br.com.fiap.bean;

import java.util.Date;

public class Cliente {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenonme;
	private Date dataNasc;
	private char genero;
	private long telefone;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String sobrenonme, Date dataNasc, char genero, long telefone) {
		super();
		this.nome = nome;
		this.sobrenonme = sobrenonme;
		this.dataNasc = dataNasc;
		this.genero = genero;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenonme() {
		return sobrenonme;
	}

	public void setSobrenonme(String sobrenonme) {
		this.sobrenonme = sobrenonme;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
