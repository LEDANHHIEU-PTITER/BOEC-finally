package entities;

import entities.Book;
import entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-07T15:28:51")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, String> qualification;
    public static volatile SingularAttribute<Author, Person> person;
    public static volatile SingularAttribute<Author, String> personID;
    public static volatile ListAttribute<Author, Book> bookList;

}