package visao;

import java.util.Scanner;
import controle.ControladorAgenda;

public class Principal {

    public static void main(String[] args) {
		ControladorAgenda controlador = new ControladorAgenda();
		Scanner scanner = new Scanner(System.in);
		boolean deveContinuar = true;
		int escolha;
		String menu = "\n1 para adicionar um novo contato à agenda\n"   +
					  "2 para remover um contato já existente\n"      +
					  "3 para atualizar um contato já existente\n"    +
					  "4 para listar todos os contatos cadastrados\n" +
					  "5 para sair do programa.";
    	System.out.println("====================Agenda com Banco de dados====================\n\n");
    	try{Thread.sleep(2000);} catch (InterruptedException e){}
		while (deveContinuar) {
			System.out.println(menu);
			System.out.print("Selecione uma opção: ");
			escolha = Integer.parseInt(scanner.nextLine());

			switch (escolha){
				case 1:
					//System.out.println("Adicionado!");
					Acoes.adicionarContato();
					break;
				case 2:
					//System.out.println("Removido");
					Acoes.removerContato();
					break;
				case 3:
					//System.out.println("Alterado");
					Acoes.atualizarContato();
					break;
				case 4:
					//System.out.println("Listado");
					Acoes.listarTodosOsContatosCadastrados();
					break;
				case 5:
					deveContinuar = false;
					break;
			}
		}
    }

}