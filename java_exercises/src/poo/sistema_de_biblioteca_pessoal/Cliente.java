package poo.sistema_de_biblioteca_pessoal;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String name;
    private final String email;
    private final List<String> livrosEmprestados;  // Melhorei o nome para camelCase


    // Construtor para criar um novo cliente com nome e email
    public Cliente(String name, String email) {
        this.name = name;
        this.email = email;
        this.livrosEmprestados = new ArrayList<>(); // inicializa a lista vazia
    }


    // Getters (acessores)
    public String getEmail() {
        return email;
    }


    public List<String> getLivrosEmprestados() {
        return livrosEmprestados;
    }


    public String getName() {
        return name;
    }


    /**
     * Adiciona um livro à lista de livros emprestados
     */
    public void adicionarLivroEmprestado(String nomeLivro) {
        livrosEmprestados.add(nomeLivro);
    }


    /**
     * Remove um livro da lista de livros emprestados
     */
    public boolean removerLivroEmprestado(String nomeLivro) {
        return livrosEmprestados.remove(nomeLivro);
    }


    /**
     * Exibe os dados do cliente no console
     */
    public void visualizarDadosCliente() {
        System.out.println("Nome: " + name);
        System.out.println("Email: " + email);
        System.out.println("Livros emprestados: ");
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            for (String livro : livrosEmprestados) {
                System.out.println("- " + livro);
            }
        }
    }


    /**
     * Lista os livros emprestados (pode retornar a lista ou só imprimir)
     */
    public void listarLivrosEmprestados() {
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            System.out.println("Livros emprestados:");
            for (String livro : livrosEmprestados) {
                System.out.println("- " + livro);
            }
        }
    }
}
