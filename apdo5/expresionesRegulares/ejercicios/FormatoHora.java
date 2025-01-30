package unidad05.apdo5.expresionesRegulares.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class FormatoHora {
    public static void main(String[] args) {
        String hora = "23:59";
        System.out.println("Hora " + hora + " es valida: " + validaHora(hora));
    }
    
    /**
     * Valida si el texto respeta el formato de hora HH:MM
     * @param hora
     * @return 
     */
    public static boolean validaHora(String hora) {
        return hora.matches("([01][0-9]|2[0-3]):([0-5][0-9])");
    }
    
}
