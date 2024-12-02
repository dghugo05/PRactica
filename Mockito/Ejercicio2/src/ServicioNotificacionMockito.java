import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ServicioNotificacionMockito{
    @Test
    public void test() {
        ProveedorNotificaciones notificacion = mock(ProveedorNotificaciones.class);
        ServicioNotificacion servicio = new ServicioNotificacion(notificacion);
        servicio.enviarNotificion("Hola");
        verify(notificacion).enviarNotificacion("Hola");
    }
}
