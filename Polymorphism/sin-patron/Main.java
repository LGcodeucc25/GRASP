class PagoTarjeta {
    void pagarConTarjeta(double monto) {
        System.out.println("Pago con tarjeta: " + monto);
    }
}

class PagoPSE {
    void pagarConPSE(double monto) {
        System.out.println("Pago con PSE: " + monto);
    }
}

class PagoNequi {
    void pagarConNequi(double monto) {
        System.out.println("Pago con Nequi: " + monto);
    }
}

class Pedido {
    void pagar(String tipo, double monto) {
        if (tipo.equals("tarjeta")) {
            new PagoTarjeta().pagarConTarjeta(monto);
        } else if (tipo.equals("pse")) {
            new PagoPSE().pagarConPSE(monto);
        } else if (tipo.equals("nequi")) {
            new PagoNequi().pagarConNequi(monto);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.pagar("pse", 50000);
    }
}
