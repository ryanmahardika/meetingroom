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
 * @author Ryan
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

    @Override
<<<<<<< HEAD
    public List<DataPengajuan> getPengajuanPending() {
=======
    public List<DataPengajuan> pengajuanPending() {
>>>>>>> 9102fe32473fba29e8b90498ef018a6cd4ac336a
        return em.createNamedQuery("pengajuanPending").getResultList();
    }
    
}