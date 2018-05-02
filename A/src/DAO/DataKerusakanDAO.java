/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.DataKerusakan;

/**
 *
 * @author ASUS
 */
public interface DataKerusakanDAO extends GeneralDAO {
    public DataKerusakan getById(long id);
    public List<DataKerusakan> getAll();
//    public void insertDataRusak(DataKerusakan d);
}
