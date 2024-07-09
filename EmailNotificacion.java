package TareaEntregable_Factory;

public class EmailNotificacion implements Notificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Cargando los mensajes de email... " + mensaje);
    }
}



