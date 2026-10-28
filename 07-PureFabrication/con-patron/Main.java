class Pedido {
    String codigo = "P001";
    double total = 50000;
}

class RepositorioPedido {
    void guardar(Pedido pedido) {
        System.out.println("Conectando a la base de datos...");
        System.out.println("Pedido " + pedido.codigo + " guardado");
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        RepositorioPedido repositorio = new RepositorioPedido();
        repositorio.guardar(pedido);
    }
}
