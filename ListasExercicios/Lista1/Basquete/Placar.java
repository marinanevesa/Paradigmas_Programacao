package Basquete;

public class Placar {
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {//teste
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {
        // Transformamos o que o usuário enviou para minúsculo
        String timeMinusculo = time.toLowerCase();

        if (timeMinusculo.equals("casa")) {
            this.pontosCasa += tipo;
        } else if (timeMinusculo.equals("visitante")) {
            this.pontosVisitante += tipo;
        }
    }

    public void proximoQuarto() {
        if (this.periodoQuarto < 4) {
            this.periodoQuarto++;
        } else {
            System.out.println("O jogo terminou");
        }
    }

    public String toString() {
        return this.nomeTimeCasa + " [" + this.pontosCasa + "] x [" +
                this.pontosVisitante + "] " + this.nomeTimeVisitante +
                " - Período: " + this.periodoQuarto;
    }
}