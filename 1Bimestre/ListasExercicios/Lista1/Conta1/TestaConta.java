package Conta1;

public class TestaConta {
    public static void main(String[] args) {

        // 1. Instancie um objeto c1 para o cliente "João Silva"
        // Passamos: (numero, agencia, nome)
        Conta c1 = new Conta(1001, 10, "João Silva");
        System.out.println("--- Início das operações para João ---");

        // 2. Tente realizar um depósito de R$ 500,00
        c1.depositar(500.00f);

        // 3. Tente realizar um saque de R$ 200,00 e imprima o estado da conta
        c1.sacar(200.00f);
        System.out.println(c1.toString());
        System.out.println("--------------------------------------\n");

        // 4. Instancie um objeto c2 para a cliente "Maria Souza"
        Conta c2 = new Conta(2002, 20, "Maria Souza");
        System.out.println("--- Início das operações para Maria ---");

        // 5. Tente sacar R$ 50,00 (sem ter saldo) e verifique a mensagem de erro
        c2.sacar(50.00f);
        System.out.println("--------------------------------------\n");

        // 6. Tente encerrar a conta c1 enquanto ela ainda tem saldo (ainda restam 300)
        System.out.println("--- Tentativa de encerramento c1 ---");
        c1.encerrarConta();

        // 7. Saque o restante do dinheiro de c1 (300.00), encerre a conta e imprima os dados
        System.out.println("\n--- Finalizando conta c1 ---");
        c1.sacar(300.00f); // Zerando o saldo
        c1.encerrarConta(); // Agora deve funcionar

        // Imprime os dados finais para confirmar o status
        System.out.println(c1.toString());
    }
}