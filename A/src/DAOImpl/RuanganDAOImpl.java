/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import java.util.List;
import model.Ruangan;
import DAO.RuanganDAO;

/**
 *
 * @author ASUS
 */
public class RuanganDAOImpl extends GeneralDAOImpl implements RuanganDAO {
    public RuanganDAOImpl(){
        super();
    }

    @Override
    public Ruangan getById(long id) {
        return em.find(Ruangan.class, id);
    }

    @Override
    public List<Ruangan> getAll() {
        return em.createQuery("from Ruangan r").getResultList();
    }
    
}
