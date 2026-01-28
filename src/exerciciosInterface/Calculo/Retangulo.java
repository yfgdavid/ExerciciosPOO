package exerciciosInterface.Calculo;

public class Retangulo implements Calculo {
  private double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
      return base*altura;
    }
}
