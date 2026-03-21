package Basquete;

public class TestaPlacar {
    public static void main(String[] args) {
        // Instanciando o objeto conforme o enunciado
        Placar p1 = new Placar("TIME A", "TIME B");

        // Testando registros de pontos
        p1.registrarPonto("casa", 3);      // Cesta de 3
        p1.registrarPonto("visitante", 2); // Cesta de 2

        System.out.println(p1.toString());

        // Mudando de quarto
        p1.proximoQuarto(); // Vai para o 2
        p1.proximoQuarto(); // Vai para o 3
        p1.proximoQuarto(); // Vai para o 4

        // Tentando passar do quarto 4
        p1.proximoQuarto();

        System.out.println(p1.toString());
    }
}