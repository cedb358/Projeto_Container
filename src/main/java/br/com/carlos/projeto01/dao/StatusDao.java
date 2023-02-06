/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.projeto01.dao;

import br.com.carlos.projeto01.model.Membro;
import br.com.carlos.projeto01.model.Status;
import br.com.carlos.projeto01.model.Tipo;
import java.util.List;


/**
 *
 * @author carlo
 */
public class StatusDao extends GenericDao<Status> {
    
    public StatusDao(Class<Status> entity) {
        super(entity);
    }

    public StatusDao() {
      super(Status.class);
    }
    
    public Status findById(Integer id){
        String sql = "select c from Status c where c.id =:id";
        List<Status> lista = session.createQuery(sql).setParameter("id", id).list();
        if(lista != null && lista.size()>0){
            return lista.get(0);
        }
        return null;
    }
    
}
