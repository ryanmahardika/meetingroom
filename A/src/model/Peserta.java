/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Angga
 */
@Entity
public class Peserta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private PesertaPK id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idkaryawan",referencedColumnName = "id")
    Karyawan karyawan;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idpengajuan",referencedColumnName = "id")
    DataPengajuan pengajuan;
    @Column(name = "status_hadir",length = 15)
    private String statusHadir;
    
    public Peserta(){
        statusHadir = "Pending";
    }
    
    public Peserta(Karyawan karyawan,DataPengajuan pengajuan){
        this.karyawan = karyawan;
        this.pengajuan = pengajuan;
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
        if (!(object instanceof Peserta)) {
            return false;
        }
        Peserta other = (Peserta) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Peserta[ id=" + getId() + " ]";
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
     * @return the pengajuan
     */
    public DataPengajuan getPengajuan() {
        return pengajuan;
    }

    /**
     * @param pengajuan the pengajuan to set
     */
    public void setPengajuan(DataPengajuan pengajuan) {
        this.pengajuan = pengajuan;
    }

    /**
     * @return the statusHadir
     */
    public String getStatusHadir() {
        return statusHadir;
    }

    /**
     * @param statusHadir the statusHadir to set
     */
    public void setStatusHadir(String statusHadir) {
        this.statusHadir = statusHadir;
    }

    /**
     * @return the id
     */
    public PesertaPK getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(PesertaPK id) {
        this.id = id;
    }
    
}
