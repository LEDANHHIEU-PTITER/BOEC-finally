/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.order;

import entities.cart.Cart;
import entities.employee.Countingemloyee;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HieuLe
 */
@Entity
@Table(name = "order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o")
    , @NamedQuery(name = "Order1.findById", query = "SELECT o FROM Order1 o WHERE o.id = :id")
    , @NamedQuery(name = "Order1.findByDateOrder", query = "SELECT o FROM Order1 o WHERE o.dateOrder = :dateOrder")
    , @NamedQuery(name = "Order1.findByDatePayMent", query = "SELECT o FROM Order1 o WHERE o.datePayMent = :datePayMent")
    , @NamedQuery(name = "Order1.findByDateDelivery", query = "SELECT o FROM Order1 o WHERE o.dateDelivery = :dateDelivery")
    , @NamedQuery(name = "Order1.findByStatusOrder", query = "SELECT o FROM Order1 o WHERE o.statusOrder = :statusOrder")
    , @NamedQuery(name = "Order1.findByAddressOrder", query = "SELECT o FROM Order1 o WHERE o.addressOrder = :addressOrder")})
public class Order1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID")
    private String id;
    @Column(name = "DateOrder")
    @Temporal(TemporalType.DATE)
    private Date dateOrder;
    @Column(name = "DatePayMent")
    @Temporal(TemporalType.DATE)
    private Date datePayMent;
    @Column(name = "DateDelivery")
    @Temporal(TemporalType.DATE)
    private Date dateDelivery;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StatusOrder")
    private int statusOrder;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "AddressOrder")
    private String addressOrder;
    @JoinColumn(name = "CartID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cart cartID;
    @JoinColumn(name = "StatusID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Status statusID;
    @JoinColumn(name = "ShippingID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Shipping shippingID;
    @JoinColumn(name = "PaymentID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Payment paymentID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderID")
    private List<Bill> billList;
    @JoinColumn(name = "CountingEmloyeePersonID", referencedColumnName = "PersonID")
    @ManyToOne(optional = false)
    private Countingemloyee countingEmloyeePersonID;

    public Order1() {
    }

    public Order1(String id) {
        this.id = id;
    }

    public Order1(String id, int statusOrder, String addressOrder) {
        this.id = id;
        this.statusOrder = statusOrder;
        this.addressOrder = addressOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Date getDatePayMent() {
        return datePayMent;
    }

    public void setDatePayMent(Date datePayMent) {
        this.datePayMent = datePayMent;
    }

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public int getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(int statusOrder) {
        this.statusOrder = statusOrder;
    }

    public String getAddressOrder() {
        return addressOrder;
    }

    public void setAddressOrder(String addressOrder) {
        this.addressOrder = addressOrder;
    }

    public Cart getCartID() {
        return cartID;
    }

    public void setCartID(Cart cartID) {
        this.cartID = cartID;
    }

    public Status getStatusID() {
        return statusID;
    }

    public void setStatusID(Status statusID) {
        this.statusID = statusID;
    }

    public Shipping getShippingID() {
        return shippingID;
    }

    public void setShippingID(Shipping shippingID) {
        this.shippingID = shippingID;
    }

    public Payment getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Payment paymentID) {
        this.paymentID = paymentID;
    }

    @XmlTransient
    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Order1[ id=" + id + " ]";
    }

    public Countingemloyee getCountingEmloyeePersonID() {
        return countingEmloyeePersonID;
    }

    public void setCountingEmloyeePersonID(Countingemloyee countingEmloyeePersonID) {
        this.countingEmloyeePersonID = countingEmloyeePersonID;
    }

}
