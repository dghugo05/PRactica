import org.junit.*;

public class CalculadoraAvanzadaPrueba {
    @Test
    public void testPotencia(){
        CalculadoraAvanzada calculo = new CalculadoraAvanzada();
        Assert.assertEquals(4, calculo.potencia(2,2), 0.001);
        Assert.assertEquals(1, calculo.potencia(2,0), 0.001);
        Assert.assertEquals(4, calculo.potencia(-2,2), 0.001);
        Assert.assertEquals(0.25, calculo.potencia(2,-2), 0.001);
        Assert.assertEquals(-0.125, calculo.potencia(-2,-3), 0.001);

        Assert.assertThrows(IllegalArgumentException.class, () -> {calculo.raizCuadrada(-4);});
        Assert.assertEquals(3, calculo.raizCuadrada(9), 0.001);
        Assert.assertEquals(8.306, calculo.raizCuadrada(69), 0.001);
        Assert.assertEquals(0, calculo.raizCuadrada(0), 0.001);
    }
}
