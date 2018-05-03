package entities;

import entities.Bill;
import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T17:02:27")
@StaticMetamodel(Selleremployee.class)
public class Selleremployee_ { 

    public static volatile SingularAttribute<Selleremployee, Person> person;
    public static volatile ListAttribute<Selleremployee, Bill> billList;
    public static volatile SingularAttribute<Selleremployee, String> personID;
    public static volatile SingularAttribute<Selleremployee, Integer> buySuccess;

}