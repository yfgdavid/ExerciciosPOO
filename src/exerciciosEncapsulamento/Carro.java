package exerciciosEncapsulamento;

public class Carro {

    private int velocidade;
    private boolean estaLigado;
    private int marcha;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean getEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void ligar() {
        this.estaLigado = true;
    }

    public void desligar() {
        if (this.velocidade == 0) {
            this.estaLigado = false;
        }
        else  {
            System.out.println("o carro ainda esta em movimento, reduza a velocidade para desligar");
        }
    }

    public void acelerar() {

        if (estaLigado == false) {
            System.out.println("carro desligado, nao é possivel fazer nada");
        } else {
            this.velocidade = this.velocidade + 1;
            if (this.velocidade >= 1 && this.velocidade <= 20) {
                this.marcha = 1;
            } else if (this.velocidade >= 21 && this.velocidade <= 40) {
                this.marcha = 2;
            } else if (this.velocidade >= 41 && this.velocidade <= 60) {
                this.marcha = 3;
            } else if (this.velocidade >= 61 && this.velocidade <= 80) {
                this.marcha = 4;
            } else if (this.velocidade >= 81 && this.velocidade <= 100) {
                this.marcha = 5;
            } else if (this.velocidade >= 101 && this.velocidade <= 120) {
                this.marcha = 6;
            } else {
                System.out.println("velocidade maxima!!");
            }
        }

    }

    public void frear() {

        if (estaLigado == false) {
            System.out.println("carro desligado, nao é possivel fazer nada");
        } else {
            this.velocidade = this.velocidade - 1;

            if (this.velocidade >= 1 && this.velocidade <= 20) {
                this.marcha = 1;
            } else if (this.velocidade >= 21 && this.velocidade <= 40) {
                this.marcha = 2;
            } else if (this.velocidade >= 41 && this.velocidade <= 60) {
                this.marcha = 3;
            } else if (this.velocidade >= 61 && this.velocidade <= 80) {
                this.marcha = 4;
            } else if (this.velocidade >= 81 && this.velocidade <= 100) {
                this.marcha = 5;
            } else if (this.velocidade >= 101 && this.velocidade <= 120) {
                this.marcha = 6;
            } else {
                System.out.println("carro em ponto morto");
            }
        }
    }

    public void virarParaEsquerda() {
        if (estaLigado == false) {
            System.out.println("carro desligado, nao é possivel fazer nada");
        } else {
            if (this.velocidade >= 1 && this.velocidade <= 40) {
                System.out.println("virando pra esquerda!!");
            } else {
                System.out.println("carro muito rapido, é possivel virar");
            }
        }
    }

    public void virarParaDireita() {
        if (estaLigado == false) {
            System.out.println("carro desligado, nao é possivel fazer nada");
        } else {
            if (this.velocidade >=1 && this.velocidade <= 40) {
                System.out.println("virando pra direita!!");
            } else {
                System.out.println("carro muito rapido, nao é possivel virar");
            }
        }
    }


}









