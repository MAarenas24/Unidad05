package unidad05.ejercicios.practicar;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Jugador {
    private String nombre;
    private int edad;
    private String nombreEquipo;
    private int numCanastasIntroducidas;
    private String provincia;

    public Jugador(String nombre, int edad, String nombreEquipo, int numCanastasIntroducidas, String provincia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreEquipo = nombreEquipo;
        this.numCanastasIntroducidas = numCanastasIntroducidas;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getNumCanastasIntroducidas() {
        return numCanastasIntroducidas;
    }

    public String getProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", nombreEquipo=" + nombreEquipo + ", numCanastasIntroducidas=" + numCanastasIntroducidas + ", provincia=" + provincia + '}';
    }
    
    
}
