/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Angga
 */
@Entity
public class Karyawan implements Serializable {

    @OneToMany(mappedBy = "karyawan")
    private List<Peserta> pesertas;

    @OneToMany(mappedBy = "karyawan")
    private List<DataKerusakan> dataKerusakans;

    @OneToMany(mappedBy = "karyawan")
    private List<DataPengajuan> dataPengajuans;

    @OneToOne(mappedBy = "karyawan")
    private DataLogin dataLogin;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Karyawan)) {
            return false;
        }
        Karyawan other = (Karyawan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Karyawan[ id=" + id + " ]";
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the dataLogin
     */
    public DataLogin getDataLogin() {
        return dataLogin;
    }

    /**
     * @param dataLogin the dataLogin to set
     */
    public void setDataLogin(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    /**
     * @return the dataPengajuans
     */
    public List<DataPengajuan> getDataPengajuans() {
        return dataPengajuans;
    }

    /**
     * @param dataPengajuans the dataPengajuans to set
     */
    public void setDataPengajuans(List<DataPengajuan> dataPengajuans) {
        this.dataPengajuans = dataPengajuans;
    }

    /**
     * @return the pesertas
     */
    public List<Peserta> getPesertas() {
        return pesertas;
    }

    /**
     * @param pesertas the pesertas to set
     */
    public void setPesertas(List<Peserta> pesertas) {
        this.pesertas = pesertas;
    }

    /**
     * @return the dataKerusakans
     */
    public List<DataKerusakan> getDataKerusakans() {
        return dataKerusakans;
    }

    /**
     * @param dataKerusakans the dataKerusakans to set
     */
    public void setDataKerusakans(List<DataKerusakan> dataKerusakans) {
        this.dataKerusakans = dataKerusakans;
    }
    
}
