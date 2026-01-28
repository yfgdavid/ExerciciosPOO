package exerciciosInterface.Celular;

public class Email implements Celular {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelo email: " + mensagem);
    }
}
