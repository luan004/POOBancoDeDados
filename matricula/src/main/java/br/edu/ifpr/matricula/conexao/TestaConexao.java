package br.edu.ifpr.matricula.conexao;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.acessar.bancodados.CampusDAO;

public class TestaConexao {

	public static void main(String[] args) {
		
//		if (Conexao.getConexao() != null) {
//			System.out.println("Conectou no banco");
//		} else {
//			System.out.println("Erro ao conectar o BD");
//		}
//		
		Scanner teclado = new Scanner(System.in);
		
		CampusDAO campusDAO = new CampusDAO();
		System.out.print("Informe o nome do campus: ");
		String nome = teclado.nextLine();
		System.out.print("Informe o endereco: ");
		String endereco = teclado.nextLine();
		System.out.print("Informe a cidade: ");
		String cidade = teclado.nextLine();
		
		Campus campus = new Campus();
		campus.setNome(nome);
		campus.setCidade(cidade);
		campus.setEndereco(endereco);
		
		//campusDAO.salvarCampus(campus);
		
		ArrayList<Campus> listaCampus = campusDAO.listar();
		
		for (Campus c : listaCampus) {
			System.out.println(c.getNome());
		}
	}

}
