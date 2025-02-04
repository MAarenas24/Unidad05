package unidad05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio15 {
    static Scanner entradaTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("----------");
        sumarMatrizFila(matriz);
        System.out.println("----------");
        sumarMatrizColumnas(matriz);
    }

    public static void sumarMatrizFila(int[][] matriz) {
        int sumaFila = 0;
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                sumaFila += matriz[filas][columnas];
            }
            System.out.println("Suma fila " + filas + " = " + sumaFila);
            sumaFila = 0;
        }
    }
    
    public static void sumarMatrizColumnas(int[][] matriz) {
        int sumaColumnas = 0;
        for (int columnas = 0; columnas < matriz.length; columnas++) {
            for (int filas = 0; filas < matriz[columnas].length; filas++) {
                sumaColumnas += matriz[filas][columnas];
            }
            System.out.println("Suma columnas " + columnas + " = " + sumaColumnas);
            sumaColumnas = 0;
        }
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.println("Introduce numero de la fila " + filas + " y columna " + columnas);
                int numero = Integer.parseInt(entradaTeclado.nextLine());
                matriz[filas][columnas] = numero;
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
