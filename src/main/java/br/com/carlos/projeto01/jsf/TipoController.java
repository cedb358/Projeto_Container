/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.projeto01.jsf;

import br.com.carlos.projeto01.dao.TipoDao;

import br.com.carlos.projeto01.model.Tipo;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author carlo
 */
public class TipoController implements Serializable {
    
    private Tipo selected;
    private TipoDao tipoDao;
    private List<Tipo> items;
    private boolean tipo;
    
    public TipoController (){
        tipoDao  = new TipoDao();
        loadItems();
    }

    private void loadItems() {
         items = tipoDao.findAll();
    }
    
    public Tipo getSelected(Tipo selected){
        return selected;
        
    }
    public void setSelected(Tipo selected){
        this.selected = selected;
    }
    
    public List<Tipo> getItems(){
        return items;
    }
    public void setItems(List<Tipo> items) {
        this.items = items;
    }
    
    public String editar(String Tipo){
        System.out.println(Tipo);
        return "tipo_manut?redirect=true";
    }
    
      public String gravar(){
        System.out.println(tipo);
        //gravar no banco de dados
        tipoDao.beginTransaction();
        tipoDao.saveOrUpdate(selected);
        tipoDao.commitTransaction();
        loadItems();
        return "tipo_list?redirect=true";
    }
       public String excluir(Integer idCliente){
        
        
        System.out.print(idCliente);
        Tipo deleted = tipoDao.findById(idCliente);
        tipoDao.beginTransaction();
        tipoDao.delete(deleted);
        tipoDao.commitTransaction();
        loadItems();
        return "tipo_list?redirect=true";
    }
       public String adicionar(){
        selected = new Tipo();        
        return "tipo_manut?redirect=true";
    }
}
