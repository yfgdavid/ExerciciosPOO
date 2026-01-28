package exercicioIngresso;

public class Meia extends Ingresso{


    public Meia(double valor, String nomeFilme, String modo) {
       setNomeFilme(nomeFilme);
       setModo(modo);
       setValor(valor / 2);
    }
}
