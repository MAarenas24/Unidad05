package unidad05.apdo4_5;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Persona {

    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "{nombre = " + nombre + ", edad = " + edad + ", dni = " + dni + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Persona persona = (Persona) o;

        return persona.dni.equals(this.dni)
                && this.nombre.equals(persona.nombre)
                && this.edad == persona.edad;

    }

    @Override
    public int hashCode() {
        int resultado = 17;
        final int primo = 13;

        if (nombre != null) {
            resultado = primo * resultado + nombre.hashCode();
        }

        if (dni != null) {
            resultado = primo * resultado + dni.hashCode();
        }
        
        resultado = primo * resultado + Integer.valueOf(edad).hashCode();

        return resultado;
    }

}
