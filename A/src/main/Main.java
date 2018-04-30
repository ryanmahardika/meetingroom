/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DAO.DataFasilitasDAO;
import DAO.DataKerusakanDAO;
import DAO.DataLoginDAO;
import DAO.DataPengajuanDAO;
import DAO.FasilitasDAO;
import DAO.KaryawanDAO;
import DAO.LoginRoleDAO;
import DAO.PesertaDAO;
import DAO.RuanganDAO;
import DAOImpl.DataFasilitasDAOImpl;
import DAOImpl.DataKerusakanDAOImpl;
import DAOImpl.DataLoginDAOImpl;
import DAOImpl.DataPengajuanDAOImpl;
import DAOImpl.FasilitasDAOImpl;
import DAOImpl.KaryawanDAOImpl;
import DAOImpl.LoginRoleDAOImpl;
import DAOImpl.PesertaDAOImpl;
import DAOImpl.RuanganDAOImpl;
import helper.PasswordEncr;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Date;
import javax.persistence.EntityManager;
import model.DataFasilitas;
import model.DataKerusakan;
import model.DataLogin;
import model.DataPengajuan;
import model.Fasilitas;
import model.Karyawan;
import model.LoginRole;
import model.Peserta;
import model.Ruangan;

/**
 *
 * @author Angga
 */
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        EntityManager em = db.DbConnection.getConnection();
        
//        LoginRoleDAO ldao = new LoginRoleDAOImpl();
//        LoginRole l = new LoginRole();
//        LoginRole l2 = new LoginRole();
//        
//        l.setLoginRole("Admin");
//        l2.setLoginRole("User");
//        
//        ldao.insert(l);
//        ldao.insert(l2);

//        LoginRoleDAO ldao = new LoginRoleDAOImpl();
//        LoginRole lr = ldao.getById(2);
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        Karyawan k = new Karyawan();
//        Karyawan k2 = new Karyawan();
        
//        k.setNama("Edi");
//        k.setAlamat("depok");
//        k.setJabatan("staff");
//        k.setKtp("123");
//        k.setNik("1234");
//        k.setNomorTelpon("0000");
//        k2.setNama("Dina");
        
//        kdao.insert(k);
//        kdao.insert(k2);
        
//        DataLoginDAO ddao = new DataLoginDAOImpl();
//        DataLogin d = new DataLogin();
//        DataLogin d2 = new DataLogin();
        
//        d.setUsername("ediedi");
//        d.setPassword(PasswordEncr.hash256("abcd"));
//        d.setKaryawan(k);
//        d.setLoginRole(lr);
//        d2.setUsername("DinaUser");
//        d2.setPassword("DinaPass");
//        d2.setKaryawan(k2);
//        d2.setLoginRole(lr);
        
//        ddao.insert(d);
//        ddao.insert(d2);


          
//        System.out.println("getLogin");
//        String username = "Budiuser";
//        String password = "BudiPass";
//        DataLoginDAOImpl instance = new DataLoginDAOImpl();
////        DataLogin expResult = null;
//        DataLogin result = instance.getLogin(username, password);
//        System.out.println(result.getId());
          
//        FasilitasDAO fdao = new FasilitasDAOImpl();
//        Fasilitas f = new Fasilitas();
//        Fasilitas f2 = new Fasilitas();
//        Fasilitas f3 = new Fasilitas();
//        Fasilitas f4 = new Fasilitas();
//        
//        f.setFasilitas("proyektor");
//        f2.setFasilitas("layar");
//        f3.setFasilitas("wifi");
//        f4.setFasilitas("papan tulis");
//        
//        fdao.insert(f);
//        fdao.insert(f2);
//        fdao.insert(f3);
//        fdao.insert(f4);

//        RuanganDAO rdao = new RuanganDAOImpl();
//        Ruangan r = new Ruangan();
//        Ruangan r2 = new Ruangan();
        
//        r.setNamaRuangan("Anggrek");
//        r.setKapasitas(20);
        
//        r.setStatusRuangan("tersedia");
//        r2.setNamaRuangan("Bakung");
        
//        rdao.insert(r);
//        rdao.insert(r2);

