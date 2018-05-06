package entities;

import entities.Bill;
import entities.Cart;
import entities.Countingemloyee;
import entities.Payment;
import entities.Shipping;
import entities.Status;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T19:40:18")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Date> dateDelivery;
    public static volatile SingularAttribute<Order1, Date> datePayMent;
    public static volatile SingularAttribute<Order1, Countingemloyee> countingEmloyeePersonID;
    public static volatile SingularAttribute<Order1, Integer> statusOrder;
    public static volatile SingularAttribute<Order1, Shipping> shippingID;
    public static volatile SingularAttribute<Order1, String> addressOrder;
    public static volatile SingularAttribute<Order1, Status> statusID;
    public static volatile SingularAttribute<Order1, Payment> paymentID;
    public static volatile SingularAttribute<Order1, Cart> cartID;
    public static volatile ListAttribute<Order1, Bill> billList;
    public static volatile SingularAttribute<Order1, Date> dateOrder;
    public static volatile SingularAttribute<Order1, String> id;

}