public interface Serializable<T>{
    public String serializar(T objeto);
    public T deserializar(String cadena);
}