/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

//import java.sql.Connection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Angga
 */
public class DbConnection {
    public static EntityManager getConnection(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("APU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
