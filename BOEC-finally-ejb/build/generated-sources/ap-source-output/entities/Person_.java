package entities;

import entities.Account;
import entities.Author;
import entities.Countingemloyee;
import entities.Customer;
import entities.Customervip;
import entities.Employee;
import entities.Maketingemployee;
import entities.Managingemployee;
import entities.Selleremployee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T17:02:27")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile SingularAttribute<Person, String> identifier;
    public static volatile SingularAttribute<Person, Date> birthDay;
    public static volatile SingularAttribute<Person, Managingemployee> managingemployee;
    public static volatile SingularAttribute<Person, String> address;
    public static volatile SingularAttribute<Person, Countingemloyee> countingemloyee;
    public static volatile SingularAttribute<Person, Maketingemployee> maketingemployee;
    public static volatile SingularAttribute<Person, Integer> gender;
    public static volatile SingularAttribute<Person, Author> author;
    public static volatile SingularAttribute<Person, Employee> employee;
    public static volatile SingularAttribute<Person, String> number;
    public static volatile SingularAttribute<Person, Account> accountID;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile SingularAttribute<Person, String> id;
    public static volatile SingularAttribute<Person, Selleremployee> selleremployee;
    public static volatile SingularAttribute<Person, String> email;
    public static volatile SingularAttribute<Person, Customervip> customervip;
    public static volatile SingularAttribute<Person, Customer> customer;

}