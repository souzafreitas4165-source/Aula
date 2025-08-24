public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado para " + titular);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado para " + titular);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta " + numeroConta + " (" + titular + "): R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345-6", "Ana", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("98765-4", "Bruno", 500.0);

        conta1.depositar(200.0);
        conta1.sacar(150.0);
        conta1.consultarSaldo();

        System.out.println();

        conta2.depositar(300.0);
        conta2.sacar(900.0);
        conta2.consultarSaldo();
    }
}