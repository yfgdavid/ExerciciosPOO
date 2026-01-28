package exercicioEmpresa;

public class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public void realizarLogin(String emailDigitado, String senhaDigitada) {
        if (this.email.equalsIgnoreCase(emailDigitado) && this.senha.equals(senhaDigitada)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Dados incorretos, tente novamente");
        }
    }

    public void realizarLogOff() {
        System.out.println("Deslogado com sucesso!");
    }

    public void alterarSenha(String senhaDigitada, String novaSenha) {
        if (this.senha.equals(senhaDigitada)) {
            System.out.println("senha alterada com sucesso!");
            this.senha = novaSenha;
        }  else {
            System.out.println("senha incorreta!");
        }
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;

        System.out.println("Dados alterados com sucesso!");


    }
}
