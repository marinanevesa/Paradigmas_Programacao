package SistemaVeiculos_EspecializaçãoComportamento;

public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico(String marca, String modelo, float velocidade) {
        super(marca, modelo, velocidade);
    }

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida");
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public String toString() {
        return "CarroEletrico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                ", autonomiaBateria=" + autonomiaBateria +
                " km}";
    }
}

