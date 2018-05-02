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
 * @author Ryan
 */
@Embeddable
public class DataKerusakanPK implements Serializable {
    @Basic(optional = false)
    @Column(insertable = false,updatable = false)
    private long idKaryawan;
    @Basic(optional = false)
    @Column(insertable = false,updatable = false)
    private long idRuangan;

    public DataKerusakanPK(){
        
    }
    
    public DataKerusakanPK(long idKaryawan,long idRuangan){
        this.idKaryawan = idKaryawan;
        this.idRuangan = idRuangan;
    }
    /**
     * @return the idKaryawan
     */
    public Long getIdKaryawan() {
        return idKaryawan;
    }

    /**
     * @param idKaryawan the idKaryawan to set
     */
    public void setIdKaryawan(Long idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    /**
     * @return the idRuangan
     */
    public Long getIdRuangan() {
        return idRuangan;
    }

    /**
     * @param idRuangan the idRuangan to set
     */
    public void setIdRuangan(Long idRuangan) {
        this.idRuangan = idRuangan;
    }
}
