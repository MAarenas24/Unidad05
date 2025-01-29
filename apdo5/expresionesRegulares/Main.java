package unidad05.apdo5.expresionesRegulares;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Valida matricula = " + validarMatriculaMal("1234BGD"));
//        
//        System.out.println("------------------");
                
        //Comprobar si es juan angel, jose angel o miguel angel
        String texto = "juan angel";
        String patron = "(jose|miguel|juan) angel";
        validarTexto(texto, patron);
                
        //Comprobar si el patron se repite 0, 1 o mas veces
        texto = "aaaaa";
        patron = "a*";
        validarTexto(texto, patron);

        texto = "rrocacacarro";
        patron = "(ca|rro)*";
        validarTexto(texto, patron);        
        
        //Comprobar si el patron se repite 1 o mas veces
        texto = "";
        patron = "a+";
        validarTexto(texto, patron);
        
        texto = "a";
        validarTexto(texto, patron);
        
        texto = "aab";
        validarTexto(texto, patron);
        
        //Comprobar si el patron se repite n veces exactamente
        texto = "aa";
        patron = "a{2}";
        validarTexto(texto, patron);
        
        texto = "aaaaa";
        validarTexto(texto, patron);
        
        texto = "";
        validarTexto(texto, patron);
        
        //Comprobar si el patron se repite entre n y m veces exactamente
        texto = "aa";
        patron = "a{2,3}";
        validarTexto(texto, patron);
        
        texto = "aaa";
        validarTexto(texto, patron);
        
        texto = "aaaa";
        validarTexto(texto, patron);
        
        texto = "a";
        validarTexto(texto, patron);
        
        texto = "caa";
        patron = "ca{2}";
        validarTexto(texto, patron);
        
        texto = "ccaa";
        patron = "ca{2}";
        validarTexto(texto, patron);
        
        texto = "caca";
        patron = "(ca){2}";
        validarTexto(texto, patron);
        
        texto = "caca";
        patron = "(ca|ro){2}";
        validarTexto(texto, patron);
        
        texto = "caro";
        validarTexto(texto, patron);
        
        texto = "roca";
        validarTexto(texto, patron);

        //Comprobar si el texto contiene uno de varios caracteres
        texto = "a";
        patron = "[aeiou]";
        validarTexto(texto, patron);
        
        texto = "o";
        validarTexto(texto, patron);
        
        texto = "d";
        validarTexto(texto, patron);

        texto = "pepa";
        patron = "pep[ae]";
        validarTexto(texto, patron);
        
        texto = "pepe";
        validarTexto(texto, patron);
        
        texto = "pepi";
        validarTexto(texto, patron);
        
        //Comprobar si el texto tiene uno de un rango de caracteres
        texto = "a";
        patron = "[a-z]";
        validarTexto(texto, patron);
        
        texto = "A";
        validarTexto(texto, patron);
        
        texto = "A";
        patron = "[a-zA-Z]";
        validarTexto(texto, patron);

        //Comprobar si el texto es un digito
        texto = "5";
        patron = "[0-9]";
        validarTexto(texto, patron);
        
        texto = "b";
        patron = "[0-9]";
        validarTexto(texto, patron);
        
        //Comprobar si el texto es un numero de 3 digitos
        texto = "532";
        patron = "[0-9]{3}";
        validarTexto(texto, patron);
        
        texto = "53";
        validarTexto(texto, patron);
        
        texto = "5327";
        validarTexto(texto, patron);
        
        //Comprobar si el texto comienza por el 1 y acaba con la z
        texto = "1z";
        patron = "^1.*z$";
        validarTexto(texto, patron);
        
        texto = "12342432sdfsfdsz";
        validarTexto(texto, patron);
        
        texto = "123423634562asdadsZ";
        validarTexto(texto, patron);
        
        //Comprobar si el texto comienza por el 1 y acaba con (.)
        texto = "1z";
        patron = "^1.*\\.$";
        validarTexto(texto, patron);
        
        texto = "1z.";
        validarTexto(texto, patron);
        
        //Comprobar si el texto comienza por el 1 y acaba con algo entre parentesis
        texto = "1z()";
        patron = "^1.*\\(.*\\)$";
        validarTexto(texto, patron);
        
        texto = "1z(asda)";
        validarTexto(texto, patron);
        
        texto = "1z(asda).";
        validarTexto(texto, patron);
        
        //Comprobar si el texto es un numero, que puede ser negativo
        texto = "65";
        patron = "-?[0-9]+";
        validarTexto(texto, patron);
        
        texto = "-65";
        validarTexto(texto, patron);
        
        texto = "-0";
        validarTexto(texto, patron);
        
        //Comprobar lo anterior, evitando el -0
        texto = "-0";
//        patron = "-?[1-9][0-9]+";
//        patron = "(-?[1-9]|0)[0-9]*";
        patron = "(-?[1-9][0-9]*|0)";
        validarTexto(texto, patron);
        
        texto = "-10";
        validarTexto(texto, patron);

        texto = "0";
        validarTexto(texto, patron);

        
        
    }
    
    public static boolean validarMatricula(String matricula) {
        return true;
    }
    
    public static void validarTexto(String texto, String regExp) {
        System.out.println("-------------------");
        System.out.println("texto = " + texto);
        System.out.println("patron = " + regExp);
        if (texto.matches(regExp)) {
            System.out.println("Concuerda con el patron");
        } else {
            System.out.println("Expresion incorrecta");
        }
    }
    
    public static boolean validarMatriculaMal(String matricula) {
        if (matricula.length() != 7) return false;
        String digitos = matricula.substring(0, 4);
        try {
            Integer numero = Integer.valueOf(digitos);
            if (numero < 0) return false;
        } catch (NumberFormatException e) {
            return false;
        }
        String letras = matricula.substring(4).toUpperCase();
        if (letras.contains("A") 
                || letras.contains("E") 
                || letras.contains("I") 
                || letras.contains("O") 
                || letras.contains("U"))
            return false;
        
        return true;
    }
    
}
