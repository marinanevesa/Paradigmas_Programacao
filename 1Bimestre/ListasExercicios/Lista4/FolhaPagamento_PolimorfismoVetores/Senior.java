package FolhaPagamento_PolimorfismoVetores;

public class Senior extends Desenvolvedor{
    private float verbaLider;

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }



    public Senior(){
        super();
    }
    public Senior (String nome, String linguagem, float salarioBase, int verbaLider) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }

    @Override
    public void codar(){
        System.out.println("Senior def a arquitetura do Sofftware e liderando people");
    }

    @Override
    public float calcularBonus(){
        return super.calcularBonus() + this.salarioBase * 0.30f;
    }


}
