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
public class Status implements Serializable {
        
        private String cheio;
        private String vazio;

    /**
     * @return the cheio
     */
    public String getCheio() {
        return cheio;
    }

    /**
     * @param cheio the cheio to set
     */
    public void setCheio(String cheio) {
        this.cheio = cheio;
    }

    /**
     * @return the vazio
     */
    public String getVazio() {
        return vazio;
    }

    /**
     * @param vazio the vazio to set
     */
    public void setVazio(String vazio) {
        this.vazio = vazio;
    }

    
    
}
