import java.util.ArrayList;
import java.util.List;

class ProductoCarrito {
    String nombre;

    ProductoCarrito(String nombre) {
        this.nombre = nombre;
    }
}

class CarritoCompras {
    List<ProductoCarrito> productos = new ArrayList<>();

    void agregarProducto(String nombre) {
        productos.add(new ProductoCarrito(nombre));
    }
}

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto("Libro");
        System.out.println(carrito.productos.get(0).nombre);
    }
}
