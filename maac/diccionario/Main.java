import com.mycompany.maac.diccionario.Diccionario;
import com.mycompany.maac.diccionario.Palabra;
import com.mycompany.maac.diccionario.Tipos;

public class Main {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        Palabra gato = new Palabra("gato", "Del lat. tardío cattus.");

        diccionario.addPalabra(
                gato,
                Tipos.NOMBRE_MASCULINO_Y_FEMENINO,
                "Mamífero de la familia de los félidos, digitígrado, doméstico, de unos 50 cm de largo desde la cabeza hasta el arranque de la cola, que por sí sola mide unos 20 cm, de cabeza redonda, lengua muy áspera, patas cortas y generalmente pelaje suave y espeso, de color blanco, gris, pardo, rojizo o negro, empleado en algunos lugares para cazar ratones."
        );
        diccionario.addSinonimo(gato, 1, "minino");
        diccionario.addSinonimo(gato, 1, "michino");
        diccionario.addSinonimo(gato, 1, "micho");
        diccionario.addSinonimo(gato, 1, "morrongo");
        diccionario.addSinonimo(gato, 1, "morroño");

        diccionario.addAntonimo(gato, 1, "perro");

        diccionario.addPalabra(gato,
                3,
                Tipos.NOMBRE_MASCULINO_Y_FEMENINO,
                "Persona nacida en Madrid.");

        diccionario.addPalabra(gato,
                5,
                Tipos.NOMBRE_MASCULINO,
                "Máquina que sirve para levantar grandes pesos a poca altura, y que funciona con un engranaje y un trinquete de seguridad, o con una tuerca y un husillo.");

        diccionario.addPalabra(gato,
                57,
                Tipos.COLOQUIAL,
                "Hombre sagaz, astuto.");
        diccionario.addSinonimo(gato, 4, "zorro");
        diccionario.addSinonimo(gato, 4, "pícaro");
        diccionario.addSinonimo(gato, 4, "traicionero");


        Palabra perro = new Palabra("perro", "De or. inc.");
        diccionario.addPalabra(
                perro,
                Tipos.NOMBRE_MASCULINO_Y_FEMENINO,
                "Mamífero doméstico de la familia de los cánidos, de tamaño, forma y pelaje muy diversos, según las razas, que tiene olfato muy fino y es inteligente y muy leal a su dueño."
        );
        diccionario.addSinonimo(perro, 1, "can");
        diccionario.addSinonimo(perro, 1, "chucho");
        diccionario.addSinonimo(perro, 1, "tuso");
        diccionario.addSinonimo(perro, 1, "pulguiento");

        System.out.println(diccionario);
    }
}