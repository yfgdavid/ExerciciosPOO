package exerciciosInterface.Celular;

public class RedesSociais implements Celular {
        @Override
        public void enviarMensagem(String mensagem) {
            System.out.println("Enviando mensagem pelas redes sociais: " + mensagem);
        }
    }


