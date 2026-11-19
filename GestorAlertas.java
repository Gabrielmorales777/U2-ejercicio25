
import java.util.ArrayList;
import java.util.List;

public class GestorAlertas {

    private List<CanalNotificacion> canales;

    public GestorAlertas() {
        canales = new ArrayList<>();
    }


    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }


    public void difundirMasivo(String destinatario, String mensaje) {

        System.out.println("================================");
        System.out.println("       ENVIO MASIVO");
        System.out.println("================================");

        for (CanalNotificacion canal : canales) {
            canal.enviar(destinatario, mensaje);
        }
    }


    public void enviarSelectivo(CanalNotificacion canal,
                                String destinatario,
                                String mensaje) {

        if (canales.contains(canal)) {
            System.out.println("================================");
            System.out.println("       ENVIO SELECTIVO");
            System.out.println("================================");

            canal.enviar(destinatario, mensaje);

        } else {
            System.out.println("El canal no esta registrado.");
        }
    }
}