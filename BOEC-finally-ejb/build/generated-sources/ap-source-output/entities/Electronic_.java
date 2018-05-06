package entities;

import entities.Company;
import entities.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-06T19:40:19")
@StaticMetamodel(Electronic.class)
public class Electronic_ { 

    public static volatile SingularAttribute<Electronic, String> itemID;
    public static volatile SingularAttribute<Electronic, Item> item;
    public static volatile SingularAttribute<Electronic, Float> warrantyPeriod;
    public static volatile SingularAttribute<Electronic, Company> companyID;
    public static volatile SingularAttribute<Electronic, Float> screenSize;
    public static volatile SingularAttribute<Electronic, String> srceenResolation;
    public static volatile SingularAttribute<Electronic, String> cpu;
    public static volatile SingularAttribute<Electronic, String> operaSystem;
    public static volatile SingularAttribute<Electronic, String> gpu;
    public static volatile SingularAttribute<Electronic, String> room;
    public static volatile SingularAttribute<Electronic, String> ram;
    public static volatile SingularAttribute<Electronic, String> cameraFont;

}