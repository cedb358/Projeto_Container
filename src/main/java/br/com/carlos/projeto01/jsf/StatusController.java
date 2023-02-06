/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.projeto01.jsf;
import br.com.carlos.projeto01.dao.StatusDao;
import br.com.carlos.projeto01.model.Status;


import java.io.Serializable;
import java.util.List;

/**
 *
 * @author carlo
 */
public class StatusController implements Serializable {
    
    private Status selected;
    private StatusDao statusDao;
    private List<Status> items;
    private boolean status;
    
    
    
     public StatusController (){
        statusDao  = new StatusDao();
        loadItems();
    }

    private void loadItems() {
       items = statusDao.findAll();
    }
    
     public Status getSelected(Status selected){
        return selected;
        
    }
     
     public void setSelected(Status selected){
        this.selected = selected;
    }
     public List<Status> getItems(){
        return items;
    }
     public void setItems(List<Status> items) {
        this.items = items;
    }
     
      public String editar(String Status){
        System.out.println(Status);
        return "status_manut?redirect=true";
    }
      public String gravar(){
        System.out.println(status);
        
        statusDao.beginTransaction();
        statusDao.saveOrUpdate(selected);
        statusDao.commitTransaction();
        loadItems();
        return "status_list?redirect=true";
    }
      public String excluir(Integer idCliente){
        
        
        System.out.print(idCliente);
        Status deleted = statusDao.findById(idCliente);
        statusDao.beginTransaction();
        statusDao.delete(deleted);
        statusDao.commitTransaction();
        loadItems();
        return "status_list?redirect=true";
    }
       public String adicionar(){
        selected = new Status();        
        return "status_manut?redirect=true";
    }
}
