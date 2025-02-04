package unidad05.ejercicios;

/**
 * Inicializar matriz simple. 
 * Escribe un programa en el que se defina una matriz de 10x10 números enteros. 
 * Inicializa todos los elementos al valor –1.
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        
        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columnas = 0; columnas < matriz[fila].length; columnas ++) {
                matriz[fila][columnas] = -1;
            }
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna ++) {
                System.out.print(matriz[fila][columna] + ", ");
            }
            System.out.println("");
        }
    }
}
