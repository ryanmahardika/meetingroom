/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.DataLogin;

/**
 *
 * @author Angga
 */
public interface DataLoginDAO extends GeneralDAO{
    public DataLogin getById(long id);
    public List<DataLogin> getAll();
    public DataLogin getLogin(String username,String password);
    public boolean getExistUsername(String username);
}
