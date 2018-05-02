/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import java.util.List;
import DAO.DataKerusakanDAO;
import model.DataKerusakan;
import model.Ruangan;

/**
 *
 * @author Ryan
 */
public class DataKerusakanDAOImpl extends GeneralDAOImpl implements DataKerusakanDAO {

    public DataKerusakanDAOImpl(){
        super();
    }
    
//    @Override
//    public void insertDataRusak(DataKerusakan d){
//        Ruangan r = d.getRuangan();
//        r.setFasilitasRusak(d.getFasilitasRusak());
//        try{
//            em.getTransaction().begin();
//            em.persist(d);
//            em.merge(r);
//            em.getTransaction().commit();
//        }catch(Exception ex){
//            em.getTransaction().rollback();
//        }
//    }
//    
    @Override
    public DataKerusakan getById(long id) {
        return em.find(DataKerusakan.class, id);
    }

    @Override
    public List<DataKerusakan> getAll() {
        return em.createQuery("from DataKerusakan dk").getResultList();
    } 

}

