package poo.sistema_de_biblioteca_pessoal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {
    private final List<Livro> livros;
    private final List<Cliente> clientes;
    private final List<Emprestimo> emprestimos;


    public Biblioteca(List<Livro> livros, List<Cliente> clientes, List<Emprestimo> emprestimos) {
        this.livros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }


    // Métodos para gerenciamento de livros
    // Adiciona um livro com base nas características passadas
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }


    // A ideia de retornar um boolean em um método como
    //  removerLivro(int id) é para informar se a remoção foi bem-sucedida ou não.
    public boolean removerLivro(int idLivro) {
        return livros.removeIf(livro -> livro.getIdISBN() == idLivro);
    }


    // busca livros através do atributo .isEmprestado, que retorna um boolean (true/false)
    // se false, retorna os livros disponiveis.
    public List<Livro> listarLivrosDisponiveis(){
        List<Livro> resultado = new ArrayList<>();

        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                resultado.add(livro);
            }
        }
        return resultado;
    }


    // busca livros através do atributo .isEmprestado, que retorna um boolean (true/false)
    // se true, retorna os livros emprestados.
    public List<Livro> listarLivrosEmprestados(){
        List<Livro> resultado = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.isEmprestado()) {
                resultado.add(livro);
            }
        }
        return resultado;
    }


    // busca livros por um termo, que será inserido no .contains(), que funciona como
    // uma busca inteligente por nome
    public List<Livro> buscarLivrosPorTitulo(String termoBusca) {
        List<Livro> resultado = new ArrayList<>();
        String buscaLower = termoBusca.toLowerCase();

        for (Livro livro : livros) {
            if (livro.getName().toLowerCase().contains(buscaLower)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }


    // busca livros por um termo, que será inserido no .contains(), que funciona como
    // uma busca inteligente por nome do autor
    public List<Livro> buscarLivrosPorAutor(String termoBusca) {
        List<Livro> resultado = new ArrayList<>();
        String buscaLower = termoBusca.toLowerCase();

        for (Livro livro : livros) {
            if (livro.getAuthor().toLowerCase().contains(buscaLower)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }


    public Livro buscarLivroPorId(int id_ISBN) {
        for (Livro livro : livros) {
            if (livro.getIdISBN() == id_ISBN) {
                return livro;  // livro encontrado
            }
        }
        return null;  // livro não encontrado
    }


    // Método para gerenciamento de clientes
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }


    public Cliente buscarClientePorEmail(String emailCliente){
        for (Cliente cliente : clientes){
            if (Objects.equals(cliente.getEmail(), emailCliente)){
                return cliente;
            }
        }
        return null;
    }


    // Método para gerenciar os empréstimos
    public Emprestimo buscarEmprestimoAtivo(int id_ISBN, String emailCliente) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getIdISBN() == id_ISBN &&
                    emprestimo.getCliente().getEmail().equals(emailCliente)) {
                return emprestimo; // encontrou empréstimo ativo
            }
        }
        return null; // não encontrou
    }


    public boolean emprestarLivro(int id_ISBN, String emailCliente) {
        Livro livro = buscarLivroPorId(id_ISBN);
        Cliente cliente = buscarClientePorEmail(emailCliente);

        if (livro == null || cliente == null) {
            return false; // livro ou cliente não existe
        }

        if (livro.isEmprestado()) {
            return false; // livro já está emprestado
        }

        // criar novo empréstimo
        Emprestimo emprestimo = new Emprestimo(livro, cliente);
        emprestimos.add(emprestimo);
        return true;
    }


    public boolean devolverLivro(int id_ISBN, String emailCliente) {
        Emprestimo emprestimo = buscarEmprestimoAtivo(id_ISBN, emailCliente);

        if (emprestimo == null) {
            return false; // não tem empréstimo ativo para esse livro e cliente
        }

        emprestimos.remove(emprestimo);
        return true;
    }

}
