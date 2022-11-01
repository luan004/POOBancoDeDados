package br.edu.ifpr.trabalho.poo.modelo;

import br.edu.ifpr.trabalho.poo.campus.Campus;

public class Curso {

	private String nome;
	private String duracao;
	private String modalidade;
	private Campus campus;
	
	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

}
