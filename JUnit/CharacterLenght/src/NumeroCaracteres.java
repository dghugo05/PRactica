public class NumeroCaracteres {
    public int contarCaracteres(String texto, char caracteres){
        int contador = 0;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == caracteres)
                contador++;
        }
        return contador;
    }
}
