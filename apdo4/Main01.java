package unidad05.apdo4;

import java.util.ArrayList;

/**
 * Lo suyo esque una estructura de datos sea homojenea, osea que tenga datos
 * del mismo tipo
 * 
 * @author tarde
 */
public class Main01 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Pepe");
        nombres.add("jose");
        nombres.add("Arturo");
        nombres.add("Anselmo");
        
        System.out.println("nombres = " + nombres);
        System.out.println("--------------------------");
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(6);
        notas.add(8);
        notas.add(10);
        System.out.println("notas = " + notas);
    }
}
