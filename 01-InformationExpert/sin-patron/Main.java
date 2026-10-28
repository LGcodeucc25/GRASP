class ItemPedido {
    double precio = 10;
    int cantidad = 2;
}

class Pedido {
    ItemPedido item = new ItemPedido();
}

class CalculadoraPedido {
    double calcularTotal(Pedido pedido) {
        return pedido.item.precio * pedido.item.cantidad;
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        CalculadoraPedido calculadora = new CalculadoraPedido();
        System.out.println(calculadora.calcularTotal(pedido));
    }
}
