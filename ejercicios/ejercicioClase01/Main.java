package unidad05.ejercicios.ejercicioClase01;

import java.util.Arrays;

/**
 *
 * @author tarde
 */
public class Main {
    
    public static void main(String[] args) {
        
        MiArray a = new MiArray(7);
        
        a.add();
        a.add();
        a.add();
        a.add();
        
        System.out.println("El valor minimo de tu array es: " + a.min());
        System.out.println("La media aritmetica de tu array es: " + a.media());

        a.mostrarArary();
        
        System.out.println("Valor aleatorio del array " + a.getRandom());
        
        a.insertarEn(7, 5);
    }
    
}
