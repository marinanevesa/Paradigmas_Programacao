package src;

public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private String senhaCorreta;
    private boolean destrancada;

    public FechaduraEletronica(String senha) {
        this.senhaCorreta = senha;
        this.destrancada = false;
    }

    @Override
    public void validarAcesso(String senha) {
        if (senha.equals(senhaCorreta)) {
            destrancada = true;
            System.out.println("acesso validado");
        } else {
            System.out.println("senha incorreta");
        }
    }

    @Override
    public void ligar() {
        if (destrancada) {
            System.out.println("fechadura destrancada");
        } else {
            System.out.println("não é possível destrancar");
        }
    }

    @Override
    public void desligar() {
        destrancada = false;
        System.out.println("fechadura trancada");
    }
}
