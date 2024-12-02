public class CalculadoraAvanzada {
    public double potencia(double base, int exponente){
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double radicando) throws IllegalArgumentException{
        if (radicando < 0) {
            throw new IllegalArgumentException("No es posible calcular la raíz cuadrado de un número negativo");
        }else{
            return Math.sqrt(radicando);
        }
    }   
}
