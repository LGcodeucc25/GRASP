class ItemPedido {
    double precio = 10;
    int cantidad = 2;
}

class Pedido {
    ItemPedido item = new ItemPedido();

    double calcularTotal() {
        return item.precio * item.cantidad;
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println(pedido.calcularTotal());
    }
}
