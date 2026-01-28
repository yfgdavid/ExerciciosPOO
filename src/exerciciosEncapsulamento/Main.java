package exerciciosEncapsulamento;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String desejo;
        Scanner leia = new Scanner(System.in);

        Conta nubank = new Conta();
        nubank.setNumero(200);
        nubank.setSaldo(0);

        do {

            System.out.println("o que voce deseja fazer? 1 para ver saldo, 2 para realizar um deposito, 3 para realizar um saque");
            int opcao = leia.nextInt();
            leia.nextLine();


            switch (opcao) {
                case 1:
                    System.out.println("numero da conta: " + nubank.getNumero() + ", saldo atual: " + nubank.getSaldo());
                    break;
                case 2:
                    System.out.println("insira o valor do deposito.");
                    double valorDeposito = leia.nextDouble();
                    leia.nextLine();
                    nubank.depositar(valorDeposito);
                    System.out.println("numero da conta: " + nubank.getNumero() + " e o seu deposito foi realizado com sucesso, saldo atual: " + nubank.getSaldo());
                    break;
                case 3:
                    System.out.println("insira o valor do saque.");
                    double valorSaque = leia.nextDouble();
                    leia.nextLine();
                    if (valorSaque > nubank.getSaldo()) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        nubank.sacar(valorSaque);
                        System.out.println("numero da conta: " + nubank.getNumero() + " e o seu saque foi realizado com sucesso, saldo atual: " + nubank.getSaldo());
                    }
                    break;
            }

            System.out.println("voce deseja continuar? (digite nao para sair)");
            desejo = leia.nextLine();
        } while (!desejo.equals("nao"));

    }
}
