/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.DataPengajuan;

/**
 *
 * @author Ryan
 */
public interface DataPengajuanDAO extends GeneralDAO {
    public DataPengajuan getById(long id);
    public List<DataPengajuan> getAll();
<<<<<<< HEAD
    public List<DataPengajuan> getPengajuanPending();
=======
    public List<DataPengajuan> pengajuanPending();
>>>>>>> 9102fe32473fba29e8b90498ef018a6cd4ac336a
}
