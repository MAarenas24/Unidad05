package unidad05.apdo5.expresionesRegulares;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejemplos {
    public static void main(String[] args) {
        System.out.println("Entero: " + validaEntero("60"));
        System.out.println("Entero: " + validaEntero("-60.0"));
        System.out.println("Telefono: " + validaTelefonoEs("+34123456789"));
        System.out.println("Matricula: " + validamatricula(""));
    }
    
    public static boolean validaEntero(String s) {
        return s.matches("(-?[1-9][0-9]*|0)");
    }
    
    public static boolean validaReal(String s) {
        return s.matches("(-?[1-9][0-9]*|0)(\\.[0-9]+)?");
    }
    
    public static boolean validaTelefonoEs(String s) {
        return s.matches("^\\+34[0-9]{9}");
    }
    
    /**
     * Las letras no incluyen vocales
     * @param s
     * @return 
     */
    public static boolean validamatricula(String s) {
        return s.matches("^[0-9]{4}[A-Z&&[^AEIOU]]{3}");
    }
}
