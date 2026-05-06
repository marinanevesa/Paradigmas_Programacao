package FolhaPagamento_PolimorfismoVetores;

public class Pleno extends Desenvolvedor {
    private int projetoEntregue;


    public int getProjetoEntregue() {
        return projetoEntregue;
    }

    public void setProjetoEntregue(int projetoEntregue) {
        this.projetoEntregue = projetoEntregue;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                ", projetoEntregue=" + projetoEntregue +
                '}';
    }

    public Pleno(){
        super();
    }
    public Pleno (String nome, String linguagem, float salarioBase, int projetoEntregue) {
        super(nome, linguagem, salarioBase);
        this.projetoEntregue = projetoEntregue;
    }

    //metodo para codar do pleno, usando o metodo da classe pai e adicionando uma mensagem especifica para o pleno
    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo código e CodeReview");
    }

    @Override //metodo para calcular o bonus do pleno, usando o metodo da classe pai e somando com o valor do bonus do pleno
    public float calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.15f;
    }
}