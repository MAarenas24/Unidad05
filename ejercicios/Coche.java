package unidad05.ejercicios;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Coche {
    /**
     * Identificador de rueda delantera izquieroda
     */
    public static final int RUEDA_DELANTERA_IZDA = 1;
    public static final int RUEDA_DELANTERA_DCHA = 2;
    public static final int RUEDA_TRASERA_IZDA = 3;
    public static final int RUEDA_TRASERA_DCHA = 4;
    
    private final int CABALLOS;
    private final String COLOR;
    private final int KM_REVISION;
    private final double LITROS_MAX;
    private final String MARCA;
    private final String MODELO;

    private int kmRecorridos;
    private double litrosRepostados;
    private Neumatico ruedaDelanteraDcha;
    private Neumatico ruedaDelanteraIzda;
    private Neumatico ruedaTraseraDcha;
    private Neumatico ruedaTraseraIzda;
    private Neumatico ruedaRepuesto;

    public Coche(String marca, String modelo, String color, double litrosRepostados, double litrosMax, int caballos, int kmRevision) {
        this.MARCA = marca;
        this.MODELO = modelo;
        this.COLOR = color;
        this.litrosRepostados = litrosRepostados;
        this.LITROS_MAX = litrosMax;
        this.CABALLOS = caballos;
        this.KM_REVISION = kmRevision;

        kmRecorridos = 0;
        ruedaDelanteraDcha = new Neumatico(120, 90, 80000);
        ruedaDelanteraIzda = new Neumatico(120, 90, 80000);
        ruedaTraseraDcha = new Neumatico(120, 90, 80000);
        ruedaTraseraIzda = new Neumatico(120, 90, 80000);
        ruedaRepuesto = new Neumatico(90, 60, 100);
    }

    public int getCaballos() {
        return CABALLOS;
    }

    public String getColor() {
        return COLOR;
    }

    public double getLitrosMax() {
        return LITROS_MAX;
    }

    public void repostar(double litros) {
        if (litros > 0) {
            litrosRepostados += litros;

            if (litrosRepostados > LITROS_MAX) {
                litrosRepostados = LITROS_MAX;
            }
        }
    }

    /**
     * incrementará los km recorridos con el valor que se le pasa como
     * parámetro.
     *
     * @param km kilometros recorridos
     */
    public void recorrer(int km) {
        if (km > 0 && litrosRepostados > 0) {
            final int KM_POR_LITRO = 12;
            kmRecorridos += km;

            litrosRepostados -= km / (double) KM_POR_LITRO;

            ruedaDelanteraDcha.recorrer(km);
            ruedaDelanteraIzda.recorrer(km);
            ruedaTraseraDcha.recorrer(km);
            ruedaTraseraIzda.recorrer(km);

        }

    }

    /**
     *comprueba si el coche necesita ir a revision
     * @return true si los km recorridos rebasan el maximo para la revision
     */
    public boolean necesitaRevision() {
        return kmRecorridos > KM_REVISION;
    }

    public Neumatico getRueda(int rueda) {
        switch (rueda) {
            case RUEDA_DELANTERA_IZDA:
                return ruedaDelanteraIzda;
            case RUEDA_DELANTERA_DCHA:
                return ruedaDelanteraDcha;
            case RUEDA_TRASERA_IZDA:
                return ruedaTraseraIzda;
            case RUEDA_TRASERA_DCHA:
                return ruedaTraseraIzda;
            default:
                return null;
        }
    }

    public String toString() {
        String quitar = "";
        return quitar;
    }

    /**
     * 
     * @deprecated Usar metodo pincharRueda(Neumaticos rueda)
     * @param rueda Identificador de la rueda
     * @see Neumaticos
     */
    @Deprecated
    public void pincharRueda(int rueda) {

        switch (rueda) {
            case RUEDA_DELANTERA_IZDA:
                ruedaDelanteraIzda.pinchar();
                cambiarRueda(ruedaDelanteraIzda);
                break;
            case RUEDA_DELANTERA_DCHA:
                ruedaDelanteraDcha.pinchar();
                cambiarRueda(ruedaDelanteraDcha);
                break;
            case RUEDA_TRASERA_IZDA:
                ruedaTraseraIzda.pinchar();
                cambiarRueda(ruedaTraseraIzda);
                break;
            case RUEDA_TRASERA_DCHA:
                ruedaTraseraDcha.pinchar();
                cambiarRueda(ruedaTraseraDcha);
                break;
            default:
                System.out.println("Rueda no valida");
        }

    }
    
    /**
     * 
     * @param rueda Identificador de la rueda
     */
    public void pincharRueda(Neumaticos rueda) {
        switch (rueda) {
            case DELANTERA_IZDA:
                ruedaDelanteraIzda.pinchar();
                cambiarRueda(ruedaDelanteraIzda);
                break;
            case DELATERA_DCHA:
                ruedaDelanteraDcha.pinchar();
                cambiarRueda(ruedaDelanteraDcha);
                break;
            case TRASERO_IZDA:
                ruedaTraseraIzda.pinchar();
                cambiarRueda(ruedaTraseraIzda);
                break;
            case TRASERO_DCHA:
                ruedaTraseraDcha.pinchar();
                cambiarRueda(ruedaTraseraDcha);
                break;
            default:
                System.out.println("Rueda no valida");
        }
    }

    private void cambiarRueda(Neumatico r) {
        if (ruedaRepuesto != null) {
            r = ruedaRepuesto;
            ruedaRepuesto = null;
        }
    }

}
