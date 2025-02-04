package unidad05.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        String texto = "Hola a todos vamos a jugar un COD";
        char[] cadena = texto.toCharArray();

        for (int i = 0; i < cadena.length; i++) {
            if (esVocal(cadena[i])) {
                cadena[i] = '*';
            }
        }

        for (char c : cadena) {
            System.out.print(c);
        }
        System.out.println("");

        //Ejercicio subcadenas
        String cad1 = "El perro de San Roque perro";
        String cad2 = "perro";
        String cadAst = "";
        
        for (int i = 0; i < cad2.length(); i++) {
            cadAst += "*";
        }

        if (cad1.contains(cad2)) {
            cad1 = cad1.replace(cad2, cadAst);
        }
        System.out.println(cad1);
    }

    public static boolean esVocal(char c) {
        char letra = Character.toLowerCase(c);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
