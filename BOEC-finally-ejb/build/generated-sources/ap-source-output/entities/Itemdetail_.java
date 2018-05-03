package entities;

import entities.Cart;
import entities.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T17:02:27")
@StaticMetamodel(Itemdetail.class)
public class Itemdetail_ { 

    public static volatile SingularAttribute<Itemdetail, Item> itemID;
    public static volatile SingularAttribute<Itemdetail, Integer> quantity;
    public static volatile SingularAttribute<Itemdetail, Float> price;
    public static volatile SingularAttribute<Itemdetail, Cart> cartID;
    public static volatile SingularAttribute<Itemdetail, String> id;

}