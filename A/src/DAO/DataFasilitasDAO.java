/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.DataFasilitas;

/**
 *
 * @author Ryan
 */
public interface DataFasilitasDAO extends GeneralDAO {
    public DataFasilitas getById(long id);
    public List<DataFasilitas> getAll();
}
