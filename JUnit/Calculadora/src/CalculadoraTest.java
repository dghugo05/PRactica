import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void main(){
        Calculadora calculo = new Calculadora();
        Assert.assertEquals(2, calculo.suma(1, 1));
        Assert.assertEquals(-3, calculo.resta(2, 5));
        Assert.assertEquals(6, calculo.multiplicacion(2, 3));
        Assert.assertThrows(ArithmeticException.class, () -> {calculo.division(3, 0);});
        Assert.assertEquals(4, calculo.division(12, 3));
    }
}
