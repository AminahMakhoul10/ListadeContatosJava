
public class Principal {

	public static void main(String[] args) {
		        ListaContatos listaContatos = new ListaContatos();
		        boolean sair = false;

		        while (!sair) {
		            listaContatos.exibirMenu();

		            System.out.print("Digite a opção desejada: ");
		            int opcao = listaContatos.scanner.nextInt();
		            listaContatos.scanner.nextLine();

		            switch (opcao) {
		                case 1:
		                    listaContatos.criarContato();
		                    break;
		                case 2:
		                    listaContatos.listarContatos();
		                    break;
		                case 3:
		                    listaContatos.editarContato();
		                    break;
		                case 4:
		                    listaContatos.excluirContato();
		                    break;
		                case 5:
		                    listaContatos.entrarEmContato();
		                    break;
		                case 6:
		                    sair = true;
		                    System.out.println("Saindo...");
		                    break;
		                default:
		                    System.out.println("Opção inválida. Tente novamente.\n");
		                    System.out.println("PROGRAMA ENCERRADO");
		                    System.out.println("SE DESEJA REPETIR, RODE O PROGRAMA NOVAMENTE");
		            }
		        }
		}

	}
