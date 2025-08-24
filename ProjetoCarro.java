public class ProjetoCarro {
    private String marca;
    private String modelo;
    private int ano;

    public ProjetoCarro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void ligarCarro() {
        System.out.println("O carro " + modelo + " está ligado!");
    }

    public static void main(String[] args) {
        ProjetoCarro carro1 = new ProjetoCarro("Toyota", "Corolla", 2020);
        ProjetoCarro carro2 = new ProjetoCarro("Honda", "Civic", 2018);

        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();

        carro2.setMarca("Nissan");
        carro2.setModelo("Sentra");
        carro2.setAno(2022);

        System.out.println("\nValores modificados do carro2:");
        carro2.mostrarInformacoes();

        carro1.ligarCarro();
        carro2.ligarCarro();
    }
}