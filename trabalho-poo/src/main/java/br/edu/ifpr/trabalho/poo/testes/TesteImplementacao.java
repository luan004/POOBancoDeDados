package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;
import br.edu.ifpr.trabalho.poo.implementacao.TrabalhoTeste;
import br.edu.ifpr.trabalho.poo.interfacess.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.interfacess.IInserirDados;
import br.edu.ifpr.trabalho.poo.interfacess.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class TesteImplementacao {
	public static void main(String[] args) {
		ILeituraDeDados leitura = new TrabalhoTeste();
		IBuscaDeDados busca = new TrabalhoTeste();
		IInserirDados insercao = new TrabalhoTeste();
		Campus campus = leitura.lerDadosCampus();
		insercao.salvarCampus(campus);
		ArrayList<Campus> listaCampus = busca.buscarCampi();
		for (Campus c : listaCampus) {
			c.imprimirDados();
		}
	}
}