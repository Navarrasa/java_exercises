package poo.sistema_de_biblioteca_pessoal;

/**
 * Representa um livro na biblioteca.
 */
public class Livro {
    private final int id_ISBN;          // Identificador único do livro
    private final String name;    // Nome ou título do livro
    private final String author;  // Nome do autor do livro
    private boolean emprestado;    // Status do livro: true se emprestado, false se disponível


    /**
     * Construtor da classe Livro.
     * @param id_ISBN Identificador único do livro
     * @param name Nome do livro
     */
    public Livro(int id_ISBN, String name, String author) {
        this.id_ISBN = id_ISBN;
        this.name = name;
        this.author = author;
        this.emprestado = false; // Por padrão, livro está disponível ao ser cadastrado
    }


    public String getName() {
        return name;
    }


    public int getIdISBN() {
        return id_ISBN;
    }


    public boolean isEmprestado() {
        return emprestado;
    }


    public String getAuthor(){
        return author;
    }


    /**
     * Marca o livro como emprestado
     */
    public void emprestar() {
        this.emprestado = true;
    }


    /**
     * Marca o livro como disponível novamente
     */
    public void devolver() {
        this.emprestado = false;
    }


    /**
     * Exibe informações do livro
     */
    public void exibirDados() {
        System.out.printf("ID: %d | Título: %s | Status: %s%n",
                id_ISBN, name, emprestado ? "Emprestado" : "Disponível");
    }
}
