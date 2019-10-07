package controle;

import java.util.ArrayList;

import modelo.Curso;
import modelo.Instrutor;

public class Gerenciador {

	private ArrayList<Instrutor> instrutores;

	public Gerenciador() {

		instrutores = new ArrayList<>();
	}

	public void adicionarInstrutor(Instrutor instrutor) {
		instrutores.add(instrutor);
		System.out.println("Instrutor e curso adicionado com sucesso");
	}

	public boolean verificarSeIdExiste(int id) {
		for (int i = 0; i < instrutores.size(); i++) {
			if (instrutores.get(i).getCurso().getId() == id) {
				return true;
			}
		}

		return false;
	}

	public void buscarCursos(int id) {
		if (verificarSeIdExiste(id) == false) {
			System.out.println("Curso não encontrado!");
		} else {
			for (int i = 0; i < instrutores.size(); i++) {
				if (instrutores.get(i).getCurso().getId() == id) {
					System.out.println("********************************************");
					System.out.println("*                                           *");
					System.out.println("*             Curso Encontrado              *");
					System.out.println("*                                           *");
					System.out.println("*********************************************");
					System.out.println("Curso: " + instrutores.get(i).getCurso().getNome() + "\nId: "
							+ instrutores.get(i).getCurso().getId() + "\nData de Início: "
							+ instrutores.get(i).getCurso().getDatainicio() + "\nData de Término: "
							+ instrutores.get(i).getCurso().getDatatermino());
					break;
				}
			}

		}
	}

	public void atualizarCursos(int id, String nomeCurso, String datainicio, String datatermino) {

		for (int i = 0; i < instrutores.size(); i++) {
			if (instrutores.get(i).getCurso().getId() == id) {
				instrutores.get(i).getCurso().setNome(nomeCurso);
				instrutores.get(i).getCurso().setDatainicio(datainicio);
				instrutores.get(i).getCurso().setDatatermino(datatermino);
				System.out.println("Curso atualizado com sucesso!");
				break;

			} else {
				System.out.println("Curso não encontrado, tente outro!");
			}
		}
	}

	public void listarCursos() {

		for (int i = 0; i < instrutores.size(); i++) {
			if (instrutores.get(i).getCurso() != null) {
				System.out.println("Nome do curso: " + instrutores.get(i).getCurso().getNome());
				System.out.println("Data de inicio: " + instrutores.get(i).getCurso().getDatainicio());
				System.out.println("Data de termino: " + instrutores.get(i).getCurso().getDatatermino());
				System.out.println(instrutores.get(i).getNome());
				System.out.println("======================================================================");
			}
		}
	}

	public void removerCurso(int id) {
		for (int i = 0; i < instrutores.size(); i++) {
			if (instrutores.get(i).getCurso().getId() == id) {
				instrutores.get(i).setCurso(null);
				System.out.println("Curso removido com sucesso!");
			}
		}
	}

}
