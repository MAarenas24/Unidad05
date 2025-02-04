package unidad05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio19 {

    static Scanner entradaTeclado = new Scanner(System.in);
    static final int NUMERO_MATRIZ = 5;

    public static void main(String[] args) {
        int[][] matriz = new int[NUMERO_MATRIZ][NUMERO_MATRIZ];
        int opcion;

        rellenarMatriz(matriz);

        do {
            imprimirMenu();
            opcion = Integer.parseInt(entradaTeclado.nextLine());

            switch (opcion) {
                case 1:
                    imprimirMatriz(matriz);
                    break;
                case 2:
                    mostrarPerimetro(matriz);
                    break;
                case 3:
                    mostrarEspiral(matriz);
                    break;
                case 4:
                    System.out.println("Has salido gracias por usar este programa");
                    break;
                default:
                    System.out.println("ERROR!!");
            }
            System.out.println("--------");
        } while (opcion != 4);

    }

    public static void imprimirMenu() {
        System.out.println("Selecciona la opcion que quieras hacer (1, 2, 3, 4): ");
        System.out.println("1. Mostrar matriz");
        System.out.println("2. Perimetro");
        System.out.println("3. Espiral");
        System.out.println("4. Salir");
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                matriz[filas][columnas] = (int) (Math.random() * 10);
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

    private static void mostrarPerimetro(int[][] matriz) {
        int filas, columnas;

        //PRIMERA LINEA
        filas = 0;
        for (columnas = 0; columnas < matriz[filas].length; columnas++) {
            System.out.print(matriz[filas][columnas] + " ");
        }

        //ULTIMA COLUMNA
        columnas = matriz[filas].length - 1;
        for (filas = 1; filas < matriz.length; filas++) {
            System.out.print(matriz[filas][columnas] + " ");
        }

        //FILA ULTIMA
        filas = matriz.length - 1;
        for (columnas = matriz[filas].length - 2; columnas >= 0; columnas--) {
            System.out.print(matriz[filas][columnas] + " ");
        }

        //PRIMERA COLUMNA
        columnas = 0;
        for (filas = matriz.length - 2; filas > 0; filas--) {
            System.out.print(matriz[filas][columnas] + " ");
        }

        System.out.println("");
    }

    private static void mostrarEspiral(int[][] matriz) {
        int filaInicio = 0, filaFin = matriz.length - 1;
        int columnaInicio = 0, columnaFin = matriz[0].length - 1;

        while (filaInicio <= filaFin && columnaInicio <= columnaFin) {
            // Recorrer de izquierda a derecha
            for (int i = columnaInicio; i <= columnaFin; i++) {
                System.out.print(matriz[filaInicio][i] + " ");
            }
            filaInicio++;

            // Recorrer de arriba hacia abajo
            for (int i = filaInicio; i <= filaFin; i++) {
                System.out.print(matriz[i][columnaFin] + " ");
            }
            columnaFin--;

            // Recorrer de derecha a izquierda
            if (filaInicio <= filaFin) {
                for (int i = columnaFin; i >= columnaInicio; i--) {
                    System.out.print(matriz[filaFin][i] + " ");
                }
                filaFin--;
            }

            // Recorrer de abajo hacia arriba
            if (columnaInicio <= columnaFin) {
                for (int i = filaFin; i >= filaInicio; i--) {
                    System.out.print(matriz[i][columnaInicio] + " ");
                }
                columnaInicio++;
            }
        }

        System.out.println(""); // Nueva línea al final
    }
}
