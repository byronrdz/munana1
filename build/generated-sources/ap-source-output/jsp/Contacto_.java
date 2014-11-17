package jsp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jsp.Empresa;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-16T23:54:47")
@StaticMetamodel(Contacto.class)
public class Contacto_ { 

    public static volatile SingularAttribute<Contacto, String> conSkype;
    public static volatile SingularAttribute<Contacto, String> conCargo;
    public static volatile SingularAttribute<Contacto, Integer> conId;
    public static volatile SingularAttribute<Contacto, String> conNota;
    public static volatile SingularAttribute<Contacto, String> conTelefono;
    public static volatile SingularAttribute<Contacto, Empresa> empId;
    public static volatile SingularAttribute<Contacto, String> conNombre;
    public static volatile SingularAttribute<Contacto, String> conMovil;
    public static volatile SingularAttribute<Contacto, Short> conVigente;
    public static volatile SingularAttribute<Contacto, String> conEmail;

}