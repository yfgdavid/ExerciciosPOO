package exerciciosEncapsulamento;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {

        Carro polo = new Carro();
        String desejo;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("o que voce deseja fazer? (1 - ligar, 2 - acelerar, 3 - frear, 4 - virar para esquerda, 5 - virar para direita - 6 - desligar)");
            int opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    polo.ligar();
                    System.out.println("exerciciosEncapsulamento.Carro ligado!");
                    break;
                case 2:
                    if (polo.getEstaLigado()==true) {
                        polo.acelerar();
                        System.out.println("acelerando... velocidade atual = " + polo.getVelocidade() + " marcha atual: " + polo.getMarcha());
                    }
                   else {
                       polo.acelerar();
                    }
                    break;
                case 3:
                    if (polo.getEstaLigado()==true) {
                        polo.acelerar();
                        System.out.println("reduzindo... velocidade atual = " + polo.getVelocidade() + " marcha atual: " + polo.getMarcha());
                    } else {
                        polo.frear();
                    }
                    break;
                case 4:
                    polo.virarParaEsquerda();
                    break;
                case 5:
                    polo.virarParaDireita();
                    break;
                case 6:
                    polo.desligar();
                    break;
                    default:
                        System.out.println("opção invalida");
            }


            System.out.println("deseja continuar dirigindo?");
            desejo = leia.nextLine();
        } while (!desejo.equals("nao"));
    }
}
