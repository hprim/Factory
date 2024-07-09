package TareaEntregable_Factory;

public class AppNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Notificaciones de la app " + mensaje);
    }
}
