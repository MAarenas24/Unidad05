package com.mycompany.maac.diccionario;

import java.util.LinkedList;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Palabra implements Comparable<Palabra> {

    private String palabra;
    private String etimologia;
    private LinkedList<Acepcion> acepciones = new LinkedList<>();

    public Palabra(String palabra, String etimologia) {
        this.palabra = palabra;
        this.etimologia = etimologia;
    }

    public Palabra(String palabra) {
        this(palabra, null);
    }

    public String getPalabra() {
        return palabra;
    }

    public String getEtimologia() {
        return etimologia;
    }

    public LinkedList<Acepcion> getAcepciones() {
        return acepciones;
    }

    public void setEtimologia(String etimologia) {
        this.etimologia = etimologia;
    }

    public void borrarAcepciones() {
        for (int i = 0; i < acepciones.size(); i++) {
            if (acepciones.get(i).equals(palabra)) {
                acepciones.remove(i);
            }
        }
    }

    private void borrarAcepcionNumero(int posicion) {
        for (int i = 0; i < acepciones.size(); i++) {
            if (i == posicion) {
                acepciones.remove(i);
            }
        }
    }

    protected void addAcepcion(int posicion, Tipos tipoYGenero, String significado) {
        Acepcion nuevaAcepcion = new Acepcion(palabra, posicion, tipoYGenero, significado);
        for (int i = 0; i < acepciones.size(); i++) {
            if (nuevaAcepcion.equals(acepciones.get(i))) {
                return;
            }
            if (posicion < 0) {
                acepciones.addFirst(nuevaAcepcion);
                return;
            }
            if (posicion > acepciones.size()) {
                acepciones.add(nuevaAcepcion);
                return;
            }
            if (i == posicion) {
                acepciones.add(i, nuevaAcepcion);
            }
        }
    }

    protected void addAcepcion(Tipos tipoYGenero, String significado) {
        Acepcion nuevaAcepcion = new Acepcion(palabra, acepciones.size(), tipoYGenero, significado);
        for (int i = 0; i < acepciones.size(); i++) {
            if (nuevaAcepcion.equals(acepciones.get(i))) {
                return;
            }
        }
        acepciones.add(nuevaAcepcion);
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() == o.getClass()) return true;
        
        Palabra pa = (Palabra) o;
        
        return this.palabra.equals(pa.palabra);
    }
    
    @Override
    public int hashCode() {
        int resultado = 17;
        int primo = 7;
        if (palabra != null) {
            resultado = primo * resultado + palabra.hashCode();
        }
        return resultado;
    }
    
    public String toString() {
        return palabra + ":\n"
                + acepciones.toString();
    }
    
    @Override
    public int compareTo(Palabra t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
