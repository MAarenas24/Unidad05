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
    private int arrayLength = 0;

    /**
     * Crea un array de la longitud indicada y si es menor que 0 salta un
     * mensaje de error
     *
     * @param length longitud del array
     * @param numeroRelleno numero que se va rellenar el array
     */
    public MiArray(int length, int numeroRelleno) {
        try {
            array = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[i] = numeroRelleno;
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("ERROR! No se ha podido crear el array, has metido que la longitud sea menor de 0");
        }
    }

    public MiArray(int length) {
        array = new int[length];
    }

    public MiArray() {
        setArray();
    }

    public int length() {
        return arrayLength;
    }

    public boolean estaLleno() {
        return arrayLength == array.length;
    }

    public boolean isEmpty() {
        return arrayLength == 0;
    }

    public void add() {
        int nuevoNumero = leerNumeroDeTeclado("Introduzca el numero a añadir");
        add(nuevoNumero);
    }

    private void add(int numeroAlFinal) {
        if (estaLleno()) {
            aumentarLength();
        }
        array[arrayLength++] = numeroAlFinal;
        System.out.printf("El numero %d se ha insertado correctamente%n", numeroAlFinal);
        mostrarArary();
    }

    public void insertar() {
        int nuevoNumero = leerNumeroDeTeclado("Introduzca el numero a insertar");
        insertar(nuevoNumero);
    }

    private void insertar(int numeroAlPrincipio) {
        if (estaLleno()) {
            aumentarLength();
        }
        //Desplazamos los datos a la derecha
        for (int i = arrayLength; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = numeroAlPrincipio;
        arrayLength++;
        System.out.printf("El numero %d se ha insertado correctamente%n", numeroAlPrincipio);
        mostrarArary();
    }

    public void insertarEn(int numAInsertar, int posicion) {
        if (estaLleno()) {
            aumentarLength();
        }
        try {
            for (int i = arrayLength; i > posicion; i--) {
                array[i] = array[i - 1];
            }
            array[posicion] = posicion;
            arrayLength++;
            System.out.printf("El numero %d se ha insertado correctamente%n", numAInsertar);
            mostrarArary();
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
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == numeroAQuitar) {
                array[i] = 0;
                System.out.println("Se ha eliminado correctamente");

            }
        }
        mostrarArary();
    }

    public void borrar(int posicion) {
        if (isEmpty()) {
            System.out.println("El array esta vacio");
            return;
        }
        try {
            for (int i = 0; i < arrayLength; i++) {
                if (posicion == array[i]) {
                    array[i] = 0;
                }
            }
            for (int i = arrayLength; i > 0; i--) {
                array[i - 1] = array[i];
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("has puesto posiciones fuera del array");
        }

    }

    public void borrar(int desde, int hasta) {
        if (isEmpty()) {
            System.out.println("El array esta vacio");
            return;
        }
        try {
            for (int i = desde; i < hasta; i++) {
                array[i] = 0;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("has puesto posiciones fuera del array");
        }
    }
    
    public void borrarDesde(int posicion) {
        if (isEmpty()) {
            System.out.println("El array esta vacio");
            return;
        }
        try {
            for (int i = posicion; i < arrayLength; i++) {
                array[i] = 0;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("has puesto posiciones fuera del array");
        }
    }

    public void aumentarLength() {
        int[] arrayAux = new int[array.length + LENGTH_INCREMENTO];
        for (int i = 0; i < arrayLength; i++) {
            arrayAux[i] = array[i];
        }
        array = arrayAux;
        System.out.println("El array ha aumentado su tamaño: ");
    }

    public int max() {
        if (isEmpty()) {
            System.out.println("El array esta vacio");
            return 0;
        }
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            if (maximo < array[i]) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    public int min() {
        if (isEmpty()) {
            System.out.println("El array esta vacio");
            return 0;
        }
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            if (minimo > array[i]) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    public double media() {
        if (isEmpty()) {
            System.out.println("El array esta vacio");
            return 0;
        }
        double media = 0;
        int suma = 0;
        int contadorDeNumeros = 0;
        for (contadorDeNumeros = 0; contadorDeNumeros < arrayLength; contadorDeNumeros++) {
            suma += array[contadorDeNumeros];
        }
        media = (double) suma / contadorDeNumeros;
        return media;
    }

    public int getRandom() {
        int numeroAleatorio = (int) (Math.random() * arrayLength);
        return array[numeroAleatorio];
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
    }

    public void mostrarArary() {
        if (isEmpty()) {
            System.out.println("[]");
        }
        System.out.print("[");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        System.out.println("");
    }
}
