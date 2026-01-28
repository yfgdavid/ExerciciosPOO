package desafioPoo;

public class Curso extends Conteudo {

    private double cargaHoraria;

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' + '}';
    }


    @Override
    public double calcularXp() {
        return xp_padrao * cargaHoraria;


    }
}
