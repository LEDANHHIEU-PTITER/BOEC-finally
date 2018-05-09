package entities;

import entities.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-09T10:59:26")
@StaticMetamodel(Tablet.class)
public class Tablet_ { 

    public static volatile SingularAttribute<Tablet, String> itemID;
    public static volatile SingularAttribute<Tablet, Item> item;
    public static volatile SingularAttribute<Tablet, String> cameraAfter;
    public static volatile SingularAttribute<Tablet, Float> battery;

}