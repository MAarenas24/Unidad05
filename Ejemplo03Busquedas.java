package unidad05;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejemplo03Busquedas {

    public static void main(String[] args) {
        //Inicializar un array:
        int[] edades = {
            34,
            55,
            61,
            98,
            12
        };

        //Inicializar una matriz
        int[][] notas = {
            {3, 8, 9, 5},
            {10, 10, 10, 10, 10},
            {0}
        };

        printMatriz(notas);
        System.out.println("---------------------");
        printMatriz2(notas);
        System.out.println("---------------------");
        int numeroBuscar = 98;
        System.out.printf("Buscando personas con %d años...%n ", numeroBuscar);
        if (contains(edades, numeroBuscar)) {
            System.out.println("Hay personas con esa edad");
        } else {
            System.out.println("No hay personas con esa edad");
        }

        System.out.println("---------------------");

        numeroBuscar = 8;
        System.out.printf("Buscando NOTAS que sean%d... %n ", numeroBuscar);
        for (int i = 0; i < notas.length; i++) {
            if (contains(notas[i], numeroBuscar)) {
                System.out.println("La fila " + notas[i] + " si contiene la NOTA");
            } else {
                System.out.println("La fila " + notas[i] + " no contiene la NOTA");
            }
        }
    }
    
    /**
     * Comprobar si el numero a buscar esta en el array
     * @param array
     * @param numeroABuscar
     * @return 
     */
    public static boolean contains(int[] array, int numeroABuscar) {
        for (int numero : array) {
            if (numero == numeroABuscar) {
                return true;
            }
        }
        return false;
    }

    private static void printMatriz(int[][] notas) {
        for (int[] fila : notas) {
            for (int nota : fila) {
                System.out.print(nota + " ");
            }
            System.out.println("");
        }
    }

    private static void printMatriz2(int[][] notas) {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
