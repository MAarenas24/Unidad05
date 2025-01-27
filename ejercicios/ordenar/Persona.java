package unidad05.ejercicios.ordenar;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double peso;

    public Persona(String nombre, String apellidos, int edad, String dni, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellidos = apellidos;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{nombre = " + nombre + ", apellidos = " + apellidos + ", edad = " + edad + ", dni = " + dni + ", peso = " + peso + '}';
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
    
//    /**
//     * Comparamos las personas por edad.
//     * @param p
//     * @return 
//     */
//    @Override
//    public int compareTo(Persona p) {
//        return this.edad - p.edad;
////        return this.nombre.compareTo(p.nombre);
//    }
    
//    /**
//     * Comparamos las personas por nombre y apellidos.
//     * @param p
//     * @return 
//     */
//    @Override
//    public int compareTo(Persona p) {
//        if (this.nombre.equals(p.nombre)) {
//            return this.apellidos.compareTo(p.apellidos);
//        }
//        return this.nombre.compareTo(p.nombre);
//    }

    /**
     * Comparamos las personas por nombre y apellidos.
     * @param p
     * @return 
     */
    @Override
    public int compareTo(Persona p) {
        //Alternativa1, muy buena:
//        if (this.peso > p.peso) return 1;
//        if (this.peso == p.peso) return 0;
//        if (this.peso < p.peso) return -1;

        //Alternativa 2:
        Double thisPeso = this.peso;
        Double pPeso = p.peso;
        return thisPeso.compareTo(pPeso);
    }
    
}
