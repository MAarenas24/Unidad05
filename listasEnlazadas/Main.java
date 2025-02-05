package unidad05.listasEnlazadas;

import java.util.LinkedList;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    public static void main(String[] args) {
        
        listaEnlazada listaEnlazada = new listaEnlazada();
        if (listaEnlazada.isEmpty()) {
            System.out.println("La lista esta vacia");
        }
        
        System.out.println("Vamos a insertar los valores 3, 9 y 2");
        listaEnlazada.insert(3);
        System.out.println("Nº elementos = " + listaEnlazada.size());
        listaEnlazada.printLista();
        System.out.println("--------------");
        listaEnlazada.insert(9);
        System.out.println("Nº elementos = " + listaEnlazada.size());
        listaEnlazada.printLista();
        System.out.println("-----------------");
        listaEnlazada.insert(2);
        System.out.println("Nº elementos = " + listaEnlazada.size());
        listaEnlazada.printLista();
        System.out.println("-----------------");
        listaEnlazada.add(15);
        System.out.println("Nº elementos = " + listaEnlazada.size());
        listaEnlazada.printLista();
        
        System.out.println("----");
        LinkedList<Integer> listaEnlazada2 = new LinkedList<>();
        listaEnlazada2.add(4);
        listaEnlazada2.add(9);
        listaEnlazada2.add(11);
        System.out.println(listaEnlazada2.toString());
//        listaEnlazada2.is
    }
}
