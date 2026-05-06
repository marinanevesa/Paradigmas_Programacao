package Streaming;

public class TestaStreaming {
    public static void main(String[] args) {
        // Criando uma conta Premium
        Streaming s1 = new Streaming("Lucas_TI", "Premium");
        System.out.println(s1.toString());

        // Tentando assistir algo
        s1.assistirFilme("Inception");

        // Cancelando e tentando assistir novamente
        s1.cancelarAssinatura();
        s1.assistirFilme("Matrix"); // Deve dar erro

        // Criando uma conta Básica para comparar
        Streaming s2 = new Streaming("Ana_Saude", "Básico");
        System.out.println(s2.toString());
    }
}