package unidad05.enumerados.ejemplo01;

/**
 *
 * @author Miguel Angel Arenas
 */
public class DiasSemana02 {

    public static void main(String[] args) {
        System.out.println(DiasSemana.VIERNES.getNombre());
        System.out.println(DiasSemana.VIERNES.getNombreCorto());

        System.out.println(getNombreDia(DiasSemana.LUNES));
        
    }

    public static String getNombreDia(DiasSemana dia) {
        switch (dia) {
            case LUNES:
                return "Lunes";
            case MARTES:
                return "Martes";
            default:
                return "Error";
        }
    }
}
