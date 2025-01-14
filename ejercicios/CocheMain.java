package unidad05.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class CocheMain {
    
    public static void main(String[] args) {
        
        Coche c1 = new Coche("Opel", "Astra", "blanco anacarado", 40, 60, 120, 80000);
        
        c1.pincharRueda(Coche.RUEDA_TRASERA_DCHA);
        c1.pincharRueda(2);
        
        c1.pincharRueda(Neumaticos.TRASERO_IZDA);
        c1.pincharRueda(Neumaticos.TRASERO_IZDA);
        
        System.out.println("Rueda 1 -----------------");
        System.out.println(c1.getRueda(1));
        System.out.println("Rueda 2 -----------------");
        System.out.println(c1.getRueda(2));
        System.out.println("Rueda 3 -----------------");
        System.out.println(c1.getRueda(3));
        System.out.println("Rueda 2 -----------------");
        System.out.println(c1.getRueda(4));
    }
    
}
