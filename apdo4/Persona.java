package unidad05.apdo4;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{nombre = " + nombre + ", edad = " + edad + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        
        Persona persona = (Persona) o;
        
        return persona.nombre.equals(this.nombre) 
                && persona.edad == this.edad;
        
    }
    
}
