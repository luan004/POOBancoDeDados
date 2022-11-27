package br.edu.ifpr.matricula.testes;

import br.edu.ifpr.trabalho.poo.dao.CampusDAO;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class TestaConexao {

	public static void main(String[] args) {
		
		CampusDAO campusDAO = new CampusDAO();
		Campus campus = campusDAO.lerDadosCampus();

		campusDAO.salvarCampus(campus);
		
		campusDAO.buscarCampi();

	}

}
