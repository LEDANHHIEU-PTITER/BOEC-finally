package entities;

import entities.Caugiaystore;
import entities.Employee;
import entities.Hotungmaustore;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-09T10:59:27")
@StaticMetamodel(Store.class)
public class Store_ { 

    public static volatile SingularAttribute<Store, Caugiaystore> caugiaystore;
    public static volatile SingularAttribute<Store, String> discription;
    public static volatile SingularAttribute<Store, String> address;
    public static volatile ListAttribute<Store, Employee> employeeList;
    public static volatile SingularAttribute<Store, Hotungmaustore> hotungmaustore;
    public static volatile SingularAttribute<Store, String> name;
    public static volatile SingularAttribute<Store, String> id;

}