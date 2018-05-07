package entities;

import entities.Item;
import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-07T15:28:52")
@StaticMetamodel(Warehouseemployee.class)
public class Warehouseemployee_ { 

    public static volatile SingularAttribute<Warehouseemployee, Person> person;
    public static volatile ListAttribute<Warehouseemployee, Item> itemList;
    public static volatile SingularAttribute<Warehouseemployee, String> personID;

}