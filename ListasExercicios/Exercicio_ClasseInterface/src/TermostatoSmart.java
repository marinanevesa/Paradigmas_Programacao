package src;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean ligado;
    private double temperatura;

    public TermostatoSmart() {
        this.ligado = false;
        this.temperatura = 25.0; // temperatura padrão
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("termostato ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("termostato desligado");
    }

    @Override
    public double lerTemperatura() {
        if (ligado) {
            // Simula leitura de temperatura
            temperatura = 20.0 + Math.random() * 10; // entre 20 e 30
            System.out.println("temperatura: " + temperatura);
            return temperatura;
        } else {
            System.out.println("termostato desligado");
            return 0.0;
        }
    }
}
