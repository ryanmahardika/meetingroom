/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Angga
 */
@Embeddable
public class DataFasilitasPK implements Serializable {
    @Basic(optional = false)
    @Column(insertable = false,updatable = false)
    private long idRuangan;
    @Basic(optional = false)
    @Column(insertable = false,updatable = false)
    private long idFasilitas;
    
    public DataFasilitasPK(){
        
    }
    
    public DataFasilitasPK(long idRuangan,long idFasilitas){
        this.idRuangan = idRuangan;
        this.idFasilitas = idFasilitas;
    }

    /**
     * @return the idRuangan
     */
    public long getIdRuangan() {
        return idRuangan;
    }

    /**
     * @param idRuangan the idRuangan to set
     */
    public void setIdRuangan(long idRuangan) {
        this.idRuangan = idRuangan;
    }

    /**
     * @return the idFasilitas
     */
    public long getIdFasilitas() {
        return idFasilitas;
    }

    /**
     * @param idFasilitas the idFasilitas to set
     */
    public void setIdFasilitas(long idFasilitas) {
        this.idFasilitas = idFasilitas;
    }
}
