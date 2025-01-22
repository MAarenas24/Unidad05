package unidad05.ejercicios.ejercicioClase01;

/**
 *
 * @author tarde
 */
public class Main {
    
    public static void main(String[] args) {
        
        MiArray a = new MiArray(4);
        
        while (!a.estaLleno()) {
//            a.insertar();
            a.add(); 
        }
        
        System.out.println("El valor maximo es: " + a.max());
        a.aumentarLength();
        
    }
    
}
