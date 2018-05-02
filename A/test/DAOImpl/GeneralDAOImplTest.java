/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import DAO.DataFasilitasDAO;
import DAO.DataKerusakanDAO;
import DAO.DataPengajuanDAO;
import DAO.FasilitasDAO;
import DAO.KaryawanDAO;
import DAO.RuanganDAO;
import java.util.Date;
import model.DataFasilitas;
import model.DataKerusakan;
import model.DataPengajuan;
import model.Fasilitas;
import model.Karyawan;
import model.PilihWaktu;
import model.Ruangan;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryan
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

    /**
     * Test of insertData method, of class GeneralDAOImpl.
     */
    @Test
    public void testInsertData() {
        //Insert Data Karyawan
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        Karyawan k = new Karyawan();
//        k.setNik("109091");
//        k.setAlamat("Pamulang");
//        k.setJabatan("Staff");
//        k.setNama("Mahardika");
//        k.setKtp("367406");
//        k.setNomorTelpon("0856");
//        assertTrue(kdao.insertData(k));

        //Insert Data Ruangan
//        RuanganDAO rdao = new RuanganDAOImpl();
//        Ruangan r = new Ruangan();
//        r.setNamaRuangan("Anggrek");
//        r.setKapasitas(20);
//        rdao.insert(r);
        
        //Insert Data Pengajuan
//        DataPengajuanDAO dpdao = new DataPengajuanDAOImpl();
//        DataPengajuan dp = new DataPengajuan();
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        Karyawan k = kdao.getById(1);
//        RuanganDAO rdao = new RuanganDAOImpl();
//        Ruangan r = rdao.getById(1);
//        dp.setKaryawan(k);
//        dp.setRuangan(r);
//        dp.setSubjekMeeting("Interview");
//        dp.setTanggalPemakaian(new Date());
//        dp.setMulai(PilihWaktu.time1.toString());
//        dp.setSelesai(PilihWaktu.time4.toString());
//        dpdao.insert(dp);

        //Insert Fasilitas
//        FasilitasDAO fdao = new FasilitasDAOImpl();
//        Fasilitas f = new Fasilitas();      
//        f.setFasilitas("proyektor");
//        fdao.insert(f);

        //Insert Data Fasilitas Ruangan
//        DataFasilitasDAO dfdao = new DataFasilitasDAOImpl();
//        DataFasilitas df = new DataFasilitas();
//        RuanganDAO rdao = new RuanganDAOImpl();
//        FasilitasDAO fdao = new FasilitasDAOImpl();
//        Ruangan r = rdao.getById(1);
//        Fasilitas f = fdao.getById(1);
//        df.setRuangan(r);
//        df.setFasilitas(f);
//        dfdao.insert(df);

        //Insert Data Kerusakan
//        DataKerusakanDAO dkdao = new DataKerusakanDAOImpl();
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        RuanganDAO rdao = new RuanganDAOImpl();
//        Karyawan k = kdao.getById(1);
//        Ruangan r = rdao.getById(1);
//        DataKerusakan dk = new DataKerusakan(k, r);
//        dk.setTanggalRusak(new Date());
//        dk.setFasilitasRusak("Proyektor");
//        dk.setDeskripsi("Proyektor Rusak");
//        dkdao.insert(dk);

    } //Jika Salah Satu Data Di Atas Ada Yang Tidak Diinput, Maka Tes Input Akan Error
    
    /**
     * Test of updateData method, of class GeneralDAOImpl.
     */
//    @Test
//    public void testUpdateData() {
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        Karyawan k = kdao.getById(1);
//        k.setNama("Mahardika");
//        assertTrue(kdao.updateData(k));
//    }
    
}
