package entities;

import entities.Company;
import entities.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T19:40:19")
@StaticMetamodel(Clothes.class)
public class Clothes_ { 

    public static volatile SingularAttribute<Clothes, String> itemID;
    public static volatile SingularAttribute<Clothes, Company> companyID;
    public static volatile SingularAttribute<Clothes, Item> item;
    public static volatile SingularAttribute<Clothes, String> size;
    public static volatile SingularAttribute<Clothes, String> color;
    public static volatile SingularAttribute<Clothes, String> material;
    public static volatile SingularAttribute<Clothes, String> name;
    public static volatile SingularAttribute<Clothes, String> description;
    public static volatile SingularAttribute<Clothes, String> styles;

}