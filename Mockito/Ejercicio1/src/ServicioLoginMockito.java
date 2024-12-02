import org.junit.Assert;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;

public class ServicioLoginMockito {
    @Test
    public void pruebaExiste(){
        RepositorioUsuarios repo = mock(RepositorioUsuarios.class);
        when(repo.existeUser("dghug")).thenReturn(true);
        ServicioLogin miServ = new ServicioLogin(repo);
        Assert.assertTrue(miServ.login("dghug"));
        Assert.assertFalse(miServ.login("dghugo05"));
    }
}
