package Drones;

public class TestaDrone {
    public static void main(String[] args){
        Drone d1 = new Drone("1", 0, 100);
        System.out.println(d1.toString());

        d1.decolar();
        System.out.println(d1.toString());

        d1.subir(50);
        System.out.println(d1.toString());

        d1.subir(100);
        System.out.println(d1.toString());

        d1.descer(50);
        System.out.println(d1.toString());

        d1.descer(100);
        System.out.println(d1.toString());

        Drone d2 = new Drone("2", -10, 10);
        System.out.println(d2.toString());

        d2.decolar();
        System.out.println(d2.toString());

        d2.subir(50);
        System.out.println(d2.toString());

        d2.subir(100);
        System.out.println(d2.toString());

        d2.descer(50);
        System.out.println(d2.toString());

        d2.descer(100);
        System.out.println(d2.toString());


    }
}