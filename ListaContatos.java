import java.util.Scanner;
import java.util.ArrayList;

public class ListaContatos {
	
	    private ArrayList<Contato> contatos;
	    Scanner scanner;

	    public ListaContatos() {
	        contatos = new ArrayList<>();
	        scanner = new Scanner(System.in);
	    }

	    public void exibirMenu() {
	        System.out.println("*========= LISTA DE CONTATOS =========*");
	        System.out.println("1. Criar novo contato");
	        System.out.println("2. Listar contatos");
	        System.out.println("3. Editar contato");
	        System.out.println("4. Excluir contato");
	        System.out.println("5. Entrar em um contato");
	        System.out.println("0. Sair");
	        System.out.println("*========================================*");
	    }

	    public void criarContato() {
	        System.out.println("=== Criar novo contato ===");

	        System.out.print("Nome: ");
	        String nome = scanner.nextLine();

	        System.out.print("Telefone pessoal: ");
	        String telefone = scanner.nextLine();

	        System.out.print("Contato de emergência (S/N): ");
	        String emergenciaStr = scanner.nextLine();
	        boolean emergencia = emergenciaStr.equalsIgnoreCase("S");

	        Contato contato = new Contato(nome, telefone, emergencia);
	        contatos.add(contato);

	        System.out.println("Contato criado com sucesso!\n");
	    }

	    public void listarContatos() {
	        System.out.println("=== Lista de contatos ===");
	        for (int i = 0; i < contatos.size(); i++) {
	            Contato contato = contatos.get(i);
	            System.out.println((i + 1) + ". " + contato.getNome() + " - " + contato.getTelefonePessoal());
	        }
	        System.out.println();
	    }

	    public void editarContato() {
	        System.out.println("=== Editar contato ===");
	        listarContatos();

	        System.out.print("Digite o número do contato que deseja editar: ");
	        int numeroContato = scanner.nextInt();
	        scanner.nextLine();

	        if (numeroContato >= 1 && numeroContato <= contatos.size()) {
	            Contato contato = contatos.get(numeroContato - 1);

	            System.out.print("Novo nome (ou deixe em branco para manter o atual): ");
	            String novoNome = scanner.nextLine();
	            if (!novoNome.isEmpty()) {
	                contato = new Contato(novoNome, contato.getTelefonePessoal(), contato.isContatoEmergencia());
	                contatos.set(numeroContato - 1, contato);
	            }

	            System.out.print("Novo telefone (ou deixe em branco para manter o atual): ");
	            String novoTelefone = scanner.nextLine();
	            if (!novoTelefone.isEmpty()) {
	                contato = new Contato(contato.getNome(), novoTelefone, contato.isContatoEmergencia());
	                contatos.set(numeroContato - 1, contato);
	            }

	            System.out.println("Contato editado com sucesso!\n");
	        } else {
	            System.out.println("Número de contato inválido.\n");
	        }
	    }

	    public void excluirContato() {
	        System.out.println("=== Excluir contato ===");
	        listarContatos();

	        System.out.print("Digite o número do contato que deseja excluir: ");
	        int numeroContato = scanner.nextInt();
	        scanner.nextLine();

	        if (numeroContato >= 1 && numeroContato <= contatos.size()) {
	            contatos.remove(numeroContato - 1);
	            System.out.println("Contato excluído com sucesso!\n");
	        } else {
	            System.out.println("Número de contato inválido.\n");
	        }
	    }

	    public void entrarEmContato() {
	        System.out.println("=== Entrar em um contato ===");
	        listarContatos();

	        System.out.print("Digite o número do contato com o qual deseja entrar em contato: ");
	        int numeroContato = scanner.nextInt();
	        scanner.nextLine();

	        if (numeroContato >= 1 && numeroContato <= contatos.size()) {
	            Contato contato = contatos.get(numeroContato - 1);

	            System.out.println("Entrando em contato com: " + contato.getNome());

	            System.out.print("Digite o número do telefone ou 'C' para chamar outro contato: ");
	            String numeroTelefone = scanner.nextLine();

	            if (numeroTelefone.equalsIgnoreCase("C")) {
	                entrarEmContato();
	            } else {
	                System.out.println("Realizando ligação para: " + numeroTelefone);
	                
	            }
	        } else {
	            System.out.println("Número de contato inválido.\n");
	        }
	    }
		 private void realizarLigacao(Contato contato) {
		        System.out.println("Realizando ligação para " + contato.getNome() + " - " + contato.getTelefonePessoal());
		    }

		  
		
	}



