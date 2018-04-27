/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.DataPengajuanDAO;
import java.util.List;
import model.DataPengajuan;


/**
 *
 * @author ASUS
 */
public class DataPengajuanDAOImpl extends GeneralDAOImpl implements DataPengajuanDAO {

    public DataPengajuanDAOImpl(){
        super();
    }

    @Override
    public DataPengajuan getById(long id) {
       return em.find(DataPengajuan.class, id);
    }

    @Override
    public List<DataPengajuan> getAll() {
        return em.createQuery("from DataPengajuan dp").getResultList();
    }
    
}