//        DataFasilitasDAO dfdao = new DataFasilitasDAOImpl();
//        DataFasilitas df = new DataFasilitas();
//        DataFasilitas df2 = new DataFasilitas();
//        DataFasilitas df3 = new DataFasilitas();
//        RuanganDAO rdao = new RuanganDAOImpl();
//        FasilitasDAO fdao = new FasilitasDAOImpl();
//        Ruangan r = rdao.getById(1);
//        Fasilitas f = fdao.getById(3);
//        Ruangan r2 = rdao.getById(2);
//        Fasilitas f2 = fdao.getById(2);
//        Fasilitas f3 = fdao.getById(4);
        
//        df.setRuangan(r);
//        df.setFasilitas(f);
//        df2.setRuangan(r2);
//        df2.setFasilitas(f2);
//        df3.setRuangan(r2);
//        df3.setFasilitas(f3);
        
//        dfdao.insert(df);
//        dfdao.insert(df2);
//        dfdao.insert(df3);
        
//        DataPengajuanDAO dpdao = new DataPengajuanDAOImpl();
//        DataPengajuan dp = new DataPengajuan();
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        Karyawan k = kdao.getById(1);
//        RuanganDAO rdao = new RuanganDAOImpl();
//        Ruangan r = rdao.getById(1);
//        
//        dp.setKaryawan(k);
//        dp.setRuangan(r);
//        dp.setSubjekMeeting("Interview");
//        
//        dpdao.insert(dp);

//          DataKerusakanDAO dkdao = new DataKerusakanDAOImpl();
//          KaryawanDAO kdao = new KaryawanDAOImpl();
//          RuanganDAO rdao = new RuanganDAOImpl();
//          Karyawan k = kdao.getById(1);
//          Ruangan r = rdao.getById(2);
//          DataKerusakan dk = new DataKerusakan(k, r);
//          dk.setDeskripsi("Rusaaaak");
//          
//          dkdao.insert(dk);

//          PesertaDAO pdao = new PesertaDAOImpl();
//          KaryawanDAO kdao = new KaryawanDAOImpl();
//          DataPengajuanDAO dpdao = new DataPengajuanDAOImpl();
          
//          DataPengajuan dp = dpdao.getById(1);
//          Karyawan k = kdao.getById(4);
//          Karyawan k2 = kdao.getById(4);
          
//          Peserta p = new Peserta();
//          Peserta p2 = new Peserta();
          
//          p.setPengajuan(dp);
//          p.setKaryawan(k);
//          p2.setPengajuan(dp);
//          p2.setKaryawan(k);
          
//          pdao.insert(p);
//          pdao.insert(p2);

            DataKerusakanDAO dkdao = new DataKerusakanDAOImpl();
            KaryawanDAO kdao = new KaryawanDAOImpl();
            RuanganDAO rdao = new RuanganDAOImpl();
            Karyawan k = kdao.getById(1);
            Ruangan r = rdao.getById(1);
            DataKerusakan dk = new DataKerusakan(k, r);
            
            dk.setFasilitasRusak("proyektor");
            dk.setTanggalRusak(new Date());
            
            dkdao.insertDataRusak(dk);
           

//        String passwordToHash = "password";
//        byte[] salt = getSalt();
//         
//        String securePassword = get_SHA_1_SecurePassword(passwordToHash, salt);
//        System.out.println(securePassword);
//         
//    }
// 
//    private static String get_SHA_1_SecurePassword(String passwordToHash, byte[] salt)
//    {
//        String generatedPassword = null;
//        try {
//            MessageDigest md = MessageDigest.getInstance("SHA-1");
//            md.update(salt);
//            byte[] bytes = md.digest(passwordToHash.getBytes());
//            StringBuilder sb = new StringBuilder();
//            for(int i=0; i< bytes.length ;i++)
//            {
//                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
//            }
//            generatedPassword = sb.toString();
//        }
//        catch (NoSuchAlgorithmException e)
//        {
//        }
//        return generatedPassword;
//    }
//    
//    //Add salt
//    private static byte[] getSalt() throws NoSuchAlgorithmException
//    {
//        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
//        byte[] salt = new byte[16];
//        sr.nextBytes(salt);
//        return salt;
    }
}
 

