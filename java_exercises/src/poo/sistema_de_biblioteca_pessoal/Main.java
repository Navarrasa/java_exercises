package poo.sistema_de_biblioteca_pessoal;
import java.util.List;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(null, null, null);

        int opcao;

        do {
            System.out.println("\n====== MENU DA BIBLIOTECA ======");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Adicionar Cliente");
            System.out.println("3 - Emprestar Livro");
            System.out.println("4 - Devolver Livro");
            System.out.println("5 - Listar Livros Disponíveis");
            System.out.println("6 - Listar Livros Emprestados");
            System.out.println("7 - Buscar Livro por Título");
            System.out.println("8 - Visualizar Dados do Cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID (ISBN) do livro: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();

                    Livro novoLivro = new Livro(id, titulo, autor);
                    biblioteca.adicionarLivro(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Digite o email do cliente: ");
                    String emailCliente = scanner.nextLine();

                    Cliente novoCliente = new Cliente(nomeCliente, emailCliente);
                    biblioteca.adicionarCliente(novoCliente);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o ID do livro a emprestar: ");
                    int idEmprestimo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o email do cliente: ");
                    String emailEmprestimo = scanner.nextLine();

                    boolean emprestado = biblioteca.emprestarLivro(idEmprestimo, emailEmprestimo);
                    if (emprestado) {
                        Livro livroEmprestado = biblioteca.buscarLivroPorId(idEmprestimo);
                        Cliente clienteEmprestimo = biblioteca.buscarClientePorEmail(emailEmprestimo);
                        if (livroEmprestado != null && clienteEmprestimo != null) {
                            clienteEmprestimo.adicionarLivroEmprestado(livroEmprestado.getName());
                        }
                        System.out.println("Livro emprestado com sucesso!");
                    } else {
                        System.out.println("Erro ao emprestar o livro.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID do livro a devolver: ");
                    int idDevolucao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o email do cliente: ");
                    String emailDevolucao = scanner.nextLine();

                    boolean devolvido = biblioteca.devolverLivro(idDevolucao, emailDevolucao);
                    if (devolvido) {
                        Livro livroDevolvido = biblioteca.buscarLivroPorId(idDevolucao);
                        Cliente clienteDevolucao = biblioteca.buscarClientePorEmail(emailDevolucao);
                        if (livroDevolvido != null && clienteDevolucao != null) {
                            clienteDevolucao.removerLivroEmprestado(livroDevolvido.getName());
                        }
                        System.out.println("Livro devolvido com sucesso!");
                    } else {
                        System.out.println("Erro ao devolver o livro.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Livros Disponíveis ---");
                    List<Livro> disponiveis = biblioteca.listarLivrosDisponiveis();
                    for (Livro l : disponiveis) {
                        l.exibirDados();
                    }
                    break;

                case 6:
                    System.out.println("\n--- Livros Emprestados ---");
                    List<Livro> emprestados = biblioteca.listarLivrosEmprestados();
                    for (Livro l : emprestados) {
                        l.exibirDados();
                    }
                    break;

                case 7:
                    System.out.print("Digite um termo de busca no título: ");
                    String termo = scanner.nextLine();
                    List<Livro> resultados = biblioteca.buscarLivrosPorTitulo(termo);
                    if (resultados.isEmpty()) {
                        System.out.println("Nenhum livro encontrado com esse título.");
                    } else {
                        for (Livro l : resultados) {
                            l.exibirDados();
                        }
                    }
                    break;

                case 8:
                    System.out.print("Digite o email do cliente: ");
                    String emailBusca = scanner.nextLine();
                    Cliente c = biblioteca.buscarClientePorEmail(emailBusca);
                    if (c != null) {
                        c.visualizarDadosCliente();
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
