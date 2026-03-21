import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme f1 = new Filme(1, "Baby", "Ação", 120);
        Filme f2 = new Filme(2, "Zootopia", "Desenho", 120);

        Sessao sessao = new Sessao(1, LocalDateTime.of(2026, 7, 20, 20, 0), 1);

        sessao.vincularFilme(f1);

        sessao.venderIngresso(1, "A1", "Inteira", 30.0f);
        sessao.venderIngresso(2, "A2", "Meia", 15.0f);
        sessao.venderIngresso(3, "A3", "Inteira", 30.0f);

        System.out.println(sessao);
    }
}
