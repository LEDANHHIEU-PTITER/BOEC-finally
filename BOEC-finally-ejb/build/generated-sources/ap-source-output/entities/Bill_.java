package entities;

import entities.Order1;
import entities.Selleremployee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-09T10:59:27")
@StaticMetamodel(Bill.class)
public class Bill_ { 

    public static volatile SingularAttribute<Bill, Date> date;
    public static volatile SingularAttribute<Bill, Float> amount;
    public static volatile SingularAttribute<Bill, Selleremployee> sellerEmployeePersonID;
    public static volatile SingularAttribute<Bill, Order1> orderID;
    public static volatile SingularAttribute<Bill, String> id;
    public static volatile SingularAttribute<Bill, Integer> payed;

}