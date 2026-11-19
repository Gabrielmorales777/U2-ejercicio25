
public class NotificadorEmail implements CanalNotificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {

        System.out.println("=== NOTIFICACION POR EMAIL ===");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Estado: Email enviado correctamente.");
        System.out.println();

    }
}