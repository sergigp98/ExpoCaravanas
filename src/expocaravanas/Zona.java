/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;

/**
 *
 * @author Sergio
 */
public class Zona {

    private int numeroentradas;

    public Zona() {
    }

    public Zona(int numeroentradas) {
        this.numeroentradas = numeroentradas;
    }

    public void ventaEntradas(int ventaentradas) {
        numeroentradas = numeroentradas - ventaentradas;

    }

    public int getNumeroentradas() {
        return numeroentradas;
    }

    public void setNumeroentradas(int numeroentradas) {
        this.numeroentradas = numeroentradas;
    }

}
