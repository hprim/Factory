package TareaEntregable_Factory;
// Defino la Interfaz de Abstract Factory
public interface NotificacionAbstractFactory {
    Notificacion crearEmailNotificacion();
    Notificacion crearSMSNotificacion();
    Notificacion crearAppNotificacion();
}
