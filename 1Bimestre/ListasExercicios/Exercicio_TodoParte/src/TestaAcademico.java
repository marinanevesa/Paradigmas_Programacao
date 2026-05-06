package src;

public class TestaAcademico {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(1, "Marina", "26387", "Sistemas de Informação");
        Aluno a2 = new Aluno(2, "Isadora", "20202", "Ciencia da Computação");

        Disciplina poo = new Disciplina(1, "Programação Orientada a Objetos", "Professor Me. Daniel Pires");

        //agregação
        poo.matricularAluno(a1);
        poo.matricularAluno(a2);

        //composição
        poo.criarAvaliacao(3, "Prova Semestral");

        //composição aninhada
        Avaliacao p1 = poo.getUltimaAvaliacao();
        p1.adicionarQuestao(1, "O que é Agregação?", 2);
        p1.adicionarQuestao(2, "O que é Composição?", 2);
        p1.adicionarQuestao(3, "O que é Composição Aninhada?", 2);

        System.out.println(poo.toString());
    }
}