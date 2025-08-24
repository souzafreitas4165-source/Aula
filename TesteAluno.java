// Classe que representa o aluno
class Aluno {
    private String nome;
    private int matricula;
    private double notaAv1;
    private double notaAv2;

    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + notaAv1);
        System.out.println("Nota AV2: " + notaAv2);
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else {
            System.out.println("Aluno reprovado. Média: " + media);
        }
    }
}

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas", 12345, 6.5, 7.5);
        Aluno aluno2 = new Aluno("Marina", 67890, 8.0, 9.0);

        aluno1.setNotaAv1(8.5);

        System.out.println("Dados do aluno 1:");
        aluno1.mostrarDados();
        System.out.println();

        System.out.println("Dados do aluno 2:");
        aluno2.mostrarDados();
        System.out.println();

        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
    }
}
