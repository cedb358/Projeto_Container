/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.carlos.projeto01.dao;


import br.com.carlos.projeto01.model.Categoria;

import java.util.List;

/**
 *
 * 
 */
public class CategoriaDao extends GenericDao<Categoria>{
    
    public CategoriaDao() {
        super(Categoria.class);
    }
 
    public Categoria findById(Integer id){
        String sql = "select c from Categoria c where c.id =:id";
        List<Categoria> lista = session.createQuery(sql).setParameter("id", id).list();
        if(lista != null && lista.size()>0){
            return lista.get(0);
        }
        return null;
    }
}
