package exercicioEmpresa;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, String email, String senha) {
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setAdministrador(false);
        setQtdVendas(0);
    }

    private int qtdVendas;

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public void adicionarVendas(int vendasNovas) {
        this.qtdVendas += vendasNovas;
    }

    public void consultarVendas() {
        System.out.println("Vendas: " + getQtdVendas());
    }

}
