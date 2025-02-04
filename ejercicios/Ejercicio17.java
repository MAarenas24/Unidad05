package unidad05.ejercicios;

import java.util.Scanner;

/**
 * Sumar matrices. 
 * Escribe un programa que defina dos matrices de 10x5 números enteros y las 
 * inicialice con números aleatorios entre 0 y 255. Posteriormente, cada 
 * elemento de la primera matriz debe ser sumado con el mismo elemento de la 
 * segunda matriz, guardando el resultado en una tercera matriz. Se deben sumar 
 * todas las parejas de elementos y mostrar el resultado en la pantalla.
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio17 {
    static Scanner entradaTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[10][5];
        int[][] matriz2 = new int[10][5];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("----------");
        
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
