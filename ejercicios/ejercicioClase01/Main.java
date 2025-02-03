package unidad05.ejercicios.ejercicioClase01;

import java.util.Arrays;

/**
 *
 * @author tarde
 */
public class Main {
    static final int LIMITE_POSICIONES_VACIAS = 10;
    static final int POS_VACIAS_DEFAULT = 5;
    int[] array;
    int arrayLength;
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
    
//    public String toString() {
//        StringBuilder msg = new StringBuilder("[");
//        for (int i = 0; i < arrayLength; i++) {
//            msg.append(arrays[i]);
//            if (i < arrayLength - 1) msg.append(", ");
//        }
//        msg.append("]");
//        return msg.toString();
//    }
    
//    public static void acortarArray() {
//        if (isEmpty) {
//            return;
//        }
//        int numPosLibres = array.length - arrayLength;
//        if (numPosLibres >= LIMITE_POSICIONES_VACIAS) {
//            int[] arrayAux = new int[arrayLength + POS_VACIAS_DEFAULT]; 
//            for (int i = 0; i < arrayLength; i++) {
//                arrayAux[i] = array[i];
//            }
//            array = arrayAux;
//        }
//    }
    
//    public static boolean isEmpty() {
//        return (array != null) && (arrayLength == 0);
//    }
    
}
