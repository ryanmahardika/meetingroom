/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import java.util.List;
import model.Fasilitas;
import DAO.FasilitasDAO;

/**
 *
 * @author Ryan
 */
public class FasilitasDAOImpl extends GeneralDAOImpl implements FasilitasDAO {
    
    public FasilitasDAOImpl(){
        super();
    }

    @Override
    public Fasilitas getById(long id) {
        return em.find(Fasilitas.class, id);
    }

    @Override
    public List<Fasilitas> getAll() {
        return em.createQuery("from Fasilitas f").getResultList();
    }

}
