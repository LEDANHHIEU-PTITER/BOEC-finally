package entities;

import entities.Ghnshipping;
import entities.Ghtkshipping;
import entities.Order1;
import entities.Viettelshipping;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-07T15:28:51")
@StaticMetamodel(Shipping.class)
public class Shipping_ { 

    public static volatile SingularAttribute<Shipping, Ghnshipping> ghnshipping;
    public static volatile SingularAttribute<Shipping, String> name;
    public static volatile SingularAttribute<Shipping, Viettelshipping> viettelshipping;
    public static volatile SingularAttribute<Shipping, Ghtkshipping> ghtkshipping;
    public static volatile ListAttribute<Shipping, Order1> order1List;
    public static volatile SingularAttribute<Shipping, String> id;

}