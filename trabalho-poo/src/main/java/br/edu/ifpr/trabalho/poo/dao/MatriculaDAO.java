package br.edu.ifpr.trabalho.poo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class MatriculaDAO {

	public static Matricula lerDadosMatricula() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o ra da matricula:");
		String ra = teclado.nextLine();
		System.out.println("Informe a data da matricula:");
		String data = teclado.nextLine();
		
		System.out.println("Informe a situação da matricula (EM BOOLEAN \"true\" OU \"false\")");
		boolean situacao = teclado.nextBoolean();
		
		
		System.out.println("Informe o código da turma");
		int idTurma = teclado.nextInt();
		
		Turma turma = new Turma();
		turma.setIdTurma(idTurma);
		
		System.out.println("Informe o código do aluno");
		int IdPessoa = teclado.nextInt();
		
		Aluno aluno = new Aluno();
		aluno.setIdPessoa(IdPessoa);
		
		Matricula matricula = new Matricula(ra, data, situacao, turma, aluno);
		return matricula;
	}
	
	public ArrayList<Matricula> buscarMatriculas() {
		ArrayList<Matricula> listaDeMatriculas = new ArrayList<Matricula>();
		String SQL = "SELECT * FROM tb_matricula";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				
				Matricula matricula = new Matricula();
				matricula.setIdMatricula(resultado.getInt("id_matricula"));
				matricula.setRa(resultado.getString("ra"));
				matricula.setData(resultado.getString("data"));
				matricula.setSituacao(resultado.getBoolean("situacao"));
				listaDeMatriculas.add(matricula);
				
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeMatriculas;
	}
	
	public void salvarMatricula(Matricula matricula) {
		String SQL = "INSERT INTO tb_matricula (id_matricula, ra, data, situacao, fk_turma, fk_aluno) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setInt(1, matricula.getIdMatricula());
			preparacaoDaInstrucao.setString(1, matricula.getRa());
			preparacaoDaInstrucao.setString(2, matricula.getData());
			preparacaoDaInstrucao.setBoolean(3, matricula.getSituacao());
			preparacaoDaInstrucao.setInt(4, matricula.getTurma().getIdTurma());
			preparacaoDaInstrucao.setInt(5, matricula.getAluno().getIdPessoa());
			
			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	// Transformacao
	public Matricula transformarResultSetEmObjeto(ResultSet resultSet) throws SQLException {
		Matricula matricula = new Matricula();
		try {
			matricula.setIdMatricula(resultSet.getInt("id_matricula"));
			matricula.setRa(resultSet.getString("ra"));
			matricula.setData(resultSet.getString("data"));
			matricula.setSituacao(resultSet.getBoolean("situacao"));
			return matricula;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar");
		}

	}


}
