package exercicioEmpresa;

public class Gerente extends Funcionario {

    public Gerente(String nome, String email, String senha) {
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setAdministrador(true);
    }

    public void consultarVendas(Vendedor vendedor) {
        System.out.println("Vendas do(a) " + (vendedor.getNome()) + ": " + vendedor.getQtdVendas());
    }

    public void gerarRelatorio(double valorProduto, int qtdVendas) {
        System.out.println("===== Relatorio de Vendas====");
        System.out.println("Vendas: " + qtdVendas);
        System.out.println("Preço unitário: " + valorProduto);
        System.out.println("Valor total: " + valorProduto * qtdVendas);
    }
}
