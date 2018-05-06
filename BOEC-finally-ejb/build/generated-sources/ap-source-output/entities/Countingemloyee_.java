package entities;

import entities.Order1;
import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T19:40:19")
@StaticMetamodel(Countingemloyee.class)
public class Countingemloyee_ { 

    public static volatile SingularAttribute<Countingemloyee, String> possionCounting;
    public static volatile SingularAttribute<Countingemloyee, Person> person;
    public static volatile SingularAttribute<Countingemloyee, String> personID;
    public static volatile ListAttribute<Countingemloyee, Order1> order1List;

}