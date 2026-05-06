package FolhaPagamento_PolimorfismoVetores;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {
        // Criando um vetor (array) de tamanho 4 do tipo Desenvolvedor
        Desenvolvedor[] desenvolvedores = new Desenvolvedor[4];

        desenvolvedores[0] = new Junior("João", "Java", 2000, "Maria");

        desenvolvedores[1] = new Pleno("Maria", "Python", 4000, 5);

        desenvolvedores[2] = new Senior("Pedro", "C#", 6000, 10000);

        desenvolvedores[3] = new Desenvolvedor("Carlos", "JavaScript", 2500);

        for (Desenvolvedor dev : desenvolvedores) {
            dev.codar();

            // Imprima o resultado do método calcularBonus()
            System.out.printf("Bônus: ", dev.calcularBonus());

            System.out.println(dev.toString());
            System.out.println();
        }
    }
}
