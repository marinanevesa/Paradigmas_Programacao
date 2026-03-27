package SistemaVeiculos_EspecializaçãoComportamento;

public class TestaSistemaVeiculos {
    public static void main(String[] args) {
        
        Aviao aviao = new Aviao("LATAM", "ab", 850, 12500, 0);
        CarroEletrico carroEletrico = new CarroEletrico("BYD", "dolphin", 200, 560);

        System.out.println("\n" + aviao);
        System.out.println("\n" + carroEletrico);

        Veiculo veiculo;

        veiculo = aviao;
        veiculo.mover();
        veiculo.abastecer();

        veiculo = carroEletrico;
        veiculo.mover();
        veiculo.abastecer();
    }
}
