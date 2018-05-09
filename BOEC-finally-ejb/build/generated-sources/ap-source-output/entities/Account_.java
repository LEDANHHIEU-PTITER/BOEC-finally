package entities;

import entities.Person;
import entities.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-09T10:59:27")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> passWord;
    public static volatile ListAttribute<Account, Person> personList;
    public static volatile SingularAttribute<Account, Role> roleId;
    public static volatile SingularAttribute<Account, String> id;
    public static volatile SingularAttribute<Account, String> userName;

}