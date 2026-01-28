package exercicioIngresso;

public class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public IngressoFamilia(int numeroPessoas, double valor, String nomeFilme, String modo) {
        setNomeFilme(nomeFilme);
        setModo(modo);
        setNumeroPessoas(numeroPessoas);


        if (numeroPessoas > 3) {
            setValor((valor * numeroPessoas) * 0.95);
        } else {
            setValor(valor * numeroPessoas);
        }
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;


    }
}
