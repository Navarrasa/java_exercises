package poo.sistema_de_compras;

public class Cliente {
    private final String email;
    private final String name;

    // Construtor
    public Cliente(String email, String name) {
        this.email = email;
        this.name = name;
    }

    // Método para criar e retornar um novo cliente
    public static Cliente criarCliente(String email, String name){
        return new Cliente(email, name);
    }

    // Método para mostrar os dados de um cliente
    public static void mostrarDados(Cliente cliente) {
        System.out.println("Exibindo Dados do Cliente:");
        System.out.println("E-Mail: " + cliente.email);
        System.out.println("Nome: " + cliente.name);
    }

    public static void main(String[] args) {
        Cliente cliente = Cliente.criarCliente("maria@email.com", "Maria");
        Cliente.mostrarDados(cliente);
    }

}
