package unidad05.ejercicios.tresenraya;

import java.util.Scanner;

public class TresEnRaya {
    
    Scanner entradaTeclado = new Scanner(System.in);
    
    private static Fichas[][] tablero = new Fichas[3][3];
    private boolean turno = false;
    private Fichas jugadorTurno;

    public TresEnRaya() {
        inicializarTablero();
        mostrarTablero();
    }

    /**
     * Imprime el tablero por pantalla
     */
    private void mostrarTablero() {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                System.out.println(tablero);
            }
        }
    }

    /**
     * Vacía el tablero, dejando todas las casillas vacías.
     */
    private void inicializarTablero() {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = Fichas.VACIO;
            }
        }
    }

    /**
     * Hace la jugada teniendo en cuenta el turno. Si turno es true, le tocará
     * al jugador que usa la cruz, si es false, al jugador que usa el círculo.
     */
    public void jugarTurno() {
        if (turno) {
            
            System.out.println("Le toca al jugador de la cruz");
            System.out.println("Escriba la fila que quieres");
            int filaX = Integer.parseInt(entradaTeclado.nextLine());
            System.out.println("Escriba la columna que quieres");
            int columnaX = Integer.parseInt(entradaTeclado.nextLine());
            
            try {
                tablero[filaX][columnaX] = Fichas.CRUZ;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR! Diste una posicion fuera de los limites tiene que ser un 3x3");
            }
            
            turno = false;
        } else {
            
            
            turno = true;
        }
    }

}
