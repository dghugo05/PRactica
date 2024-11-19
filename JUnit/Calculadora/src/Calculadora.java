public class Calculadora{
    public int suma(int num_a, int num_b){
        return (num_a+num_b);    
    }

    public int resta(int num_a, int num_b){
        return (num_a-num_b);
    }

    public int multiplicacion(int num_a, int num_b){
        return (num_a*num_b);
    }

    public int division(int num_a, int num_b) throws ArithmeticException{
        if (num_b != 0){
            return (num_a/num_b);
        }else{
            throw new ArithmeticException("No es posible dividir entre 0.");
        }
    }
}
