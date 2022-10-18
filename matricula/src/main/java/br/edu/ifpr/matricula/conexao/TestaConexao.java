package br.edu.ifpr.matricula.conexao;

import java.util.ArrayList;

import br.edu.ifpr.acessar.bancodados.CampusDAO;

public class TestaConexao {

	public static void main(String[] args) {
		if (Conexao.getConexao() != null) {
			System.out.println("Conectou no banco");
		} else {
			System.out.println("Erro ao conectar o BD");
		}
		
		CampusDAO campusDAO = new CampusDAO();
		
		ArrayList<Campus> listaCampus = campusDAO.listar();
		
		for (Campus campus : listaCampus) {
			System.out.println(campus.getNome());
		}
	}

}
