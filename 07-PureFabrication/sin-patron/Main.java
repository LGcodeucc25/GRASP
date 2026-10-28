class Pedido {
    String codigo = "P001";
    double total = 50000;

    void guardarEnBD() {
        System.out.println("Conectando a la base de datos...");
        System.out.println("Pedido " + codigo + " guardado");
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.guardarEnBD();
    }
}
