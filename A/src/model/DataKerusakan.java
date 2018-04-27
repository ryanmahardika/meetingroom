/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Angga
 */
@Entity
public class DataKerusakan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private DataKerusakanPK id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idKaryawan",referencedColumnName = "id")
    private Karyawan karyawan;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idRuangan",referencedColumnName = "id")
    private Ruangan ruangan;
    private String deskripsi;


    public DataKerusakan(){
        
    }
    
    public DataKerusakan(Karyawan karyawan,Ruangan ruangan){
        this.karyawan = karyawan;
        this.ruangan = ruangan;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataKerusakan)) {
            return false;
        }
        DataKerusakan other = (DataKerusakan) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DataKerusakan[ id=" + getId() + " ]";
    }

    /**
     * @return the id
     */
    public DataKerusakanPK getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(DataKerusakanPK id) {
        this.id = id;
    }

    /**
     * @return the karyawan
     */
    public Karyawan getKaryawan() {
        return karyawan;
    }

    /**
     * @param karyawan the karyawan to set
     */
    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    /**
     * @return the ruangan
     */
    public Ruangan getRuangan() {
        return ruangan;
    }

    /**
     * @param ruangan the ruangan to set
     */
    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    /**
     * @return the deskripsi
     */
    public String getDeskripsi() {
        return deskripsi;
    }

    /**
     * @param deskripsi the deskripsi to set
     */
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
}
