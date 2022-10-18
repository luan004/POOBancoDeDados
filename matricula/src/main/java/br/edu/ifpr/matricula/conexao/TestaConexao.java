package br.edu.ifpr.matricula.conexao;

public class TestaConexao {

	public static void main(String[] args) {

		try {
			Conexao.getConexao();
			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
