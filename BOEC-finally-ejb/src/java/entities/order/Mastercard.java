/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.order;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HieuLe
 */
@Entity
@Table(name = "mastercard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mastercard.findAll", query = "SELECT m FROM Mastercard m")
    , @NamedQuery(name = "Mastercard.findByPaymentID", query = "SELECT m FROM Mastercard m WHERE m.paymentID = :paymentID")})
public class Mastercard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PaymentID")
    private String paymentID;
    @JoinColumn(name = "PaymentID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Payment payment;

    public Mastercard() {
    }

    public Mastercard(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentID != null ? paymentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mastercard)) {
            return false;
        }
        Mastercard other = (Mastercard) object;
        if ((this.paymentID == null && other.paymentID != null) || (this.paymentID != null && !this.paymentID.equals(other.paymentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Mastercard[ paymentID=" + paymentID + " ]";
    }
    
}
