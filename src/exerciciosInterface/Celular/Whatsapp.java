package exerciciosInterface.Celular;

public class Whatsapp implements Celular {
        @Override
        public void enviarMensagem(String mensagem) {
            System.out.println("Enviando mensagem pelo whatsapp: " + mensagem);
        }
    }


