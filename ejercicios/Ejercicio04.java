package unidad05.ejercicios;

import java.util.Scanner;

/**
 * Estadística. 
 * Escribe un programa que pida al usuario 10 números enteros y 
 * calcule el valor medio de todos ellos, mostrando luego en la pantalla los 
 * números que están por encima de la media y los que están por debajo de ella. 
 * Utiliza arrayes y trata de pensar en cómo lo resolverías sin ellos. ¿Y si 
 * fueran 100 números, o 1000, en lugar de 10?
 * 
 * @author Miguel Angel Arenas
 */
public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int contadorNumeros = 0;
        int suma = 0;
        int media = 0;
        
        for (int i = 0 ; i < numeros.length; i++) {
            System.out.println("Introduce numero: ");
            int num = Integer.parseInt(entradaTeclado.nextLine());
            numeros[i] = num;
            contadorNumeros++;
            suma += num;
            
            media = suma / num;
        }
        
        System.out.println("Media = " + media);
        
        System.out.println("Mas altos de la media: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
        
        System.out.println("Mas bajos de la media");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }
    }
    
}
