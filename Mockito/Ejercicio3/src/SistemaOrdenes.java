public class SistemaOrdenes {
    ProveedorDescuentos total;

    public SistemaOrdenes(ProveedorDescuentos tot){
        total = tot;
    }

    public double calcDescuento(String descuento, double precio){
        int desc = total.descontar(descuento);
        return (precio-((desc*precio)/100));
    }
}
