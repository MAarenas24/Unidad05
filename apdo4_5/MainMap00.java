package unidad05.apdo4_5;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Miguel Angel Arenas
 */
public class MainMap00 {
    public static void main(String[] args) {
        
        HashMap<String, String> codigoMorse = new HashMap<>();
        codigoMorse.put("a", ".-");
        codigoMorse.put("b", "-...");
        codigoMorse.put("c", "-.-.");
        codigoMorse.put("d", "-..");
        codigoMorse.put("e", ".");
        codigoMorse.put("f", "..-.");
        codigoMorse.put("g", "--.");
        codigoMorse.put("h", "....");
        codigoMorse.put("i", "..");
        codigoMorse.put("j", ".---");
        codigoMorse.put("k", "-.-");
        codigoMorse.put("l", ".-..");
        codigoMorse.put("m", "--");
        codigoMorse.put("n", "-.");
        codigoMorse.put("o", "---");
        codigoMorse.put("p", ".--.");
        codigoMorse.put("q", "--.-");
        codigoMorse.put("r", ".-.");
        codigoMorse.put("s", "...");
        codigoMorse.put("t", "-");
        codigoMorse.put("u", "..--");
        codigoMorse.put("v", "...-");
        codigoMorse.put("w", "..-");
        codigoMorse.put("x", "-..-");
        codigoMorse.put("y", "-.--");
        codigoMorse.put("z", "--..");
        codigoMorse.put(" ", " ");
        codigoMorse.put(" ", "1");
        
        codigoMorse.put("a", ".-------");
        codigoMorse.put("a", ".-");
        
        System.out.println("a = " + codigoMorse.get("a"));
        
        //Recorriendo solo por claves
        for ( String key : codigoMorse.keySet()) {
            System.out.println(key + " - " + codigoMorse.get(key));
        }
        
        System.out.println("--------------------");
        
        System.out.println("Si no encuentra la key que indicamos...");
        System.out.println("z = " + codigoMorse.getOrDefault("sr", "_"));
        
        System.out.println("--------------------");
        
        //Recorriendo por entradas clave-valor
        for (Map.Entry<String, String> claveValor : codigoMorse.entrySet()) {
            System.out.println(claveValor.getKey() + " - " + claveValor.getValue());
        }
        
//        for (Map.Entry<String, String> letra : codigoMorse.entrySet()) {
//            
//        }
    }
}
