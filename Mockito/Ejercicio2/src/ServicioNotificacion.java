public class ServicioNotificacion {
    private ProveedorNotificaciones notificacion;
    public ServicioNotificacion(ProveedorNotificaciones noti){
        notificacion = noti;
    }

    public void enviarNotificion(String mensaje){
        notificacion.enviarNotificacion(mensaje);
    }
}
