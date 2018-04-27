/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Karyawan;

/**
 *
 * @author Angga
 */
public interface KaryawanDAO extends GeneralDAO{
    public Karyawan getById(long id);
    public List<Karyawan> getAll();
}
