/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.GeneralDAO;
import db.DbConnection;
import javax.persistence.EntityManager;

/**
 *
 * @author Angga
 */
public class GeneralDAOImpl implements GeneralDAO{
    protected EntityManager em;
    public GeneralDAOImpl(){
        em = DbConnection.getConnection();
}
    @Override
    public void insert(Object o) {
        try{
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
        }catch(Exception ex){
            em.getTransaction().rollback();
        }
    }

    @Override
    public void update(Object o) {
        try{
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
        }catch(Exception ex){
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Object o) {
        try{
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
        }catch(Exception ex){
            em.getTransaction().rollback();
        }
    }

    @Override
    public boolean insertData(Object o) {
        boolean tes;
        try{
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
        tes = true;
        } catch(Exception ex){
            em.getTransaction().rollback();
        tes = false;
        } return tes;
    }
}
   
