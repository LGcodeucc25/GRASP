interface MetodoPago {
    void pagar(double monto);
}

class PagoTarjeta implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pago con tarjeta: " + monto);
    }
}

class PagoPSE implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pago con PSE: " + monto);
    }
}

class PagoNequi implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pago con Nequi: " + monto);
    }
}

class Pedido {
    private MetodoPago metodoPago;

    Pedido(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    void pagar(double monto) {
        metodoPago.pagar(monto);
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new PagoPSE());
        pedido.pagar(50000);
    }
}
