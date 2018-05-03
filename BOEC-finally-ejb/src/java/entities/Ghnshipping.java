/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
@Table(name = "ghnshipping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ghnshipping.findAll", query = "SELECT g FROM Ghnshipping g")
    , @NamedQuery(name = "Ghnshipping.findByShippingID", query = "SELECT g FROM Ghnshipping g WHERE g.shippingID = :shippingID")})
public class Ghnshipping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ShippingID")
    private String shippingID;
    @JoinColumn(name = "ShippingID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Shipping shipping;

    public Ghnshipping() {
    }

    public Ghnshipping(String shippingID) {
        this.shippingID = shippingID;
    }

    public String getShippingID() {
        return shippingID;
    }

    public void setShippingID(String shippingID) {
        this.shippingID = shippingID;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shippingID != null ? shippingID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ghnshipping)) {
            return false;
        }
        Ghnshipping other = (Ghnshipping) object;
        if ((this.shippingID == null && other.shippingID != null) || (this.shippingID != null && !this.shippingID.equals(other.shippingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ghnshipping[ shippingID=" + shippingID + " ]";
    }
    
}
