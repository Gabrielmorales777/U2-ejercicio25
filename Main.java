
public class Main {

    public static void main(String[] args) {


        GestorAlertas gestor = new GestorAlertas();


        NotificadorEmail email = new NotificadorEmail();
        NotificadorSMS sms = new NotificadorSMS();
        NotificadorPush push = new NotificadorPush();


        gestor.agregarCanal(email);
        gestor.agregarCanal(sms);
        gestor.agregarCanal(push);


        String destinatario = "Gabriel";
        String mensaje = "IMPORTANTE: Reunion corporativa "
                + "programada para mañana a las 10:00 hs.";


        gestor.difundirMasivo(destinatario, mensaje);


        gestor.enviarSelectivo(
                email,
                "gabriel@gmail.com",
                "Recordatorio: Reunion corporativa mañana."
        );
    }
}