package entities;

import entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T17:02:27")
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile SingularAttribute<Status, String> name;
    public static volatile ListAttribute<Status, Order1> order1List;
    public static volatile SingularAttribute<Status, String> id;

}