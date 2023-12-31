/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeDatos;

import java.util.Arrays;


public class NodoABB<E> {
    int value;
    NodoABB<E> left;
    NodoABB<E> right;
    Lista<String> historial;
    
    public NodoABB(int valor) {
        this.value = valor;
        left = right = null;
        this.historial = historial;
    }
    
    public void setHistorial(Lista<String> historial) {
        this.historial = historial;
    }
    public void actualizarHistorial(String ci, String nombre, String apellido, String email, String genero, String llegada){
        if (historial == null) {
            historial = new Lista<String>();
        }
        String data = ci + ", " + nombre + ", " + apellido + ", " + email + ", " + genero + ", " + llegada + "\n";
        historial.insertarFinal(data);
    }
    
    public Lista<String> getHistorial() {return historial;}
    
    public void actualizarHistorial(Lista<String> historial){
        this.historial = historial;
    }
   
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public NodoABB<E> getLeft() {
        return left;
    }

    public void setLeft(NodoABB<E> left) {
        this.left = left;
    }

    public NodoABB<E> getRight() {
        return right;
    }

    public void setRight(NodoABB<E> right) {
        this.right = right;
    }

    
  
}