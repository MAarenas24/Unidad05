package unidad05.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * hacer una matriz de char y rellenar
 *
 * @author Miguel Angel Arenas
 */
public class Matriz {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el numero de filas: ");
        int numFilas = Integer.parseInt(entradaTeclado.nextLine());

        System.out.println("Introduce el numero de columnas: ");
        int numColumnas = Integer.parseInt(entradaTeclado.nextLine());

        char[][] matriz = new char[numFilas][numColumnas];

        imprimirMatriz(matriz);
        
        filaParesEImpares(matriz);
        imprimirMatriz(matriz);
        
        columnasParesEImpares(matriz);
        imprimirMatriz(matriz);
    }

    public static void filaParesEImpares(char[][] matriz) {
        boolean esPar = false;
        char letraRelleno = 'p';

        for (int fila = 0; fila < matriz.length; fila++) {
            esPar = (fila % 2 == 0);

            letraRelleno = esPar ? 'p' : 'i';
            
//            if (esPar) {
//                letraRelleno = 'p';
//            }
//            if (!esPar) {
//                letraRelleno = 'i';s
//            }

            //Mas tradicional
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = letraRelleno;
            }

            //Otra forma con la clase Arrays
            Arrays.fill(matriz[fila], letraRelleno);
        }
    }

    public static void columnasParesEImpares(char[][] matriz) {
        boolean esPar = false;
        char letraRelleno = 'p';
        
        letraRelleno = esPar ? 'p' : 'i';
        
//        if (esPar) {
//            letraRelleno = 'p';
//        }
//        if (!esPar) {
//            letraRelleno = 'i';
//        }

        for (int columna = 0; columna < matriz[0].length; columna++) {
            esPar = (columna % 2 == 0);

            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna] = letraRelleno;
            }
        }
    }

    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz);
            }
            System.out.println("");
        }

//        Arrays.toString(matriz);
    }

}
