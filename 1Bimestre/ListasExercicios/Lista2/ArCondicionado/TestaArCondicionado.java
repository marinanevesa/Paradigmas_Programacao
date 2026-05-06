package ArCondicionado;

public class TestaArCondicionado {
    public static void main(String[] args) {

        ArCondicionado ar1 = new ArCondicionado("Samsung", "Turbo 2.0", 40, false);
        System.out.println("\nAr 1: " + ar1.toString()+ "\n");

        ArCondicionado ar2 = new ArCondicionado("LG", "Dual Inverter", 27, true);
        System.out.println("\nAr 2: " + ar2.toString()+ "\n");

        ar2.setTemperatura(15); // Deve dar erro
        ar2.setTemperatura(31); // Deve dar erro
        ar2.setTemperatura(20); // Deve aceitar

        System.out.println("\nAr 2: " + ar2.toString() + "\n");

        ar1.ativarModoTurbo();

        System.out.println("\nAr 1: " + ar1.toString() + "\n");
    }
}