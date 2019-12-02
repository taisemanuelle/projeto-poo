package execucao;

import java.util.Scanner;

import controle.Gerenciador;
import modelo.Curso;
import modelo.Instrutor;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Curso curso;
		String nomeCurso,datainicio,datatermino;
		int id;
		 
		Instrutor instrutor;
		String nomeInstrutor, email;
	    Gerenciador gerenciador = new Gerenciador();
      
        int opcao = 0;
        
        do {
        	System.out.println("***********Bem vindo**************************");
        	System.out.println("*          Op��es                           *");
        	System.out.println("*    1 - Adicionar instrutor e curso        *");
        	System.out.println("*     2 - Listar cursos                     *");
        	System.out.println("*     3 - Buscar curso                      *");
        	System.out.println("*   4 - Atualizar curso                     *");
        	System.out.println("*      5 - remover                          *");
        	System.out.println("*        0 - sair                           *");
        	System.out.println("*********************************************");
        		opcao = teclado.nextInt();
        	switch (opcao) {

			case 1:
				teclado.nextLine();
				System.out.println("Informe o nome do instrutor: ");
				nomeInstrutor = teclado.nextLine();

				System.out.println("Informe o e-mail: ");
				email = teclado.nextLine();

				System.out.println("Informe o curso: ");
				nomeCurso = teclado.nextLine();

				System.out.println("Informe o id: ");
				id = teclado.nextInt();

				System.out.println(teclado.nextLine());
				System.out.println("Informe data de inicio: ");
				datainicio = teclado.nextLine();

				System.out.println("Informe data de conclus�o: ");
				datatermino = teclado.nextLine();

				curso = new Curso(id, nomeCurso, datainicio, datatermino);

				instrutor = new Instrutor(nomeInstrutor,email,curso);

				gerenciador.adicionarInstrutor(instrutor);
				break;

			case 2:

				teclado.nextLine();
				System.out.println("Listar");
				gerenciador.listarCursos();
				break;

			case 3:

				System.out.println("Buscar Curso");
				System.out.println("Informe id do curso: ");
				id = teclado.nextInt();	
				gerenciador.buscarCursos(id);
				break;

			case 4: 

				teclado.nextLine();
				System.out.println("Atualizar Curso");

				System.out.println("Informe a id do curso que deseja atualizar:");
				id = teclado.nextInt();

				if(gerenciador.verificarSeIdExiste(id) == false)
				 {
					System.out.println("Curso n�o emcontrado");
					break;
				}

				System.out.println("Informe um novo curso: ");
				teclado.nextLine();
				nomeCurso = teclado.nextLine();	

				System.out.println("Informe uma nova data de in�cio: ");
				datainicio = teclado.nextLine();
				//teclado.nextLine();
				
				System.out.println("Informe uma nova data de t�rmino: ");
				datatermino = teclado.nextLine();

				gerenciador.atualizarCursos(id,nomeCurso,datainicio,datatermino);					
				break;				

			case 5:
			
				teclado.nextLine();
				System.out.println("Informe a id do curso que deseja remover: ");
				id = teclado.nextInt();
				if(gerenciador.verificarSeIdExiste(id) == false) {
					System.out.println("Curso n�o encontrado");
					break;
				}
				gerenciador.removerCurso(id);
				break;
			default:
				
				break;
			}
        	
		} 
		while (opcao != 0);
        teclado.close();
	}
}
