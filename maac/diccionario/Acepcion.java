package com.mycompany.maac.diccionario;

import java.util.LinkedList;

/**
 *
 * @author Miguel Angel Arenas
 */
public class Acepcion implements Comparable<Acepcion> {
    private String palabra;
    private int numero;
    private Tipos tipoYGenero;
    private String significado;
    private LinkedList<String> sinonimos = new LinkedList<>();
    private LinkedList<String> antonimos = new LinkedList<>();
    
    public Acepcion(String palabra, int numero, Tipos tipoYGenero, String significado) {
        this.palabra = palabra;
        this.numero = numero;
        this.tipoYGenero = tipoYGenero;
        this.significado = significado;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setTipo(Tipos tipoYGenero) {
        this.tipoYGenero = tipoYGenero;
    }
    
    public void setSignificado(String significado) {
        this.significado = significado;
    }
    
    public void addSinonimo(String sinonimo) {
        sinonimos.add(sinonimo);
//        sinonimos.sort(sinonimos);
    }
    
    public void addAntonimo(String antonimo) {
        antonimos.add(antonimo);
//        antonimos.sort(antonimos);
    }
    
    public void removeSinonimo(String sinonimo) {
        for (int i = 0; i < sinonimos.size(); i++) {
            if (sinonimo.equals(sinonimos.get(i))) {
                sinonimos.remove(sinonimo);
            }
        }
    }
    
    public void removeAntonimo(String antonimo) {
        for (int i = 0; i < antonimos.size(); i++) {
            if (antonimo.equals(antonimos.get(i))) {
                antonimos.remove(antonimo);
            }
        }
    }

    public String getPalabra() {
        return palabra;
    }

    public int getNumero() {
        return numero;
    }

    public Tipos getTipoYGenero() {
        return tipoYGenero;
    }

    public String getSignificado() {
        return significado;
    }

    public LinkedList<String> getSinonimos() {
        return sinonimos;
    }

    public LinkedList<String> getAntonimos() {
        return antonimos;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() == o.getClass()) return true;
        
        Acepcion a = (Acepcion) o;
        return this.palabra.equals(a.palabra)
                && (this.significado.equals(a.significado));
    }
    
    @Override
    public int hashCode() {
        int resultado = 17;
        int primo = 7;
        
        if (palabra != null) {
            resultado = primo * resultado + palabra.hashCode();
        }
        if (significado != null) {
            resultado = primo * resultado + significado.hashCode();
        }
        return resultado;
    }

    @Override
    public String toString() {  
        return palabra + ": \n" + numero + ".- " + tipoYGenero + " " + significado + "\n sin.: [" + sinonimos + "]" + "\n ant.: [" + antonimos + "]";
    }
    
    @Override
    public int compareTo(Acepcion t) {
        return numero;
    }
    
}
