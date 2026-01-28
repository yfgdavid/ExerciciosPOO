package exerciciosInterface.Celular;

public class MainCelular {
    public static void main(String[] args) {
       Celular sms = new SMS();
       sms.enviarMensagem("vivo chip cobrança");

       Celular wpp = new Whatsapp();
       wpp.enviarMensagem("Convide amigos via whatsapp!!");

       Celular email = new Email();
       email.enviarMensagem("Muito obrigado por usar o linkedin, tome aqui sua versão gratis de 1 mes de linkedin premium");

       Celular redes = new RedesSociais();
       redes.enviarMensagem("Tiktok lite chuva de premios com chute ao gol");
    }
}
