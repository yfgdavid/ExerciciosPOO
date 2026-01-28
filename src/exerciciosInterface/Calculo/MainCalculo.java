package exerciciosInterface.Calculo;

public class MainCalculo {
    public static void main(String[] args) {

        Quadrado igual = new Quadrado(7);
        System.out.println(igual.calcularArea());

        Retangulo retangulo = new Retangulo(5, 6);
        System.out.println(retangulo.calcularArea());
    }
}
