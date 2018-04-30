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
public class DataFasilitas extends Tambahan implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private DataFasilitasPK id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idRuangan",referencedColumnName = "id")
    private Ruangan ruangan;
    @ManyToOne(optional = false)
    @JoinColumn(name = "idFasilitas",referencedColumnName = "id")
    private Fasilitas fasilitas;
    
    public DataFasilitas(){
        
    }
    
    public DataFasilitas(Ruangan ruangan,Fasilitas fasilitas){
        this.fasilitas = fasilitas;
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
        if (!(object instanceof DataFasilitas)) {
            return false;
        }
        DataFasilitas other = (DataFasilitas) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DataFasilitas[ id=" + getId() + " ]";
    }

    

    /**
     * @return the id
     */
    public DataFasilitasPK getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(DataFasilitasPK id) {
        this.id = id;
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
     * @return the fasilitas
     */
    public Fasilitas getFasilitas() {
        return fasilitas;
    }

    /**
     * @param fasilitas the fasilitas to set
     */
    public void setFasilitas(Fasilitas fasilitas) {
        this.fasilitas = fasilitas;
    }
    
}
