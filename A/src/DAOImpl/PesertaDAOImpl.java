/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.PesertaDAO;
import java.util.List;
import model.Peserta;

/**
 *
 * @author Angga
 */
public class PesertaDAOImpl extends GeneralDAOImpl implements PesertaDAO{

    public PesertaDAOImpl(){
        super();
}
    @Override
    public Peserta getById(long id) {
        return em.find(Peserta.class, id);
    }

    @Override
    public List<Peserta> getAll() {
        return em.createQuery("from Peserta p").getResultList();
    }
    
}
