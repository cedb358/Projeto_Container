/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.projeto01.model;

import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class Tipo implements Serializable {
    
    private String aberto;
    private String fechado;

    /**
     * @return the aberto
     */
    public String getAberto() {
        return aberto;
    }

    /**
     * @param aberto the aberto to set
     */
    public void setAberto(String aberto) {
        this.aberto = aberto;
    }

    /**
     * @return the fechado
     */
    public String getFechado() {
        return fechado;
    }

    /**
     * @param fechado the fechado to set
     */
    public void setFechado(String fechado) {
        this.fechado = fechado;
    }
}
