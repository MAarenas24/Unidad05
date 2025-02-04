package unidad05.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio26 {

    public static void main(String[] args) {

        char[][] sopa = new char[8][8];

        String palabraABuscar = "SIERRA".toUpperCase();

        int huecosLibres = sopa.length - palabraABuscar.length();

        int lineaDeLaPalabra = (int) (Math.random() * 8);
        int columnaDeLaPalabra = (int) (Math.random() * (huecosLibres + 1));

        inicializarMatriz(sopa, lineaDeLaPalabra, columnaDeLaPalabra, palabraABuscar.toCharArray());
        imprimirMatriz(sopa);

    }

    public static void inicializarMatriz(char[][] sopa, int filaDeLaPalabra,int columnaDeLaPalabra, char[] palabraABuscar) {
        int posicionAInsertar = 0;
        for (int fila = 0; fila < sopa.length; fila++) {
            for (int columna = 0; columna < sopa[fila].length; columna++) {
                if (fila == filaDeLaPalabra && columna >= columnaDeLaPalabra && posicionAInsertar < palabraABuscar.length) {
                    sopa[fila][columna] = palabraABuscar[posicionAInsertar];
                    posicionAInsertar++;
                } else {
                    sopa[fila][columna] = (char) (Math.random() * (90 + 1 - 65) + 65);
                }

            }
        }

    }

    public static void imprimirMatriz(char[][] sopa) {

        for (int i = 0; i < sopa.length; i++) {

            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }

}