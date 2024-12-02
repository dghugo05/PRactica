public class Inventario {
    Repositorioinventario linea;

    public Inventario(Repositorioinventario lin){
        linea = lin;
    }

    public boolean comprueba(String producto){
        return linea.enInventario(producto);
    }

    public void eliminarEnInventario(String producto){
        linea.eliminarProducto(producto);
    }
}
