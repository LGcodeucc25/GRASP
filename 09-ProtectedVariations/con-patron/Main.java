interface Notificador {
    void notificar(String mensaje);
}

class NotificadorCorreo implements Notificador {
    public void notificar(String mensaje) {
        System.out.println("Correo: " + mensaje);
    }
}

class NotificadorSMS implements Notificador {
    public void notificar(String mensaje) {
        System.out.println("SMS: " + mensaje);
    }
}

class Pedido {
    void confirmar(Notificador notificador) {
        notificador.notificar("Pedido confirmado");
    }
}

public class Main {
    public static void main(String[] args) {
        new Pedido().confirmar(new NotificadorSMS());
    }
}
