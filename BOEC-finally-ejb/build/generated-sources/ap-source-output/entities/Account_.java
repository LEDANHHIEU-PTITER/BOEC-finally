package entities;

import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T17:02:26")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> passWord;
    public static volatile ListAttribute<Account, Person> personList;
    public static volatile SingularAttribute<Account, String> id;
    public static volatile SingularAttribute<Account, String> userName;

}