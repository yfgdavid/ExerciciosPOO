package exerciciosInterface.Celular;

public class SMS implements Celular {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelo sms: " + mensagem);
    }
}
