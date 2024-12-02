import org.junit.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.junit.Assert;

public class SistemaOrdenesMockito {
    @Test
    public void test(){
        ProveedorDescuentos desc = mock(ProveedorDescuentos.class);
        when(desc.descontar("mock123")).thenReturn(10);
        SistemaOrdenes miSistem = new SistemaOrdenes(desc);
        double precio = miSistem.calcDescuento("mock123", 10);
        Assert.assertEquals(9, precio, 0.0001);
    }
}
