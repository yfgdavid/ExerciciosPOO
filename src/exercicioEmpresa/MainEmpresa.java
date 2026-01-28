package exercicioEmpresa;

public class MainEmpresa {
    public static void main(String[] args) {
        Vendedor Jaime = new Vendedor("Jaime", "jmsi@cesar.school", "123454");

        Jaime.adicionarVendas(500);

        System.out.println("Vendas de " + Jaime.getNome());
        Jaime.consultarVendas();

        Jaime.realizarLogin("jmsi@cesar.school", "123454");
        Jaime.realizarLogOff();
        Jaime.alterarDados("David", "dvsi@cesar.school");
        System.out.println(Jaime.getNome());
        System.out.println(Jaime.getEmail());
        Jaime.alterarSenha("123454", "111111");
        System.out.println(Jaime.getSenha());
        System.out.println(Jaime.isAdministrador());

        Gerente david = new Gerente("David", "davidvictorcontato7@gmail.com", "1231123");

        System.out.println(david.isAdministrador());
        david.consultarVendas(Jaime);

        david.gerarRelatorio(40, 500);

        Atendente edson = new Atendente("Edson", "edinho@gmail.com", "1234");


        edson.receberPagamentos();
        edson.fecharCaixa();


    }
}
