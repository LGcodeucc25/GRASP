class Direccion {
    private String ciudad = "Pasto";

    String getCiudad() {
        return ciudad;
    }
}

class Cliente {
    private Direccion direccion = new Direccion();

    String obtenerCiudad() {
        return direccion.getCiudad();
    }
}

class Pedido {
    private Cliente cliente = new Cliente();

    String obtenerCiudadEnvio() {
        return cliente.obtenerCiudad();
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println(pedido.obtenerCiudadEnvio());
    }
}
