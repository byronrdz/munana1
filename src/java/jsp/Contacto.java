/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsp;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author byron
 */
@Entity
@Table(name = "Contacto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacto.findAll", query = "SELECT c FROM Contacto c"),
    @NamedQuery(name = "Contacto.findByConId", query = "SELECT c FROM Contacto c WHERE c.conId = :conId"),
    @NamedQuery(name = "Contacto.findByConNombre", query = "SELECT c FROM Contacto c WHERE c.conNombre = :conNombre"),
    @NamedQuery(name = "Contacto.findByConTelefono", query = "SELECT c FROM Contacto c WHERE c.conTelefono = :conTelefono"),
    @NamedQuery(name = "Contacto.findByConMovil", query = "SELECT c FROM Contacto c WHERE c.conMovil = :conMovil"),
    @NamedQuery(name = "Contacto.findByConEmail", query = "SELECT c FROM Contacto c WHERE c.conEmail = :conEmail"),
    @NamedQuery(name = "Contacto.findByConSkype", query = "SELECT c FROM Contacto c WHERE c.conSkype = :conSkype"),
    @NamedQuery(name = "Contacto.findByConCargo", query = "SELECT c FROM Contacto c WHERE c.conCargo = :conCargo"),
    @NamedQuery(name = "Contacto.findByConVigente", query = "SELECT c FROM Contacto c WHERE c.conVigente = :conVigente"),
    @NamedQuery(name = "Contacto.findByConNota", query = "SELECT c FROM Contacto c WHERE c.conNota = :conNota")})
public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "con_id")
    private Integer conId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "con_nombre")
    private String conNombre;
    @Size(max = 20)
    @Column(name = "con_telefono")
    private String conTelefono;
    @Size(max = 20)
    @Column(name = "con_movil")
    private String conMovil;
    @Size(max = 100)
    @Column(name = "con_email")
    private String conEmail;
    @Size(max = 45)
    @Column(name = "con_skype")
    private String conSkype;
    @Size(max = 45)
    @Column(name = "con_cargo")
    private String conCargo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "con_vigente")
    private short conVigente;
    @Size(max = 200)
    @Column(name = "con_nota")
    private String conNota;
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
    @ManyToOne
    private Empresa empId;

    public Contacto() {
    }

    public Contacto(Integer conId) {
        this.conId = conId;
    }

    public Contacto(Integer conId, String conNombre, short conVigente) {
        this.conId = conId;
        this.conNombre = conNombre;
        this.conVigente = conVigente;
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public String getConNombre() {
        return conNombre;
    }

    public void setConNombre(String conNombre) {
        this.conNombre = conNombre;
    }

    public String getConTelefono() {
        return conTelefono;
    }

    public void setConTelefono(String conTelefono) {
        this.conTelefono = conTelefono;
    }

    public String getConMovil() {
        return conMovil;
    }

    public void setConMovil(String conMovil) {
        this.conMovil = conMovil;
    }

    public String getConEmail() {
        return conEmail;
    }

    public void setConEmail(String conEmail) {
        this.conEmail = conEmail;
    }

    public String getConSkype() {
        return conSkype;
    }

    public void setConSkype(String conSkype) {
        this.conSkype = conSkype;
    }

    public String getConCargo() {
        return conCargo;
    }

    public void setConCargo(String conCargo) {
        this.conCargo = conCargo;
    }

    public short getConVigente() {
        return conVigente;
    }

    public void setConVigente(short conVigente) {
        this.conVigente = conVigente;
    }

    public String getConNota() {
        return conNota;
    }

    public void setConNota(String conNota) {
        this.conNota = conNota;
    }

    public Empresa getEmpId() {
        return empId;
    }

    public void setEmpId(Empresa empId) {
        this.empId = empId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conId != null ? conId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacto)) {
            return false;
        }
        Contacto other = (Contacto) object;
        if ((this.conId == null && other.conId != null) || (this.conId != null && !this.conId.equals(other.conId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jsp.Contacto[ conId=" + conId + " ]";
    }
    
}
