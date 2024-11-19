import org.junit.Assert;
import org.junit.Test;

public class Ejercicio2Test {
    @Test
    public void main(){
        Ejercicio2 num = new Ejercicio2();
        Assert.assertTrue(num.esPar(6));
        Assert.assertFalse(num.esPar(5));
    }
}
