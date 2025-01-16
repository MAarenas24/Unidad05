package unidad05.enumerados.ejemplo01;

/**
 *
 * @author Miguel Angel Arenas
 */
public enum DiasSemana {
    LUNES("Lunes", "lun"),
    MARTES("Martes", "mar"),
    MIERCOLES("Miercoles", "mie"),
    JUEVES("Jueves", "jue"),
    VIERNES("Viernes", "vie"),
    SABADO("Sabado", "sab"),
    DOMINGO("Domingo", "dom");
    
    private final String nombre;
    private final String nombreCorto;

    private DiasSemana(String nombre, String nombreCorto) {
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getNombreCorto() {
        return nombreCorto;
    }
    
}
