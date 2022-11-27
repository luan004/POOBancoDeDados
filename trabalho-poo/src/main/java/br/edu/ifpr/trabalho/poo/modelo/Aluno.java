package br.edu.ifpr.trabalho.poo.modelo;

public class Aluno extends Pessoa {
	
	private int anoIngresso;
	
	
	public Aluno() {
		
	}
	
	public Aluno(int idPessoa, String nome, String cpf, String telefone, String endereco, String dataNascimento, int anoIngresso) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.anoIngresso = anoIngresso;
	}
	

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	

}
