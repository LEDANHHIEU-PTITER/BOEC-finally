package entities;

import entities.Customer;
import entities.Itemdetail;
import entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-07T15:28:52")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile SingularAttribute<Cart, Customer> customerPersonID;
    public static volatile SingularAttribute<Cart, Float> amount;
    public static volatile ListAttribute<Cart, Itemdetail> itemdetailList;
    public static volatile ListAttribute<Cart, Order1> order1List;
    public static volatile SingularAttribute<Cart, String> id;

}