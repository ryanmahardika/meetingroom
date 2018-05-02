/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import java.util.List;
import DAO.DataFasilitasDAO;
import model.DataFasilitas;

/**
 *
 * @author Ryan
 */
public class DataFasilitasDAOImpl extends GeneralDAOImpl implements DataFasilitasDAO {

    public DataFasilitasDAOImpl(){
        super();
    }

    @Override
    public DataFasilitas getById(long id) {
       return em.find(DataFasilitas.class, id);
    }

    @Override
    public List<DataFasilitas> getAll() {
        return em.createQuery("from DataFasilitas d").getResultList();
    }    
    
}
