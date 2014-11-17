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
@Table(name = "Variedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Variedad.findAll", query = "SELECT v FROM Variedad v"),
    @NamedQuery(name = "Variedad.findByVarId", query = "SELECT v FROM Variedad v WHERE v.varId = :varId"),
    @NamedQuery(name = "Variedad.findByVarFlor", query = "SELECT v FROM Variedad v WHERE v.varFlor = :varFlor"),
    @NamedQuery(name = "Variedad.findByVarNombre", query = "SELECT v FROM Variedad v WHERE v.varNombre = :varNombre"),
    @NamedQuery(name = "Variedad.findByVarColor", query = "SELECT v FROM Variedad v WHERE v.varColor = :varColor"),
    @NamedQuery(name = "Variedad.findByVarUnidad", query = "SELECT v FROM Variedad v WHERE v.varUnidad = :varUnidad"),
    @NamedQuery(name = "Variedad.findByVarNota", query = "SELECT v FROM Variedad v WHERE v.varNota = :varNota"),
    @NamedQuery(name = "Variedad.findByVarImagen", query = "SELECT v FROM Variedad v WHERE v.varImagen = :varImagen"),
    @NamedQuery(name = "Variedad.findByVarDisponibilidad", query = "SELECT v FROM Variedad v WHERE v.varDisponibilidad = :varDisponibilidad")})
public class Variedad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "var_id")
    private Integer varId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "var_flor")
    private String varFlor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "var_nombre")
    private String varNombre;
    @Size(max = 45)
    @Column(name = "var_color")
    private String varColor;
    @Size(max = 45)
    @Column(name = "var_unidad")
    private String varUnidad;
    @Size(max = 200)
    @Column(name = "var_nota")
    private String varNota;
    @Size(max = 100)
    @Column(name = "var_imagen")
    private String varImagen;
    @Size(max = 45)
    @Column(name = "var_disponibilidad")
    private String varDisponibilidad;

    public Variedad() {
    }

    public Variedad(Integer varId) {
        this.varId = varId;
    }

    public Variedad(Integer varId, String varFlor, String varNombre) {
        this.varId = varId;
        this.varFlor = varFlor;
        this.varNombre = varNombre;
    }

    public Integer getVarId() {
        return varId;
    }

    public void setVarId(Integer varId) {
        this.varId = varId;
    }

    public String getVarFlor() {
        return varFlor;
    }

    public void setVarFlor(String varFlor) {
        this.varFlor = varFlor;
    }

    public String getVarNombre() {
        return varNombre;
    }

    public void setVarNombre(String varNombre) {
        this.varNombre = varNombre;
    }

    public String getVarColor() {
        return varColor;
    }

    public void setVarColor(String varColor) {
        this.varColor = varColor;
    }

    public String getVarUnidad() {
        return varUnidad;
    }

    public void setVarUnidad(String varUnidad) {
        this.varUnidad = varUnidad;
    }

    public String getVarNota() {
        return varNota;
    }

    public void setVarNota(String varNota) {
        this.varNota = varNota;
    }

    public String getVarImagen() {
        return varImagen;
    }

    public void setVarImagen(String varImagen) {
        this.varImagen = varImagen;
    }

    public String getVarDisponibilidad() {
        return varDisponibilidad;
    }

    public void setVarDisponibilidad(String varDisponibilidad) {
        this.varDisponibilidad = varDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (varId != null ? varId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Variedad)) {
            return false;
        }
        Variedad other = (Variedad) object;
        if ((this.varId == null && other.varId != null) || (this.varId != null && !this.varId.equals(other.varId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jsp.Variedad[ varId=" + varId + " ]";
    }
    
}
