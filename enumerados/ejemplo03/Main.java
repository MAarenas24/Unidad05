package unidad05.enumerados.ejemplo03;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = Semaforo.VERDE;
        System.out.println(semaforo);
        
        semaforo = semaforo.cambiarEstado();
        System.out.println(semaforo);
        
        semaforo = semaforo.cambiarEstado();
        System.out.println(semaforo);
        
        semaforo = semaforo.cambiarEstado();
        System.out.println(semaforo);
        
        semaforo = semaforo.cambiarEstado();
        System.out.println(semaforo);
    }
}
