package Conta1;

public class Conta {
    // Atributos (Propriedades)
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status; // true = ativa, false = encerrada

    //Método Construtor
    //Note que não pedimos saldo e status no parâmetro, pois eles têm valores iniciais fixos
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0f;     // Inicia em 0
        this.status = true;    // Inicia ativa
    }

    // Método para Depositar
    public void depositar(float valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Operação negada: A conta está encerrada.");
        }
    }

    // Método para Sacar
    public void sacar(float valor) {
        if (!this.status) {
            System.out.println("Erro: Conta inativa.");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + this.saldo);
        } else {
            System.out.println("Erro: Saldo insuficiente. Saldo disponível: R$ " + this.saldo);
        }
    }

    // Método para Encerrar Conta
    public void encerrarConta() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Não é possível encerrar: Você possui R$ " + this.saldo + ". Saque o valor antes.");
        }
    }

    // Método para exibir os dados (Representação em String)
    @Override
    public String toString() {
        String situacao = this.status ? "Ativa" : "Encerrada";
        return "--- Dados da Conta ---" +
                "\nNúmero: " + this.numeroConta +
                "\nAgência: " + this.agencia +
                "\nCliente: " + this.nomeCliente +
                "\nSaldo: R$ " + this.saldo +
                "\nStatus: " + situacao;
    }
}