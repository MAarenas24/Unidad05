package unidad05.ejercicios;

import java.util.Scanner;
import static unidad02.Calculadora.entradaTeclado;

/**
 * Sumas. Escribe un programa que pida al usuario 10 números reales positivos o
 * negativos, y realice, por un lado, la suma de todos los positivos y, por
 * otro, la suma de todos los negativos, mostrando al final el resultado
 *
 * @author Miguel Angel Arenas
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        int[] numeros = new int[10];
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero: ");
            int num = Integer.parseInt(entradaTeclado.nextLine());
            numeros[i] = num;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else {
                sumaNegativos += numeros[i];
            }
        }

        System.out.println("Suma Positivos = " + sumaPositivos);
        System.out.println("Suma Negativos = " + sumaNegativos);
        
    }
}
