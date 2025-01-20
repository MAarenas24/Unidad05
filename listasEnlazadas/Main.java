package unidad05.listasEnlazadas;

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
        
    }
}
