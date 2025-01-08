package unidad05;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Ejemplo01 {

    public static void main(String[] args) {

        double media;
        int nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8;

        nota1 = 6;

        //Con arrays:
        int[] notas = new int[8];
        System.out.println("Notas: ");
        printArray(notas);

        System.out.println("Tamaño " + notas.length);
        
        notas[0] = 6;
        notas[1] = 7;
        notas[2] = 5;
        notas[3] = 9;
        notas[4] = 7;
        notas[5] = 8;
        notas[6] = 2;
        notas[7] = 1;

        printArray(notas);

        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11);
        }
        printArray(notas);

        int notasDefault = 1;
        System.out.println("notasDefault = " + notasDefault);
        inicializarArray(notas, notasDefault);
        System.out.println("notasDefault = " + notasDefault);
        printArray(notas);
        
        System.out.println("---------------------");
        
        //Definir array e inicializar al mismo tiempo
        int[] edades = {2, 5, 8, 4, 5, 7, 2};
        int[] edades20 = new int[]{20, 20, 20, 20, 20, 20, 20};
        
        System.out.println("Edades:");
        printArray(edades);
        System.out.println("Edades20: ");
        printArray(edades20);
        
        edades = edades20;
        edades[3] = 40;
        System.out.println("Edades:");
        printArray(edades);
        System.out.println("Edades20: ");
        printArray(edades20);
        
        System.out.println("---------------------");
        System.out.println("Edades: ");
        printArray(edades);
        
        inicializarArray(edades);
        
        System.out.println("Edades: ");
        printArray(edades);
        
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println("");
    }
    
    public static void inicializarArray(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numero;
        }
        numero += 10; //no se actualiza fuera de esta funcion
    }
    
    public static void inicializarArray(int[] array) {
//        No se puede desreferenciar un array dentro de una funcion por seguridad
//        array = new int[]{1, 1, 1, 1, 1, 1, 1, 1};

//        Si se puede cambiar elemento a elemento
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
    }
    
}
