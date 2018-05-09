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
@Table(name = "shipping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shipping.findAll", query = "SELECT s FROM Shipping s")
    , @NamedQuery(name = "Shipping.findById", query = "SELECT s FROM Shipping s WHERE s.id = :id")
    , @NamedQuery(name = "Shipping.findByName", query = "SELECT s FROM Shipping s WHERE s.name = :name")})
public class Shipping implements Serializable {

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
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "shipping")
    private Viettelshipping viettelshipping;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shippingID")
    private List<Order1> order1List;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "shipping")
    private Ghnshipping ghnshipping;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "shipping")
    private Ghtkshipping ghtkshipping;

    public Shipping() {
    }

    public Shipping(String id) {
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

    public Viettelshipping getViettelshipping() {
        return viettelshipping;
    }

    public void setViettelshipping(Viettelshipping viettelshipping) {
        this.viettelshipping = viettelshipping;
    }

    @XmlTransient
    public List<Order1> getOrder1List() {
        return order1List;
    }

    public void setOrder1List(List<Order1> order1List) {
        this.order1List = order1List;
    }

    public Ghnshipping getGhnshipping() {
        return ghnshipping;
    }

    public void setGhnshipping(Ghnshipping ghnshipping) {
        this.ghnshipping = ghnshipping;
    }

    public Ghtkshipping getGhtkshipping() {
        return ghtkshipping;
    }

    public void setGhtkshipping(Ghtkshipping ghtkshipping) {
        this.ghtkshipping = ghtkshipping;
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
        if (!(object instanceof Shipping)) {
            return false;
        }
        Shipping other = (Shipping) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Shipping[ id=" + id + " ]";
    }
    
}
