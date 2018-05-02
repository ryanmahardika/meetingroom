/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.KaryawanDAO;
import model.Karyawan;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class GeneralDAOImplTest {
    
    public GeneralDAOImplTest() {
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
     * Test of insert method, of class GeneralDAOImpl.
     */
//    @Test
//    public void testInsert() {
//        System.out.println("insert");
//        Object o = null;
//        GeneralDAOImpl instance = new GeneralDAOImpl();
//        instance.insert(o);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of update method, of class GeneralDAOImpl.
//     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        Object o = null;
//        GeneralDAOImpl instance = new GeneralDAOImpl();
//        instance.update(o);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of delete method, of class GeneralDAOImpl.
//     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Object o = null;
//        GeneralDAOImpl instance = new GeneralDAOImpl();
//        instance.delete(o);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of insertData method, of class GeneralDAOImpl.
//     */
//    @Test
//    public void testInsertData() {
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        Karyawan k = new Karyawan();
//        k.setNik("109091");
//        k.setAlamat("Pamulang");
//        k.setJabatan("Staff");
//        k.setNama("Mahardika");
//        k.setKtp("367406");
//        k.setNomorTelpon("0856");
//        assertTrue(kdao.insertData(k));
//    } //Jika Salah Satu Data Di Atas Ada Yang Tidak Diinput, Maka Tes Input Akan Error
    
    /**
     * Test of updateData method, of class GeneralDAOImpl.
     */
    @Test
    public void testUpdateData() {
        KaryawanDAO kdao = new KaryawanDAOImpl();
        Karyawan k = kdao.getById(1);
        k.setNama("Mahardika");
        assertTrue(kdao.updateData(k));
    }
    
}
