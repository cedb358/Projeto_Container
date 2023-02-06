/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.projeto01.jsf;

import br.com.carlos.projeto01.dao.CategoriaDao;
import br.com.carlos.projeto01.dao.TipoDao;
import br.com.carlos.projeto01.model.Categoria;
import br.com.carlos.projeto01.model.Tipo;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author carlo
 */
public class CategoriaController implements Serializable {
    
    private Categoria selected;
    private CategoriaDao categoriaDao;
    private List<Categoria> items;
    private boolean categoria;
    
     public CategoriaController (){
        categoriaDao  = new CategoriaDao();
        loadItems();
    }

    private void loadItems() {
       items = categoriaDao.findAll();
    }
    
    public Categoria getSelected(Categoria selected){
        return selected;
        
    }
    
    public void setSelected(Categoria selected){
        this.selected = selected;
    }
     public List<Categoria> getItems(){
        return items;
    }
     
     public void setItems(List<Categoria> items) {
        this.items = items;
    }
     public String editar(String Categoria){
        System.out.println(Categoria);
        return "categoria_manut?redirect=true";
    }
     
     public String gravar(){
        System.out.println(categoria);
        //gravar no banco de dados
        categoriaDao.beginTransaction();
        categoriaDao.saveOrUpdate(selected);
        categoriaDao.commitTransaction();
        loadItems();
        return "categoria_list?redirect=true";
    }
     
      public String excluir(Integer idCliente){
        //ir no dao e procurar pelo id e colocar o resultado no selected
        // redirecionar para a pagina de edicao 
        
        System.out.print(idCliente);
        Categoria deleted = categoriaDao.findById(idCliente);
        categoriaDao.beginTransaction();
        categoriaDao.delete(deleted);
        categoriaDao.commitTransaction();
        loadItems();
        return "categoria_list?redirect=true";
    }
      public String adicionar(){
        selected = new Categoria();        
        return "categoria_manut?redirect=true";
    }
}
