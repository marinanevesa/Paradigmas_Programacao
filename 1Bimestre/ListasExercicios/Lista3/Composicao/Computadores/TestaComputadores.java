public class TestaComputadores {
    public static void main(String[] args) {
        Computador computador = new Computador(1, "Dell", "Intel", "i7", 3.5);

        System.out.println("Computador criado:");
        System.out.println(computador);
        System.out.println("Processador: " + computador.getProcessador());

        computador = null;

        System.out.println("Computador anulado.");
    }
}
