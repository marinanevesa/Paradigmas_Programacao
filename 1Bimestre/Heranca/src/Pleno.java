public class Pleno extends Desenvolvedor {
    private int projetoEntregue;

    public Pleno(){
        super();
    }
    public Pleno (String nome, String linguagem, float salarioBase, int projetoEntregue) {
        super(nome, linguagem, salarioBase);
        this.projetoEntregue = projetoEntregue;
    }
}
