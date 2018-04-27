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

/**
 *
 * @author Angga
 */
@Entity
public class Ruangan implements Serializable {

    @OneToMany(mappedBy = "ruangan")
    private List<DataFasilitas> dataFasilitass;

    @OneToMany(mappedBy = "ruangan")
    private List<DataKerusakan> dataKerusakans;

    @OneToMany(mappedBy = "ruangan")
    private List<DataPengajuan> dataPengajuans;

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namaRuangan;

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
        if (!(object instanceof Ruangan)) {
            return false;
        }
        Ruangan other = (Ruangan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Ruangan[ id=" + id + " ]";
    }

    /**
     * @return the namaRuangan
     */
    public String getNamaRuangan() {
        return namaRuangan;
    }

    /**
     * @param namaRuangan the namaRuangan to set
     */
    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
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
    
}
