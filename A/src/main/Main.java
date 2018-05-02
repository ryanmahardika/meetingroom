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
//        l.setLoginRole("Admin");
//        l2.setLoginRole("User");
//        ldao.insert(l);
//        ldao.insert(l2);
          
//        FasilitasDAO fdao = new FasilitasDAOImpl();
//        Fasilitas f = new Fasilitas();      
//        f.setFasilitas("proyektor");
//        fdao.insert(f);

//        RuanganDAO rdao = new RuanganDAOImpl();
//        Ruangan r = new Ruangan();
//        r.setNamaRuangan("Anggrek");
//        r.setKapasitas(20);
//        rdao.insert(r);

//        DataFasilitasDAO dfdao = new DataFasilitasDAOImpl();
//        DataFasilitas df = new DataFasilitas();
//        RuanganDAO rdao = new RuanganDAOImpl();
//        FasilitasDAO fdao = new FasilitasDAOImpl();
//        Ruangan r = rdao.getById(1);
//        Fasilitas f = fdao.getById(3);
//        df.setRuangan(r);
//        df.setFasilitas(f);
//        dfdao.insert(df);

//        DataPengajuanDAO dpdao = new DataPengajuanDAOImpl();
//        DataPengajuan dp = new DataPengajuan();
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        Karyawan k = kdao.getById(1);
//        RuanganDAO rdao = new RuanganDAOImpl();
//        Ruangan r = rdao.getById(1);
//        dp.setKaryawan(k);
//        dp.setRuangan(r);
//        dp.setSubjekMeeting("Interview");
//        dpdao.insert(dp);

//        DataKerusakanDAO dkdao = new DataKerusakanDAOImpl();
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        RuanganDAO rdao = new RuanganDAOImpl();
//        Karyawan k = kdao.getById(1);
//        Ruangan r = rdao.getById(2);
//        DataKerusakan dk = new DataKerusakan(k, r);
//        dk.setDeskripsi("Rusaaaak");
//        dkdao.insert(dk);

//        PesertaDAO pdao = new PesertaDAOImpl();
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        DataPengajuanDAO dpdao = new DataPengajuanDAOImpl();
//        DataPengajuan dp = dpdao.getById(1);
//        Karyawan k = kdao.getById(1);          
//        Peserta p = new Peserta();
//        p.setPengajuan(dp);
//        p.setKaryawan(k);       
//        pdao.insert(p);

//        DataKerusakanDAO dkdao = new DataKerusakanDAOImpl();
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        RuanganDAO rdao = new RuanganDAOImpl();
//        Karyawan k = kdao.getById(1);
//        Ruangan r = rdao.getById(1);
//        DataKerusakan dk = new DataKerusakan(k, r);
//        dk.setFasilitasRusak("proyektor");
//        dk.setTanggalRusak(new Date());
//        dkdao.insertDataRusak(dk);

//        DataLogin dl = new DataLogin();
//        DataLoginDAO dldao = new DataLoginDAOImpl();
//        Karyawan k = new Karyawan();
//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        k = kdao.getById(1);
//        dl.setUsername("mahardika");
//        dl.setPassword(PasswordEncr.hash256("12345"));      
//        dl.setEmail("mahardikaputra12@gmail.com");
//        dl.setKaryawan(k);
//        dldao.insert(dl);

//        KaryawanDAO kdao = new KaryawanDAOImpl();
//        Karyawan k = new Karyawan();
//        k.setNik("109091");
//        k.setAlamat("Pamulang");
//        k.setJabatan("Staff");
//        k.setNama("Mahardika");
//        k.setKtp("367406");
//        k.setNomorTelpon("0856");
//        kdao.insert(k);

        KaryawanDAO kdao = new KaryawanDAOImpl();
        Karyawan k = kdao.getById(1);
        k.setNama("Ryan");
        kdao.update(k);

    }
}
 

