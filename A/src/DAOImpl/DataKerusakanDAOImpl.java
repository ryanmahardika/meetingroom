/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import java.util.List;
import DAO.DataKerusakanDAO;
import model.DataKerusakan;

/**
 *
 * @author ASUS
 */
public class DataKerusakanDAOImpl extends GeneralDAOImpl implements DataKerusakanDAO {

    public DataKerusakanDAOImpl(){
        super();
    }

    @Override
    public DataKerusakan getById(long id) {
        return em.find(DataKerusakan.class, id);
    }

    @Override
    public List<DataKerusakan> getAll() {
        return em.createQuery("from DataKerusakan dk").getResultList();
    } 
    
}

