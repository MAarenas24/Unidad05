package unidad05.ejercicios.practicar;

import java.util.HashMap;

/**
 * EJERCICIO 3:
 * Genera un Map String,Integer y rellénalo con claves tipo string y con valores 
 * positivos y negativos. Posteriormente recorre el Map y borra las entradas 
 * con valores negativos, y finalmente muestra por pantalla el contenido del 
 * Map. (prueba con varias alternativas, incluyendo una que tenga todo número 
 * positivos, y otra que tenga todo número negativos)
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        HashMap<String, Integer> proporcion = new HashMap<String, Integer>();
        
        proporcion.put("PoSoiMiguel", 20);
        proporcion.put("Heisenk", -50);
        proporcion.put("Valky", -100);
        proporcion.put("Ivxn", 100);
        
        System.out.println(proporcion.toString());
        
        for (Integer valor : proporcion.values()) {
            if (valor < 0) {
                System.out.println(valor);
            }
        }
        System.out.println(proporcion.toString());
    }
}
