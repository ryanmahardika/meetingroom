/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.DataLoginDAO;
import java.util.List;
import model.DataLogin;

/**
 *
 * @author Angga
 */
public class DataLoginDAOImpl extends GeneralDAOImpl implements DataLoginDAO{

    public DataLoginDAOImpl(){
        super();
}
    @Override
    public DataLogin getById(long id) {
        return em.find(DataLogin.class,id);
    }

    @Override
    public List<DataLogin> getAll() {
        return em.createQuery("from DataLogin d").getResultList();
    }   

    @Override
    public DataLogin getLogin(String username, String password) {
        DataLogin tes = null;
        try {
            tes = (DataLogin)em.createQuery("select d from DataLogin d where d.username=?1 and d.password=?2").setParameter(1, username).setParameter(2,password).getSingleResult();
        } catch (Exception e) {
            
        }
        return tes;
    }    

    @Override
    public boolean getExistUsername(String username) {
        boolean exist = false;
        List<String> listusername = em.createQuery("select u.username from DataLogin u").getResultList();
        for (String s : listusername){
            if (username.equals(s)){
                exist=true;
            }
        }return exist;
    }
}
