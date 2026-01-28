package desafioPoo;

import java.time.LocalDate;

public class MainDesafio {
    public static void main(String[] args) {
        Curso java = new Curso();
        java.setTitulo("Java");
        java.setDescricao("Java 17 com POO");
        java.setCargaHoraria(12);

        Curso phyton = new Curso();
        phyton.setTitulo("Phyton");
        phyton.setDescricao("Phyton com Django");
        phyton.setCargaHoraria(20);

        Mentoria coaching = new Mentoria();

        coaching.setTitulo("Coaching sobre soft skills");
        coaching.setDescricao("Coaching sobre skills focando em boas praticas de ambiente de trabalho");
        coaching.setData(LocalDate.now());


       Bootcamp accenture = new Bootcamp();
       accenture.setNome("Accenture Java");
       accenture.setDescricao("Accenture Java + Spring");
       accenture.getConteudos().add(phyton);
       accenture.getConteudos().add(java);
       accenture.getConteudos().add(coaching);

       Dev david  = new Dev();
       david.setNome("David");
       david.inscreverBootcamp(accenture);
       System.out.println("Conteudos inscritos: " + david.getConteudosInscritos());
       david.progredir();
        System.out.println("Conteudos concluidos: " + david.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + david.getConteudosInscritos());
        System.out.println("XP: " + david.calcularTotalXp());


        System.out.println("============================================");
        Dev selton = new Dev();
       selton.setNome("Selton");
       selton.inscreverBootcamp(accenture);
       selton.progredir();
        System.out.println("Conteudos inscritos: " + david.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + selton.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + selton.getConteudosInscritos());

        System.out.println("XP: " + selton.calcularTotalXp());




    }
}
