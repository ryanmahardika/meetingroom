/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.LoginRoleDAO;
import java.util.List;
import model.LoginRole;

/**
 *
 * @author Angga
 */
public class LoginRoleDAOImpl extends GeneralDAOImpl implements LoginRoleDAO{
    
    public LoginRoleDAOImpl(){
        super();
    }

    @Override
    public LoginRole getById(long id) {
        return em.find(LoginRole.class, id);
    }

    @Override
    public List<LoginRole> getAll() {
        return em.createQuery("from LoginRole lr").getResultList();
    }

    
}
