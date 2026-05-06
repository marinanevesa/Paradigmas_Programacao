package Streaming;

public class Streaming {
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        if (this.plano == "Básico") {
            this.mensalidade = 25.90f;
        } else if (this.plano == "Premium") {
            this.mensalidade = 45.90f;
        } else if (this.plano == "Família") {
            this.mensalidade = 60.90f;
        } else {
            this.mensalidade = 0.0f;
            System.out.println("Nenhum plano reconhecido");
        }
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Você precisa pagar a fatura");
        }
    }

    public void cancelarAssinatura() {
        this.ativo = false;
        System.out.println("Assinatura suspensa.");
    }

    public String toString() {
        String statusTexto = this.ativo ? "Ativo" : "Suspenso";
        return "\nUsuário: " + this.usuario +
                "\nPlano: " + this.plano +
                "\nMensalidade: R$ " + this.mensalidade +
                "\nStatus: " + statusTexto +
                "\nÚltimo Filme: " + (this.ultimoFilmeAssistido);
    }
}