package br.edu.ifpr.trabalho.poo.testes;



import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.dao.CampusDAO;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class TesteConexaoCampus {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        CampusDAO campusDAO = new CampusDAO();
        System.out.println("Nome do campus");
        String nome = teclado.nextLine();
        System.out.println("Endereço do campus");
        String endereco = teclado.nextLine();
        System.out.println("Cidade do campus");
        String cidade = teclado.nextLine();

        Campus campus = new Campus();
        campus.setNome(nome);
        campus.setEndereco(endereco);
        campus.setCidade(cidade);

        campusDAO.salvarCampus(campus);

        ArrayList<Campus> listaCampus = campusDAO.buscarCampi();

        for (Campus c : listaCampus) {
            System.out.println(c.getNome());
        }

        teclado.close();
    }
}