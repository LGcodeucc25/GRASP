class ServicioCorreo {
    void enviar(String destino, String mensaje) {
        System.out.println("Correo a " + destino + ": " + mensaje);
    }
}

class Notificador {
    void notificar(String mensaje) {
        ServicioCorreo correo = new ServicioCorreo();
        correo.enviar("cliente@mail.com", mensaje);
    }
}

class Pedido {
    void confirmar() {
        Notificador notificador = new Notificador();
        notificador.notificar("Pedido confirmado");
    }
}

public class Main {
    public static void main(String[] args) {
        new Pedido().confirmar();
    }
}
