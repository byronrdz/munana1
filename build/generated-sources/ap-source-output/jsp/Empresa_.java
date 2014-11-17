package jsp;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jsp.Contacto;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-16T23:54:47")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> empTelefono;
    public static volatile SingularAttribute<Empresa, String> empTipo;
    public static volatile SingularAttribute<Empresa, String> empNombre;
    public static volatile SingularAttribute<Empresa, String> empDireccion;
    public static volatile SingularAttribute<Empresa, BigDecimal> empLat;
    public static volatile CollectionAttribute<Empresa, Contacto> contactoCollection;
    public static volatile SingularAttribute<Empresa, String> empNota;
    public static volatile SingularAttribute<Empresa, BigDecimal> empLon;
    public static volatile SingularAttribute<Empresa, Integer> empId;
    public static volatile SingularAttribute<Empresa, String> empWeb;
    public static volatile SingularAttribute<Empresa, String> empCiudad;
    public static volatile SingularAttribute<Empresa, Short> empVigente;
    public static volatile SingularAttribute<Empresa, Integer> empCodpostal;

}