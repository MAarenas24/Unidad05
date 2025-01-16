package unidad05.enumerados.ejemplo03;

/**
 *
 * @author Miguel Angel Arenas
 */
public enum Semaforo {
    ROJO,
    AMARILLO,
    VERDE;
    
    public Semaforo cambiarEstado() {
        switch (this) {
            case ROJO:
                return VERDE;
            case VERDE:
                return AMARILLO;
            case AMARILLO:
                return ROJO;
            default:
                return null;
        }
    }
}
