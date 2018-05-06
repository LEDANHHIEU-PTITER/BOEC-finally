package entities;

import entities.Author;
import entities.Item;
import entities.Publisher;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T19:40:19")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, String> itemID;
    public static volatile SingularAttribute<Book, Publisher> publisherID;
    public static volatile SingularAttribute<Book, Item> item;
    public static volatile SingularAttribute<Book, Author> authorPersonID;
    public static volatile SingularAttribute<Book, Date> year;
    public static volatile SingularAttribute<Book, Integer> numberPage;
    public static volatile SingularAttribute<Book, String> sizeBook;
    public static volatile SingularAttribute<Book, String> description;
    public static volatile SingularAttribute<Book, String> typeBook;
    public static volatile SingularAttribute<Book, String> codeBook;

}