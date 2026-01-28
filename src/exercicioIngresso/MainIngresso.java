package exercicioIngresso;

public class MainIngresso {
    public static void main(String[] args) {

        System.out.println("========== SISTEMA DE INGRESSOS ==========\n");


        Ingresso empregada = new Ingresso();
        empregada.setNomeFilme("A Empregada");
        empregada.setModo("Dublado");
        empregada.setValor(25);

        System.out.println("=== INGRESSO NORMAL ===");
        System.out.println("Filme: " + empregada.getNomeFilme());
        System.out.println("Modo: " + empregada.getModo());
        System.out.println("Valor: R$ " + empregada.getValor());
        System.out.println();


        Meia empregada2 = new Meia(25, "A Empregada", "Dublado");
        System.out.println("=== MEIA ENTRADA ===");
        System.out.println("Filme: " + empregada2.getNomeFilme());
        System.out.println("Modo: " + empregada2.getModo());
        System.out.println("Valor: R$ " + empregada2.getValor());
        System.out.println();


        IngressoFamilia empregada3 = new IngressoFamilia(2, 25, "A Empregada", "Dublado");
        System.out.println("=== INGRESSO FAMÍLIA ===");
        System.out.println("Filme: " + empregada3.getNomeFilme());
        System.out.println("Modo: " + empregada3.getModo());
        System.out.println("Pessoas: " + empregada3.getNumeroPessoas());
        System.out.println("Valor Total: R$ " + empregada3.getValor() + " (sem desconto)");
        System.out.println();


        IngressoFamilia empregada4 = new IngressoFamilia(5, 25, "A Empregada", "Legendado");
        System.out.println("=== INGRESSO FAMÍLIA (DESCONTO) ===");
        System.out.println("Filme: " + empregada4.getNomeFilme());
        System.out.println("Modo: " + empregada4.getModo());
        System.out.println("Pessoas: " + empregada4.getNumeroPessoas());
        System.out.println("Valor Total: R$ " + empregada4.getValor() + " (com desconto de 5%)");

        System.out.println("\n==========================================");
    }
}
