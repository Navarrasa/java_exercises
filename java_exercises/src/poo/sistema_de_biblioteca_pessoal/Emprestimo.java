package poo.sistema_de_biblioteca_pessoal;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Cliente cliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao; // pode ser null se ainda não devolvido


    public Emprestimo(Livro livro, Cliente cliente) {
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = null;
        livro.emprestar(); // marca livro como emprestado
    }


    public Livro getLivro() {
        return livro;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }


    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }


    /**
     * Registra a devolução do livro.
     */
    public void devolver() {
        this.dataDevolucao = LocalDate.now();
        livro.devolver(); // marca livro como disponível
    }


    /**
     * Verifica se o empréstimo ainda está ativo
     */
    public boolean estaAtivo() {
        return dataDevolucao == null;
    }


    // @Override é uma anotação (annotation) em Java que indica que você está
    // sobrescrevendo um método que já existe na superclasse (classe pai).
    @Override
    public String toString() {
        return String.format("Livro: %s | Cliente: %s | Emprestado em: %s | Devolvido em: %s",
                livro.getName(),
                cliente.getName(),
                dataEmprestimo,
                dataDevolucao != null ? dataDevolucao : "Ainda não devolvido");
    }



}
