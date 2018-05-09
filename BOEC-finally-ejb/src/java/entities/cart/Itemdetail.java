/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.cart;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HieuLe
 */
@Entity
@Table(name = "itemdetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itemdetail.findAll", query = "SELECT i FROM Itemdetail i")
    , @NamedQuery(name = "Itemdetail.findById", query = "SELECT i FROM Itemdetail i WHERE i.id = :id")
    , @NamedQuery(name = "Itemdetail.findByQuantity", query = "SELECT i FROM Itemdetail i WHERE i.quantity = :quantity")
    , @NamedQuery(name = "Itemdetail.findByPrice", query = "SELECT i FROM Itemdetail i WHERE i.price = :price")})
public class Itemdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private float price;
    @JoinColumn(name = "ItemID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Item itemID;
    @JoinColumn(name = "CartID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cart cartID;

    public Itemdetail() {
    }

    public Itemdetail(String id) {
        this.id = id;
    }

    public Itemdetail(String id, int quantity, float price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Item getItemID() {
        return itemID;
    }

    public void setItemID(Item itemID) {
        this.itemID = itemID;
    }

    public Cart getCartID() {
        return cartID;
    }

    public void setCartID(Cart cartID) {
        this.cartID = cartID;
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
        if (!(object instanceof Itemdetail)) {
            return false;
        }
        Itemdetail other = (Itemdetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Itemdetail[ id=" + id + " ]";
    }
    
}
