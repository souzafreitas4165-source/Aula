class Cliente {
    private String nome;
    private int idade;
    private String livroFavorito;

    public Cliente(String nome, int idade, String livroFavorito) {
        this.nome = nome;
        this.idade = idade;
        this.livroFavorito = livroFavorito;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e meu livro favorito é \"" + livroFavorito + "\".");
    }

    public void comprarLivro(String tituloLivro) {
        System.out.println(nome + " comprou o livro \"" + tituloLivro + "\".");
        this.livroFavorito = tituloLivro;
    }
}

public class ProjetoLivra {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", 25, "Dom Casmurro");
        cliente1.apresentar();
        cliente1.comprarLivro("O Hobbit");
    }
}
