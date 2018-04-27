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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Angga
 */
@Entity
public class DataPengajuan implements Serializable {

    @OneToMany(mappedBy = "pengajuan")
    private List<Peserta> pesertas;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Karyawan karyawan;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Ruangan ruangan;
    private String subjekMeeting;

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
        if (!(object instanceof DataPengajuan)) {
            return false;
        }
        DataPengajuan other = (DataPengajuan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DataPengajuan[ id=" + id + " ]";
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
     * @return the subjekMeeting
     */
    public String getSubjekMeeting() {
        return subjekMeeting;
    }

    /**
     * @param subjekMeeting the subjekMeeting to set
     */
    public void setSubjekMeeting(String subjekMeeting) {
        this.subjekMeeting = subjekMeeting;
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
    
}
