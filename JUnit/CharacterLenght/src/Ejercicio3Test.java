import org.junit.Assert;
import org.junit.Test;

public class Ejercicio3Test {
    @Test
    public void main(){
        NumeroCaracteres contar = new NumeroCaracteres();
        Assert.assertEquals(1, contar.contarCaracteres("Hola", 'o'));
        Assert.assertEquals(0, contar.contarCaracteres("Hola", 'i'));
    }
}
