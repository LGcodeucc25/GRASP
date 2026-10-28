class Producto {
    boolean hayStock() {
        return true;
    }

    void descontarStock() {
        System.out.println("Stock descontado");
    }
}

class Pedido {
    void registrar() {
        System.out.println("Compra registrada");
    }
}

class ControladorCompra {
    void comprar(Producto producto, Pedido pedido) {
        if (producto.hayStock()) {
            producto.descontarStock();
            pedido.registrar();
        }
    }
}

class PantallaCompra {
    ControladorCompra controlador = new ControladorCompra();

    void comprar(Producto producto, Pedido pedido) {
        controlador.comprar(producto, pedido);
    }
}

public class Main {
    public static void main(String[] args) {
        new PantallaCompra().comprar(new Producto(), new Pedido());
    }
}
