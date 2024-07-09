package TareaEntregable_Factory;


public class SMSNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Cargando mensaje..." + mensaje);
    }
}
