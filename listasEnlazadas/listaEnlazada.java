package unidad05.listasEnlazadas;

/**
 *
 * @author Miguel Angel Arenas
 */
public class listaEnlazada {
    
    class Nodo {
        int dato;
        Nodo siguiente;
    }
    
    private Nodo lista;
    
    public boolean isEmpty() {
        return (lista == null);
    }
    
    public void insert(int nuevoNumero) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = nuevoNumero;
        
        if (isEmpty()) {
            lista = nuevoNodo;
        } else {
            nuevoNodo.siguiente = lista;
            lista = nuevoNodo;
        }
    }
    
    /**
     * Se puede implementar un contadro como otra propiedad de ListaEnlazada y
     * que se actualize cada vez que se añadan o se borren elementos de la lista
     * @return 
     */
    public int size() {
//        if (isEmpty()) return 0;
        
        Nodo nodoAux = lista;
        int contador = 0;
        while (nodoAux != null) {
            contador++;
            nodoAux = nodoAux.siguiente;
        }
        return contador;
    }
    
    public void printLista() {
        if (isEmpty()) {
            System.out.println("[ ]");
            return;
        }
        
        Nodo nodoAux = lista;
        do {
            System.out.println(nodoAux.dato);
            nodoAux = nodoAux.siguiente;
        } while(nodoAux != null);
        
    }
    
}
