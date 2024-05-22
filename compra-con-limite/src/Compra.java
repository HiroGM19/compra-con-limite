public class Compra implements Comparable<Compra> {
    private double valor;
    private String producto;

    public Compra(String producto,double valor) {
        this.valor = valor;
        this.producto = producto;
    }

    public double getValor() {
        return valor;
    }

    public String getProducto() {
        return producto;
    }

    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripcion='" + producto;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}

