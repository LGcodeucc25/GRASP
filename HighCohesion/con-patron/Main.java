import java.util.ArrayList;
import java.util.List;

class ItemPedido {
    double precio = 10;
    int cantidad = 2;
}

class Pedido {
    List<ItemPedido> items = new ArrayList<>();

    Pedido() {
        items.add(new ItemPedido());
    }

    double calcularTotal() {
        double total = 0;
        for (ItemPedido item : items) {
            total += item.precio * item.cantidad;
        }
        return total;
    }
}

class NotificadorPedido {
    void enviarCorreo(Pedido pedido) {
        System.out.println("Correo enviado. Total: " + pedido.calcularTotal());
    }
}

class RepositorioPedido {
    void guardar(Pedido pedido) {
        System.out.println("Pedido guardado en la base de datos");
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println(pedido.calcularTotal());
        new NotificadorPedido().enviarCorreo(pedido);
        new RepositorioPedido().guardar(pedido);
    }
}
