package Drones;

public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    // construtor sem parâmetros
    public Drone() {
        this.codigo = "indefinido";
        this.altura = 0;
        this.bateria = 0;
        this.emVoo = false;
    }

    // construtor com parâmetro
    public Drone(String codigo, float altura, int bateria) {
        this.codigo = codigo;
        this.setAltura (altura);
        this.setBateria(bateria);
        this.emVoo = false;
    }

    private void setAltura(float altura) { //private void é para encapsulamento
        if (altura >= 0 && altura <= 120){
            this.altura = altura;
        }
        else{
            System.out.println("\naltura invalida");
        }
    }

    private void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100){
            this.bateria = bateria;
        }
        else{
            System.out.println("\nbateira invalida");
        }

    }

    private boolean testarMotores(){
        System.out.println("\nTestando hélices...\nCalibrando GPS...");
        int random = (int) (Math.random()*10);
        return random < 8; //retorna se menor que 8
    }

    public void decolar(){ //public void é o metodo publico
        if (bateria >=20 && testarMotores()){
            this.emVoo = true;
            this.setAltura (2); //def a altura pra 2 metros
            System.out.println("\nFoi possivel decolar");
        }
        else{
            System.out.println("\nNão foi posivel decolar");
        }
    }

    public void subir (float x){
        this.setAltura(this.altura + x); //setAltura ja verifica e nao permite ser menor que 0 e maior que 120

    }

    public void descer (float x){
        this.setAltura (this.altura - x);

    }

    public String toString(){
        return  "\n\nCódigo: " + this.codigo +
                "\nAltura: " + this.altura +
                "\nBateria: " + this.bateria +
                "\nSituação: " + ((this.emVoo) ? "Voando":"No chão"); //if true imprime this.emVoo else imprime "Voando":"No chão"
    }
}