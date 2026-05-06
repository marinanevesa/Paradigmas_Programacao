public class TestaBasquete {
    public static void main(String[] args) {
        Atleta a = new Atleta(1, "João", "Armador");
        Time t = new Time(1, "Franca Basquete", "Tecnico Silva");

        t.contratarAtleta(a);

        System.out.println("Antes de anular o Time:");
        System.out.println("Atleta: " + a);
        System.out.println("Time: " + t);

        t = null;

        System.out.println("Depois de anular o Time:");
        System.out.println("Atleta: " + a);
        System.out.println("Time: " + t);
    }
}
