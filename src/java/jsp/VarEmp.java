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
@Table(name = "Var_Emp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VarEmp.findAll", query = "SELECT v FROM VarEmp v"),
    @NamedQuery(name = "VarEmp.findByVaEmId", query = "SELECT v FROM VarEmp v WHERE v.vaEmId = :vaEmId"),
    @NamedQuery(name = "VarEmp.findByVarId", query = "SELECT v FROM VarEmp v WHERE v.varId = :varId"),
    @NamedQuery(name = "VarEmp.findByEmpId", query = "SELECT v FROM VarEmp v WHERE v.empId = :empId"),
    @NamedQuery(name = "VarEmp.findByVaEmCategoria", query = "SELECT v FROM VarEmp v WHERE v.vaEmCategoria = :vaEmCategoria"),
    @NamedQuery(name = "VarEmp.findByVaEmNota", query = "SELECT v FROM VarEmp v WHERE v.vaEmNota = :vaEmNota")})
public class VarEmp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "va_em_id")
    private Integer vaEmId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "var_id")
    private int varId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emp_id")
    private int empId;
    @Size(max = 2)
    @Column(name = "va_em_categoria")
    private String vaEmCategoria;
    @Size(max = 200)
    @Column(name = "va_em_nota")
    private String vaEmNota;

    public VarEmp() {
    }

    public VarEmp(Integer vaEmId) {
        this.vaEmId = vaEmId;
    }

    public VarEmp(Integer vaEmId, int varId, int empId) {
        this.vaEmId = vaEmId;
        this.varId = varId;
        this.empId = empId;
    }

    public Integer getVaEmId() {
        return vaEmId;
    }

    public void setVaEmId(Integer vaEmId) {
        this.vaEmId = vaEmId;
    }

    public int getVarId() {
        return varId;
    }

    public void setVarId(int varId) {
        this.varId = varId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getVaEmCategoria() {
        return vaEmCategoria;
    }

    public void setVaEmCategoria(String vaEmCategoria) {
        this.vaEmCategoria = vaEmCategoria;
    }

    public String getVaEmNota() {
        return vaEmNota;
    }

    public void setVaEmNota(String vaEmNota) {
        this.vaEmNota = vaEmNota;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vaEmId != null ? vaEmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VarEmp)) {
            return false;
        }
        VarEmp other = (VarEmp) object;
        if ((this.vaEmId == null && other.vaEmId != null) || (this.vaEmId != null && !this.vaEmId.equals(other.vaEmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jsp.VarEmp[ vaEmId=" + vaEmId + " ]";
    }
    
}
