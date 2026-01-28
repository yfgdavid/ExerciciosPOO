package exerciciosEncapsulamento;

public class Conta {

    private int numero;
    private double saldo;
    private double deposito;
    private double saque;

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositoi() {
        return deposito;
    }

    public void setDepositoi(double deposito) {
        this.deposito = deposito;
    }

    public void depositar(double deposito){
       this.saldo = this.saldo +  deposito;
    }

    public void sacar(double saque){
        this.saldo = this.saldo -  saque;
    }
}
