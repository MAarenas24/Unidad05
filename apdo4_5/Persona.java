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
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        
        Persona persona = (Persona) o;
        
        return persona.dni.equals(this.dni);
        
    }
    
}