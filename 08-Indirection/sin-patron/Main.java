class ServicioCorreo {
    void enviar(String destino, String mensaje) {
        System.out.println("Correo a " + destino + ": " + mensaje);
    }
}

class Pedido {
    void confirmar() {
        ServicioCorreo correo = new ServicioCorreo();
        correo.enviar("cliente@mail.com", "Pedido confirmado");
    }
}

public class Main {
    public static void main(String[] args) {
        new Pedido().confirmar();
    }
}
