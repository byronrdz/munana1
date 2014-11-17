/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author byron
 */
@Entity
@Table(name = "Empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByEmpId", query = "SELECT e FROM Empresa e WHERE e.empId = :empId"),
    @NamedQuery(name = "Empresa.findByEmpNombre", query = "SELECT e FROM Empresa e WHERE e.empNombre = :empNombre"),
    @NamedQuery(name = "Empresa.findByEmpCiudad", query = "SELECT e FROM Empresa e WHERE e.empCiudad = :empCiudad"),
    @NamedQuery(name = "Empresa.findByEmpDireccion", query = "SELECT e FROM Empresa e WHERE e.empDireccion = :empDireccion"),
    @NamedQuery(name = "Empresa.findByEmpTelefono", query = "SELECT e FROM Empresa e WHERE e.empTelefono = :empTelefono"),
    @NamedQuery(name = "Empresa.findByEmpWeb", query = "SELECT e FROM Empresa e WHERE e.empWeb = :empWeb"),
    @NamedQuery(name = "Empresa.findByEmpCodpostal", query = "SELECT e FROM Empresa e WHERE e.empCodpostal = :empCodpostal"),
    @NamedQuery(name = "Empresa.findByEmpTipo", query = "SELECT e FROM Empresa e WHERE e.empTipo = :empTipo"),
    @NamedQuery(name = "Empresa.findByEmpLat", query = "SELECT e FROM Empresa e WHERE e.empLat = :empLat"),
    @NamedQuery(name = "Empresa.findByEmpLon", query = "SELECT e FROM Empresa e WHERE e.empLon = :empLon"),
    @NamedQuery(name = "Empresa.findByEmpVigente", query = "SELECT e FROM Empresa e WHERE e.empVigente = :empVigente"),
    @NamedQuery(name = "Empresa.findByEmpNota", query = "SELECT e FROM Empresa e WHERE e.empNota = :empNota")})
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_id")
    private Integer empId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "emp_nombre")
    private String empNombre;
    @Size(max = 45)
    @Column(name = "emp_ciudad")
    private String empCiudad;
    @Size(max = 200)
    @Column(name = "emp_direccion")
    private String empDireccion;
    @Size(max = 20)
    @Column(name = "emp_telefono")
    private String empTelefono;
    @Size(max = 20)
    @Column(name = "emp_web")
    private String empWeb;
    @Column(name = "emp_codpostal")
    private Integer empCodpostal;
    @Size(max = 45)
    @Column(name = "emp_tipo")
    private String empTipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "emp_lat")
    private BigDecimal empLat;
    @Column(name = "emp_lon")
    private BigDecimal empLon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emp_vigente")
    private short empVigente;
    @Size(max = 200)
    @Column(name = "emp_nota")
    private String empNota;
    @OneToMany(mappedBy = "empId")
    private Collection<Contacto> contactoCollection;

    public Empresa() {
    }

    public Empresa(Integer empId) {
        this.empId = empId;
    }

    public Empresa(Integer empId, String empNombre, short empVigente) {
        this.empId = empId;
        this.empNombre = empNombre;
        this.empVigente = empVigente;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpCiudad() {
        return empCiudad;
    }

    public void setEmpCiudad(String empCiudad) {
        this.empCiudad = empCiudad;
    }

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public String getEmpWeb() {
        return empWeb;
    }

    public void setEmpWeb(String empWeb) {
        this.empWeb = empWeb;
    }

    public Integer getEmpCodpostal() {
        return empCodpostal;
    }

    public void setEmpCodpostal(Integer empCodpostal) {
        this.empCodpostal = empCodpostal;
    }

    public String getEmpTipo() {
        return empTipo;
    }

    public void setEmpTipo(String empTipo) {
        this.empTipo = empTipo;
    }

    public BigDecimal getEmpLat() {
        return empLat;
    }

    public void setEmpLat(BigDecimal empLat) {
        this.empLat = empLat;
    }

    public BigDecimal getEmpLon() {
        return empLon;
    }

    public void setEmpLon(BigDecimal empLon) {
        this.empLon = empLon;
    }

    public short getEmpVigente() {
        return empVigente;
    }

    public void setEmpVigente(short empVigente) {
        this.empVigente = empVigente;
    }

    public String getEmpNota() {
        return empNota;
    }

    public void setEmpNota(String empNota) {
        this.empNota = empNota;
    }

    @XmlTransient
    public Collection<Contacto> getContactoCollection() {
        return contactoCollection;
    }

    public void setContactoCollection(Collection<Contacto> contactoCollection) {
        this.contactoCollection = contactoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jsp.Empresa[ empId=" + empId + " ]";
    }
    
}
