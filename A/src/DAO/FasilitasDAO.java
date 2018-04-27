/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Fasilitas;

/**
 *
 * @author ASUS
 */
public interface FasilitasDAO extends GeneralDAO {
    public Fasilitas getById(long id);
    public List<Fasilitas> getAll();
}
