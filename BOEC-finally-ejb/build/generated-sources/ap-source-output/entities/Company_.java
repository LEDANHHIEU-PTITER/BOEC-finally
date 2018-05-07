package entities;

import entities.Clothes;
import entities.Electronic;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-07T15:28:52")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile SingularAttribute<Company, String> address;
    public static volatile SingularAttribute<Company, String> name;
    public static volatile SingularAttribute<Company, String> description;
    public static volatile ListAttribute<Company, Electronic> electronicList;
    public static volatile SingularAttribute<Company, String> id;
    public static volatile ListAttribute<Company, Clothes> clothesList;

}