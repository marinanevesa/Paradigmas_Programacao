import java.time.LocalDate;

public class TestaBiblioteca {
    public static void main(String[] args) {
        Leitor leitor = new Leitor(1, "João ");

        Livro livro = new Livro(1, "It a Coisa", "Autor King");

        LocalDate dataEmprestimo = LocalDate.of(2026, 1, 1);
        LocalDate dataDevolucaoPrevista = LocalDate.of(2026, 2, 2);
        Emprestimo emprestimo = new Emprestimo(dataEmprestimo, dataDevolucaoPrevista, leitor, livro);

        System.out.println(emprestimo);
    }
}
