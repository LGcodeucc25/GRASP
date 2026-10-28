class Direccion {
    private String ciudad = "Pasto";

    String getCiudad() {
        return ciudad;
    }
}

class Cliente {
    private Direccion direccion = new Direccion();

    Direccion getDireccion() {
        return direccion;
    }
}

class Pedido {
    private Cliente cliente = new Cliente();

    Cliente getCliente() {
        return cliente;
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println(pedido.getCliente().getDireccion().getCiudad());
    }
}
