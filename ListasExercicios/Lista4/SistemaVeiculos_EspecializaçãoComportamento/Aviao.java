package SistemaVeiculos_EspecializaçãoComportamento;

public class Aviao extends Veiculo {
    private float altitudeMax;
    private float altitudeAtual;

    public Aviao(String marca, String modelo, float velocidade) {
        super(marca, modelo, velocidade);
    }

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax, float altitudeAtual) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
        this.altitudeAtual = altitudeAtual;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeAtual() {
        return altitudeAtual;
    }

    public void setAltitudeAtual(float altitudeAtual) {
        this.altitudeAtual = altitudeAtual;
    }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + velocidade + " km/h e " + altitudeAtual + " metros");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação");
    }

    public void decolar() {
        altitudeAtual = altitudeMax;
        System.out.println("Avião decolando para " + altitudeMax + " metros");
    }

    public void pousar() {
        altitudeAtual = 0;
        System.out.println("Avião pousando");
    }



    @Override
    public String toString() {
        return "Aviao{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                ", altitudeMax=" + altitudeMax +
                ", altitudeAtual=" + altitudeAtual +
                '}';
    }
}

