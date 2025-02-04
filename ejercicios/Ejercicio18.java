package unidad05.ejercicios;

import java.util.Scanner;

/**
 * Geometría de matrices. 
 * Escribe un programa que utilice una matriz de 5x5 enteros para:
 * • Pedir por teclado el valor de todos sus elementos.
 * • Imprimir por pantalla la diagonal principal.
 * • Calcular la media de la triangular superior
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio18 {
    static Scanner entradaTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("----------");
        imprimirDiagonal(matriz);
        System.out.println("---------");
        imprimirDiagonalSuperior(matriz);
        
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
//                System.out.println("Introduce numero de la fila " + filas + " y columna " + columnas);
//                int numero = Integer.parseInt(entradaTeclado.nextLine());
                matriz[filas][columnas] = (int) (Math.random() * 10);
            }
        }
    }
    
    private static void imprimirDiagonal(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                if (filas == columnas) {
                    System.out.print(matriz[filas][columnas] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    private static void imprimirDiagonalSuperior(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                if (filas <= columnas) {
                    System.out.print(matriz[filas][columnas]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
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
