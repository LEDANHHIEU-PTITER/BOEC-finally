package entities;

import entities.Person;
import entities.Store;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-07T15:28:52")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Float> numberExperience;
    public static volatile SingularAttribute<Employee, Float> salaryBase;
    public static volatile SingularAttribute<Employee, Person> person;
    public static volatile SingularAttribute<Employee, Float> coefficient;
    public static volatile SingularAttribute<Employee, String> personID;
    public static volatile SingularAttribute<Employee, Store> storeID;

}