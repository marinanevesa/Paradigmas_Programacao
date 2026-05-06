package src;

import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina() {
    }

    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    public void criarAvaliacao(int id, String nome) {
        Avaliacao ava = new Avaliacao(id, nome);
        this.avaliacoes.add(ava);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Avaliacao getUltimaAvaliacao() {
        return avaliacoes.get(avaliacoes.size() - 1);
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "\nid=" + id +
                ", \nnome='" + nome + '\'' +
                ", \nprofessor='" + professor + '\'' +
                ", \n\n\nalunos=" + alunos +
                ", \n\n\navaliacoes=" + avaliacoes +
                '}';
    }
}