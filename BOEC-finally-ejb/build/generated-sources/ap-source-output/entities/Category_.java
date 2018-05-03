package entities;

import entities.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-03T17:02:27")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> codeCategory;
    public static volatile SingularAttribute<Category, String> nameCategory;
    public static volatile ListAttribute<Category, Item> itemList;
    public static volatile SingularAttribute<Category, String> id;

}