package unidad05.ejercicios;

import java.util.Scanner;

/**
 * Permutar filas. 
 * Escribe un programa que defina una matriz de 3x5 números enteros y luego 
 * pida al usuario que introduzca los valores de cada elemento. Después, debe 
 * permutar el contenido de la fila 3 por el de la fila 1, y mostrar por último 
 * el contenido de la matriz.
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio16 {
    static Scanner entradaTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("----------");
        permutarMatriz(matriz);
        imprimirMatriz(matriz);
    }
    
    public static void permutarMatriz(int[][] matriz) {
        int[][] matrizAux = new int[1][5];
        for (int filas = 0; filas < 1; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                matrizAux[filas][columnas] = matriz[filas][columnas];
                matriz[filas][columnas] = matriz[matriz.length - 1][columnas];
                matriz[matriz.length - 1][columnas] = matrizAux[filas][columnas];
            }
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
