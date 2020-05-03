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
					  "5 para saber mais dados sobre um contato (com o ID)\n" +
					  "6 para sair do programa.";
    	System.out.println("====================Agenda com Banco de dados====================\n");
		while (deveContinuar) {
			System.out.println(menu);
			System.out.print("Selecione uma opção: ");
			try {
				escolha = Integer.parseInt(scanner.nextLine());

				switch (escolha) {
					case 1:
						Acoes.adicionarContato();
						break;
					case 2:
						Acoes.removerContato();
						break;
					case 3:
						Acoes.atualizarContato();
						break;
					case 4:
						Acoes.listarTodosOsContatosCadastrados();
						break;
					case 5:
						Acoes.getContato();
						break;
					case 6:
						deveContinuar = false;
						controlador.fecharConexao();
						break;
					default:
						System.out.println("Digite uma opção válida!");
				}
			}
			catch (NumberFormatException e){
				System.out.println("Digite apenas números!");
			}
		}
    }

}