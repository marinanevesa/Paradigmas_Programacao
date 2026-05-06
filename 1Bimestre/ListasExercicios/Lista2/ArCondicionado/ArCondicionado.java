package ArCondicionado;

public class ArCondicionado {
    private String marca, modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
        this.marca = "";
        this.modelo = "";
        this.temperatura = 22;
        this.ligado = false;
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.setLigado(ligado);
    }





    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
            System.out.println("Temperatura atualizada para " + t);
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void setMarca(String m) {
        if (m.length() >= 3) {
            this.marca = m;
        } else {
            this.marca = ("Marca inválida");
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }




    public int getTemperatura() {
        return this.temperatura;
    }

    public String getMarca() {
        return this.marca;

    }

    public String getModelo() {
        return this.modelo;

    }
    public boolean isLigado() {
        return this.ligado;
    }




    public void ativarModoTurbo() {
        if (this.ligado) { //o ar só ativa o turbo se estiver ligado
            if (this.verificarCompressor()) {
                System.out.println("Ativado");
                this.setTemperatura(16);
            } else {
                System.out.println("Erro");
            }
        } else {
            System.out.println("ar desligado, impossivel ativar");
        }
    }


    private boolean verificarCompressor() {
        double r = Math.random() * 10;
        return r > 2;
    }

    public String toString() {
        String status = this.ligado ? "Ligado" : "Desligado";
        return "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nTemp: " + this.temperatura + "°C" +
                "\nStatus: " + status;
    }
}