package unidad05.enumerados.ejemplo01;

/**
 *
 * @author Miguel Angel Arenas
 */
public enum DiasSemana {
    LUNES("Lunes", "lun", "L", "Es laboral"),
    MARTES("Martes", "mar", "M", "Es laboral"),
    MIERCOLES("Miercoles", "mie", "X", "Es laboral"),
    JUEVES("Jueves", "jue", "J", "Es laboral"),
    VIERNES("Viernes", "vie", "V", "Es laboral"),
    SABADO("Sabado", "sab", "S", "No es laboral"),
    DOMINGO("Domingo", "dom", "D", "No es laboral");
    
    private final String nombre;
    private final String nombreCorto;
    private final String abreviacion;
    private final String diaLaboral; 

    private DiasSemana(String nombre, String nombreCorto, String abreviacion, String diaLaboral) {
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
        this.abreviacion = abreviacion;
        this.diaLaboral = diaLaboral;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getNombreCorto() {
        return nombreCorto;
    }
    
    public String getAbreviacion() {
        return abreviacion;
    }

    public String getDiaLaboral() {
        return diaLaboral;
    }
    
    
}
