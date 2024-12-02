import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;



public class InventarioMockito {
    @Test
    public void test(){
        Repositorioinventario prod = mock(Repositorioinventario.class);
        when(prod.enInventario("carne")).thenReturn(true);
        Inventario inv = new Inventario(prod);
        boolean estaEnInventario = inv.comprueba("carne");
        Assert.assertTrue(estaEnInventario);
        inv.eliminarEnInventario("carne");
        verify(prod).eliminarProducto("carne");
    }
}
