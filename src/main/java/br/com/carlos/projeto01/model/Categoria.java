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
public class Categoria implements Serializable {
    
    private String importacao;
    private String exportacao;

    /**
     * @return the importacao
     */
    public String getImportacao() {
        return importacao;
    }

    /**
     * @param importacao the importacao to set
     */
    public void setImportacao(String importacao) {
        this.importacao = importacao;
    }

    /**
     * @return the exportacao
     */
    public String getExportacao() {
        return exportacao;
    }

    /**
     * @param exportacao the exportacao to set
     */
    public void setExportacao(String exportacao) {
        this.exportacao = exportacao;
    }
    
}
