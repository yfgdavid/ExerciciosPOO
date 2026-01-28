package exercicioEmpresa;

import java.util.Scanner;

public class Atendente extends Funcionario {

    private double valorEmCaixa;

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    public Atendente(String nome, String email, String senha) {
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setAdministrador(false);
        setValorEmCaixa(0);
    }

    public void receberPagamentos () {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe o valor do pagamento: ");
        double valorPagamento = leia.nextDouble();
        valorEmCaixa += valorPagamento;
        System.out.println("Pagamento realizado com sucesso! valor em caixa: " + valorEmCaixa);
    }

    public void fecharCaixa () {
        System.out.println("Caixa fechada com sucesso!");
    }
}
