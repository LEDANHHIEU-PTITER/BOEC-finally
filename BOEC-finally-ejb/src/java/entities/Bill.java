/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HieuLe
 */
@Entity
@Table(name = "bill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bill.findAll", query = "SELECT b FROM Bill b")
    , @NamedQuery(name = "Bill.findById", query = "SELECT b FROM Bill b WHERE b.id = :id")
    , @NamedQuery(name = "Bill.findByAmount", query = "SELECT b FROM Bill b WHERE b.amount = :amount")
    , @NamedQuery(name = "Bill.findByDate", query = "SELECT b FROM Bill b WHERE b.date = :date")
    , @NamedQuery(name = "Bill.findByPayed", query = "SELECT b FROM Bill b WHERE b.payed = :payed")})
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount")
    private float amount;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Payed")
    private int payed;
    @JoinColumn(name = "SellerEmployeePersonID", referencedColumnName = "PersonID")
    @ManyToOne(optional = false)
    private Selleremployee sellerEmployeePersonID;
    @JoinColumn(name = "OrderID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Order1 orderID;

    public Bill() {
    }

    public Bill(String id) {
        this.id = id;
    }

    public Bill(String id, float amount, int payed) {
        this.id = id;
        this.amount = amount;
        this.payed = payed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPayed() {
        return payed;
    }

    public void setPayed(int payed) {
        this.payed = payed;
    }

    public Selleremployee getSellerEmployeePersonID() {
        return sellerEmployeePersonID;
    }

    public void setSellerEmployeePersonID(Selleremployee sellerEmployeePersonID) {
        this.sellerEmployeePersonID = sellerEmployeePersonID;
    }

    public Order1 getOrderID() {
        return orderID;
    }

    public void setOrderID(Order1 orderID) {
        this.orderID = orderID;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bill[ id=" + id + " ]";
    }
    
}
