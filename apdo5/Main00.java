package unidad05.apdo5;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Main00 {
    public static void main(String[] args) {
        String texto = "hola"; // {'h', 'o', 'l', 'a'}

        System.out.println("String----------");
        
        System.out.println(texto);
        System.out.println("----------");
        
        texto += ", Pepe";
        
        System.out.println(texto);
        System.out.println("StringBuffer----------");
        
        StringBuffer texto2 = new StringBuffer("hola");
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        
        System.out.println("----------");
        
        texto2.append(", Pepe");
        
        System.out.println(texto2);
        System.out.println("----------");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        
        System.out.println("---------");
        
        texto2.append("1 2 3 4 5 ");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        
        System.out.println("----------");
        
        texto2.append("6 ");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        
        System.out.println("----------");
        
        texto2.delete(0, 5);
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        
        System.out.println("----------");
        
        texto2.insert(0, "hola,");
        
        System.out.println(texto2);
        System.out.println("texto2.capacity() = " + texto2.capacity());
        System.out.println("texto2.length() = " + texto2.length());
        
    }
}
