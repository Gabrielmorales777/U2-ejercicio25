
public class NotificadorPush implements CanalNotificacion {

    @Override
    public void enviar(String destinatario, String mensaje) {

        System.out.println("=== NOTIFICACION PUSH ===");
        System.out.println("Dispositivo: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Estado: Notificacion enviada correctamente.");
        System.out.println();

    }
}