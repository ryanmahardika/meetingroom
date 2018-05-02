/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Ryan
 */
@Entity
public class DataKerusakan extends Tambahan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private DataKerusakanPK id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idKaryawan",referencedColumnName = "id")
    private Karyawan karyawan;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idRuangan",referencedColumnName = "id")
    private Ruangan ruangan;
    @Column(name = "deskripsi",length = 200,insertable = true,nullable = true)
    private String deskripsi;
    @Column(name = "attachment",insertable = true,nullable = true)
    private String attachment;
    @Column(name = "status_perbaikan",length = 20,updatable = true,nullable = false)
    private String statusPerbaikan;
    @Column(name = "kode_kerusakan",length = 5,unique = true,insertable = true)
    private String kodeKerusakan;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "tanggal_rusak")
    private Date tanggalRusak;
    @Column(name = "fasilitas_rusak",length = 100,insertable = true,nullable = false)
    private String fasilitasRusak;
    
    


    public DataKerusakan(){
        statusPerbaikan = "Belum Diperbaiki";
    }
    
    public DataKerusakan(Karyawan karyawan,Ruangan ruangan){
        this.karyawan = karyawan;
        this.ruangan = ruangan;
        statusPerbaikan = "Belum Diperbaiki";
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

    /**
     * @return the attachment
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * @param attachment the attachment to set
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * @return the statusPerbaikan
     */
    public String getStatusPerbaikan() {
        return statusPerbaikan;
    }

    /**
     * @param statusPerbaikan the statusPerbaikan to set
     */
    public void setStatusPerbaikan(String statusPerbaikan) {
        this.statusPerbaikan = statusPerbaikan;
    }

    /**
     * @return the kodeKerusakan
     */
    public String getKodeKerusakan() {
        return kodeKerusakan;
    }

    /**
     * @param kodeKerusakan the kodeKerusakan to set
     */
    public void setKodeKerusakan(String kodeKerusakan) {
        this.kodeKerusakan = kodeKerusakan;
    }

    /**
     * @return the tanggalRusak
     */
    public Date getTanggalRusak() {
        return tanggalRusak;
    }

    /**
     * @param tanggalRusak the tanggalRusak to set
     */
    public void setTanggalRusak(Date tanggalRusak) {
        this.tanggalRusak = tanggalRusak;
    }

    /**
     * @return the fasilitasRusak
     */
    public String getFasilitasRusak() {
        return fasilitasRusak;
    }

    /**
     * @param fasilitasRusak the fasilitasRusak to set
     */
    public void setFasilitasRusak(String fasilitasRusak) {
        this.fasilitasRusak = fasilitasRusak;
    }
    
}
