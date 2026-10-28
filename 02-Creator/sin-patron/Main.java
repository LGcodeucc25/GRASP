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

    void agregar(ProductoCarrito producto) {
        productos.add(producto);
    }
}

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        ProductoCarrito producto = new ProductoCarrito("Libro");
        carrito.agregar(producto);
        System.out.println(producto.nombre);
    }
}
