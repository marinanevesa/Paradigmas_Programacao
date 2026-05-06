public class TestaSoftware {
    public static void main(String[] args) {
        Projeto projeto = new Projeto(1, "Sistema de Gestão");

        Programador p1 = new Programador(1, "Ana", "Java");
        Programador p2 = new Programador(2, "Bruno", "Python");
        Programador p3 = new Programador(3, "Carlos", "C++");

        projeto.adicionarProgramador(p1);
        projeto.adicionarProgramador(p2);
        projeto.adicionarProgramador(p3);

        projeto.listarProgramadores();
    }
}
