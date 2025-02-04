package unidad05.ejercicios.ejercicioClase01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pedir por teclado el numero de elemenots del array El array podra añadir
 * elementos (por el final) o insertarlos (por el principio). Si el array esta
 * lleno, no admitira mas numeros
 *
 * @author Miguel Angel Arenas
 */
public class MiArray {

    private static final int LENGTH_INCREMENTO = 5;
    private Scanner entradaTeclado = new Scanner(System.in);
    private int[] array;
    private int elementosOcupados = 0;

    public MiArray(int length) {
        array = new int[length];
    }

    public MiArray() {
        setArray();
    }

    public int length() {
        return elementosOcupados;
    }

    public boolean estaLleno() {
        return elementosOcupados == array.length;
    }

    public boolean isEmpty() {
        return elementosOcupados == 0;
    }

    public void add() {
        int nuevoNumero = leerNumeroDeTeclado("Introduzca el numero a añadir");
        add(nuevoNumero);
    }

    private void add(int numeroAlFinal) {
        if (estaLleno()) {
            System.out.printf("El numero %d no se ha añadido. El array esta lleno", numeroAlFinal);
            return;
        }
        array[elementosOcupados++] = numeroAlFinal;
        System.out.printf("El numero %d se ha insertado correctamente%n", numeroAlFinal);
        System.out.println(Arrays.toString(array));
    }

    public void insertar() {
        int nuevoNumero = leerNumeroDeTeclado("Introduzca el numero a insertar");
        insertar(nuevoNumero);
    }

    private void insertar(int numeroAlPrincipio) {
        if (estaLleno()) {
            System.out.printf("El numero %d no se ha insertado. El array esta lleno", numeroAlPrincipio);
            return;
        }
        //Desplazamos los datos a la derecha
        for (int i = elementosOcupados; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = numeroAlPrincipio;
        elementosOcupados++;
        System.out.printf("El numero %d se ha insertado correctamente%n", numeroAlPrincipio);
        System.out.println(Arrays.toString(array));
    }

    public void insertar(int numAInsertar, int posicion) {
        if (estaLleno()) {
            System.out.printf("El numero %d no se ha insertado. El array esta lleno", numAInsertar);
            return;
        }
        try {
            for (int i = elementosOcupados; i > posicion; i--) {
                array[i] = array[i - 1];
            }
            array[posicion] = posicion;
            elementosOcupados++;
            System.out.printf("El numero %d se ha insertado correctamente%n", numAInsertar);
            System.out.println(Arrays.toString(array));
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("El numero %d no se ha insertado. Posicion en la que deseas insertar no existe", numAInsertar);
            return;
        }

    }

    public void remove(int numeroAQuitar) {
        if (isEmpty()) {
            System.out.println("El array esta vacio");
            return;
        }
        for (int i = 0; i < elementosOcupados; i++) {
            if (array[i] == numeroAQuitar) {
                array[i] = 0;
                System.out.println("Se ha eliminado correctamente");
                return;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void aumentarLength() {
        int[] arrayAux = new int[array.length + LENGTH_INCREMENTO];
        for (int i = 0; i < elementosOcupados; i++) {
            arrayAux[i] = array[i];
        }
        array = arrayAux;
        System.out.println("El array ha aumentado su tamaño: ");
        System.out.println(Arrays.toString(array));
    }

    public int max() {
        if (isEmpty()) {
            System.out.println("El array esta vacio");
            return 0;
        }
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < elementosOcupados; i++) {
            if (maximo < array[i]) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    private int leerNumeroDeTeclado(String msg) {
        int numero = 0;
        boolean esNumero = false;

        do {
            try {
                System.out.println(msg);
                numero = entradaTeclado.nextInt();

                esNumero = true;

            } catch (InputMismatchException ex) {
                System.out.println("Dato no valido");

                esNumero = false;
            }

            entradaTeclado.nextLine();

        } while (!esNumero);

        return numero;
    }

    private void setArray() {
        int numElementos = leerNumeroDeTeclado("Introduce el tamaño del array: ");
        array = new int[numElementos];
        System.out.println("Array creado correctamente");
        System.out.println(Arrays.toString(array));
    }

}
