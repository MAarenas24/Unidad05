package unidad05.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);

    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                if (filas % 2 == 0) {
                    matriz[filas][columnas] = 0;
                } else {
                    matriz[filas][columnas] = 1;
                }
            }
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.print(matriz[filas][columnas] + " ");
            }
            System.out.println("");
        }
    }
}
