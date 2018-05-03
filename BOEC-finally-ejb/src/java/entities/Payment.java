/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HieuLe
 */
@Entity
@Table(name = "payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p")
    , @NamedQuery(name = "Payment.findById", query = "SELECT p FROM Payment p WHERE p.id = :id")
    , @NamedQuery(name = "Payment.findByName", query = "SELECT p FROM Payment p WHERE p.name = :name")})
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID")
    private String id;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "payment")
    private Directpayment directpayment;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "payment")
    private Mastercard mastercard;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "payment")
    private Creaditcard creaditcard;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentID")
    private List<Order1> order1List;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "payment")
    private Visacard visacard;

    public Payment() {
    }

    public Payment(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directpayment getDirectpayment() {
        return directpayment;
    }

    public void setDirectpayment(Directpayment directpayment) {
        this.directpayment = directpayment;
    }

    public Mastercard getMastercard() {
        return mastercard;
    }

    public void setMastercard(Mastercard mastercard) {
        this.mastercard = mastercard;
    }

    public Creaditcard getCreaditcard() {
        return creaditcard;
    }

    public void setCreaditcard(Creaditcard creaditcard) {
        this.creaditcard = creaditcard;
    }

    @XmlTransient
    public List<Order1> getOrder1List() {
        return order1List;
    }

    public void setOrder1List(List<Order1> order1List) {
        this.order1List = order1List;
    }

    public Visacard getVisacard() {
        return visacard;
    }

    public void setVisacard(Visacard visacard) {
        this.visacard = visacard;
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
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Payment[ id=" + id + " ]";
    }
    
}
