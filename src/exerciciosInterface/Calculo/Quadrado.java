package exerciciosInterface.Calculo;

public class Quadrado implements Calculo{
  private double medida;

    public Quadrado(double medida) {
        this.medida = medida;
    }

    @Override
    public double calcularArea() {
        return medida*medida;
        }

    }
