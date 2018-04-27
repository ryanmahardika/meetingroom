/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Ruangan;

/**
 *
 * @author ASUS
 */
public interface RuanganDAO extends GeneralDAO {
    public Ruangan getById(long id);
    public List<Ruangan> getAll();
}
