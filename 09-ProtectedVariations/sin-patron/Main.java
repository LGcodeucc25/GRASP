class Notificador {
    void notificar(String canal, String mensaje) {
        if (canal.equals("correo")) {
            System.out.println("Correo: " + mensaje);
        } else if (canal.equals("sms")) {
            System.out.println("SMS: " + mensaje);
        }
    }
}

class Pedido {
    void confirmar(Notificador notificador) {
        notificador.notificar("sms", "Pedido confirmado");
    }
}

public class Main {
    public static void main(String[] args) {
        new Pedido().confirmar(new Notificador());
    }
}
