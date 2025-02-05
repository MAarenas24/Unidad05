package unidad05.ejercicios.practicar;

import java.util.ArrayList;
import java.util.Collections;

/**
 * EJERCICIO 2: 
 * Genera un List de Integer y rellénalo con valores positivos y negativos. 
 * Posteriormente recorre el ArrayList y borra los valores negativos, y 
 * finalmente muestra por pantalla el contenido del ArrayList. (prueba con 
 * varias alternativas, incluyendo una que tenga todo número positivos, y otra 
 * que tenga todo número negativos)
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * (10 + 9) - 9));
        }
        System.out.println(lista.toString());
        
        Collections.sort(lista);
        System.out.println(lista.toString());
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < 0) {
                lista.remove(i);
                i--;
            }
        }
        System.out.println(lista.toString());
    }
}
