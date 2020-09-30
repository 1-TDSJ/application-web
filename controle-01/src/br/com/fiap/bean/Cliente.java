package br.com.fiap.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static final long serialVersionUID = 1L;
	
	private int idCli;
	private String nome;
	private String sobrenonme;
	private Date dataNasc;
	private char genero;
	private String telefone;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int idCli, String nome, String sobrenonme, Date dataNasc, char genero, String telefone) {
		super();
		this.idCli = idCli;
		this.nome = nome;
		this.sobrenonme = sobrenonme;
		this.dataNasc = dataNasc;
		this.genero = genero;
		this.telefone = telefone;
	}

	public int getIdCli() {
		return idCli;
	}

	public void setIdCli(int idCli) {
		this.idCli = idCli;
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

	public void setDataNasc(String dataNasc) throws ParseException {
		this.dataNasc = new SimpleDateFormat("yyyy-MM-dd").parse(dataNasc);
	}


	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
