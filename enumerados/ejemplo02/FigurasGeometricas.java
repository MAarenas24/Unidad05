package unidad05.enumerados.ejemplo02;

/**
 *
 * @author Miguel Angel Arenas Cuevas
 */
public enum FigurasGeometricas {
    CUADRADO(1) {
        @Override
        public double calcularSuperficie(double[] params) {
            if (params.length == getNumeroParametros()) {
                return params[0] * params[0];
            }  else {
                System.out.println("ERROR! numero de parametros incorrectos");
                return 0;
            }
        }
    },
    RECTANGULO(2) {
        @Override
        public double calcularSuperficie(double[] params) {
            if (params.length == getNumeroParametros()) {
                return params[0] * params[1];
            }  else {
                System.out.println("ERROR! numero de parametros incorrectos");
                return 0;
            }
        }
    },
    CIRCULO(1) {
        @Override
        public double calcularSuperficie(double[] params) {
            if (params.length == getNumeroParametros()) {
                return Math.PI * Math.pow(params[0], 2);
            }  else {
                System.out.println("ERROR! numero de parametros incorrectos");
                return 0;
            }
        }
    };

    private int numeroParametros;
    
    private FigurasGeometricas(int numeroParametros) {
        this.numeroParametros = numeroParametros;
    }
    
    public abstract double calcularSuperficie(double[] params);
    // O lo que es lo mismo
    //public abstract double calcularSuperficie(double... params);
    
    public int getNumeroParametros() {
        return numeroParametros;
    }
    
    /**
     * Puede dar errores
     * @param params
     * @return 
     */
    private boolean numeroCorrectoDeParametros(double[] params) {
        return params.length == getNumeroParametros();
    }

    /**
     * Estos metodos no tiene sentido, ya que podria aplicarlo cualquier figura
     * geometrica, ademas no tiene sentido crear un funcion por cada constante
     * @param lado
     * @return 
     * @deprecated 
     */
    @Deprecated
    public double calcularSuperficieCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * Estos metodos no tiene sentido, ya que podria aplicarlo cualquier figura
     * geometrica, ademas no tiene sentido crear un funcion por cada constante
     * @param base
     * @param altura
     * @return 
     * @deprecated 
     */
    @Deprecated
    public double calcularSuperficieRectangulo(double base, double altura) {
        return base * altura;
    }

}
