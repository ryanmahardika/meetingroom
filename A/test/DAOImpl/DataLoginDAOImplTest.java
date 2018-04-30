/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import helper.PasswordEncr;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import model.DataLogin;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Angga
 */
public class DataLoginDAOImplTest {
    
    public DataLoginDAOImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getById method, of class DataLoginDAOImpl.
     */
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        long id = 0L;
//        DataLoginDAOImpl instance = new DataLoginDAOImpl();
//        DataLogin expResult = null;
//        DataLogin result = instance.getById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getAll method, of class DataLoginDAOImpl.
     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        DataLoginDAOImpl instance = new DataLoginDAOImpl();
//        List<DataLogin> expResult = null;
//        List<DataLogin> result = instance.getAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getLogin method, of class DataLoginDAOImpl.
     */
    @Test
    public void testGetLogin() throws NoSuchAlgorithmException {
        System.out.println("getLogin");
        String username = "";
        String password = "";
        DataLoginDAOImpl instance = new DataLoginDAOImpl();
//        DataLogin expResult = null;
        DataLogin result = instance.getLogin(username, PasswordEncr.hash256(password));
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
