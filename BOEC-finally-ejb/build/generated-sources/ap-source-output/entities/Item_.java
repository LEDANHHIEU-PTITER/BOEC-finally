package entities;

import entities.Book;
import entities.Category;
import entities.Clothes;
import entities.Electronic;
import entities.Femaleclothes;
import entities.Itemdetail;
import entities.Laptop;
import entities.Literaturebook;
import entities.Maleclothes;
import entities.Smartphone;
import entities.Tablet;
import entities.Techbook;
import entities.Warehouseemployee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T19:40:19")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Integer> quantity;
    public static volatile SingularAttribute<Item, Smartphone> smartphone;
    public static volatile ListAttribute<Item, Itemdetail> itemdetailList;
    public static volatile SingularAttribute<Item, Book> book;
    public static volatile SingularAttribute<Item, Femaleclothes> femaleclothes;
    public static volatile SingularAttribute<Item, Warehouseemployee> warehouseEmployeePersonID;
    public static volatile SingularAttribute<Item, String> imageSrc;
    public static volatile SingularAttribute<Item, Techbook> techbook;
    public static volatile SingularAttribute<Item, Literaturebook> literaturebook;
    public static volatile SingularAttribute<Item, Maleclothes> maleclothes;
    public static volatile ListAttribute<Item, Itemdetail> itemcartList;
    public static volatile SingularAttribute<Item, Laptop> laptop;
    public static volatile SingularAttribute<Item, Clothes> clothes;
    public static volatile SingularAttribute<Item, Tablet> tablet;
    public static volatile SingularAttribute<Item, Float> price;
    public static volatile SingularAttribute<Item, String> name;
    public static volatile SingularAttribute<Item, Electronic> electronic;
    public static volatile SingularAttribute<Item, String> id;
    public static volatile SingularAttribute<Item, Category> categoryID;

}