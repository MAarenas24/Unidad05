package unidad05.apdo4_5.carrito01;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {

    public static void main(String[] args) {

        HashMap<Producto, Integer> carrito = new HashMap<>();

        carrito.put(new Producto("Casita de muñecas", "Famosa 001", "Famosa", 100), 1);

        carrito.put(new Producto("Bicicleta", "explorer", "bh", 1200), 1);

        for (Map.Entry<Producto, Integer> productoEnCarrito : carrito.entrySet()) {
            System.out.println("Productos: " + productoEnCarrito.getKey());
            System.out.println("Nº de articulos: " + productoEnCarrito.getValue());
            System.out.println("---------");
        }
        
        System.out.println("-------------------------------------------");
        
        Producto p1 = new Producto("Casita de muñecas", "Famosa 001", "Famosa", 100);
        if (carrito.containsKey(p1)) {
            carrito.put(p1, carrito.get(p1) + 1);
        } else {
            carrito.put(p1, 1);
        }
        
        System.out.println("-------------------------------------------");

        for (Map.Entry<Producto, Integer> productoEnCarrito : carrito.entrySet()) {
            System.out.println("Productos: " + productoEnCarrito.getKey());
            System.out.println("Nº de articulos: " + productoEnCarrito.getValue());
            System.out.println("---------");
        }
        System.out.println("-------------------------------------------");

//        Producto p1 = new Producto("Casita de muñecas", "Famosa 001", "Famosa", 100);
//        Producto p2 = new Producto("Bicicleta", "explorer", "bh", 1200);
//        System.out.println(p1);
//        System.out.println(p2);
    }
}
