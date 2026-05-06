public class Senior extends Desenvolvedor{
    private float verbaLider;

    public Senior(){
        super();
    }
    public Senior (String nome, String linguagem, float salarioBase, int verbaLider) {
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }
}
