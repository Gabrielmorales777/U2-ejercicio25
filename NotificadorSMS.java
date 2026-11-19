
public class NotificadorSMS implements CanalNotificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {

        System.out.println("=== NOTIFICACION POR SMS ===");
        System.out.println("Numero: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Estado: SMS enviado correctamente.");
        System.out.println();

    }
}