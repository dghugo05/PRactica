import org.junit.Assert;
import org.junit.Test;

public class Ejercicio1Test {
    @Test
    public void main(){
        Ejercicio1 miNumero = new Ejercicio1();
        Assert.assertTrue(miNumero.esPositivo(7));
        Assert.assertFalse(miNumero.esPositivo(-4));
    }
}
