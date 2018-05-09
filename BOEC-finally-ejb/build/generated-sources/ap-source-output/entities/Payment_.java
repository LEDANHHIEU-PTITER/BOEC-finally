package entities;

import entities.Creaditcard;
import entities.Directpayment;
import entities.Mastercard;
import entities.Order1;
import entities.Visacard;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-09T10:59:26")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Creaditcard> creaditcard;
    public static volatile SingularAttribute<Payment, Directpayment> directpayment;
    public static volatile SingularAttribute<Payment, String> name;
    public static volatile SingularAttribute<Payment, Mastercard> mastercard;
    public static volatile ListAttribute<Payment, Order1> order1List;
    public static volatile SingularAttribute<Payment, Visacard> visacard;
    public static volatile SingularAttribute<Payment, String> id;

}