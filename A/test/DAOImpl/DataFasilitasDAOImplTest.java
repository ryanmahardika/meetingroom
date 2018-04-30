/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import java.util.List;
import model.DataFasilitas;
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
public class DataFasilitasDAOImplTest {
    
    public DataFasilitasDAOImplTest() {
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
     * Test of getById method, of class DataFasilitasDAOImpl.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        long id = 0L;
        DataFasilitasDAOImpl instance = new DataFasilitasDAOImpl();
        DataFasilitas expResult = null;
        DataFasilitas result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class DataFasilitasDAOImpl.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        DataFasilitasDAOImpl instance = new DataFasilitasDAOImpl();
        List<DataFasilitas> expResult = null;
        List<DataFasilitas> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
