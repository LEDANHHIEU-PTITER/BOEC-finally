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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item.updateQuantity", query = "UPDATE Item b SET b.quantity = :quantity WHERE b.id = :id ")
    ,@NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i")
    , @NamedQuery(name = "Item.findById", query = "SELECT i FROM Item i WHERE i.id = :id")
    , @NamedQuery(name = "Item.findByName", query = "SELECT i FROM Item i WHERE i.name = :name")
    , @NamedQuery(name = "Item.findByPrice", query = "SELECT i FROM Item i WHERE i.price = :price")
    , @NamedQuery(name = "Item.findByCategoryID", query = "SELECT i FROM Item i WHERE i.categoryID = :categoryID")
    , @NamedQuery(name = "Item.findByQuantity", query = "SELECT i FROM Item i WHERE i.quantity = :quantity")
    , @NamedQuery(name = "Item.findByImageSrc", query = "SELECT i FROM Item i WHERE i.imageSrc = :imageSrc")})
public class Item implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private float price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    @Size(max = 255)
    @Column(name = "ImageSrc")
    private String imageSrc;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Smartphone smartphone;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Book book;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Techbook techbook;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Literaturebook literaturebook;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Maleclothes maleclothes;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Laptop laptop;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Tablet tablet;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Electronic electronic;
    @JoinColumn(name = "CategoryID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Category categoryID;

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Techbook getTechbook() {
        return techbook;
    }

    public void setTechbook(Techbook techbook) {
        this.techbook = techbook;
    }

    public Literaturebook getLiteraturebook() {
        return literaturebook;
    }

    public void setLiteraturebook(Literaturebook literaturebook) {
        this.literaturebook = literaturebook;
    }

    public Maleclothes getMaleclothes() {
        return maleclothes;
    }

    public void setMaleclothes(Maleclothes maleclothes) {
        this.maleclothes = maleclothes;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public Electronic getElectronic() {
        return electronic;
    }

    public void setElectronic(Electronic electronic) {
        this.electronic = electronic;
    }

    public Femaleclothes getFemaleclothes() {
        return femaleclothes;
    }

    public void setFemaleclothes(Femaleclothes femaleclothes) {
        this.femaleclothes = femaleclothes;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public List<Itemdetail> getItemcartList() {
        return itemcartList;
    }

    public void setItemcartList(List<Itemdetail> itemcartList) {
        this.itemcartList = itemcartList;
    }

    public List<Itemdetail> getItemdetailList() {
        return itemdetailList;
    }

    public void setItemdetailList(List<Itemdetail> itemdetailList) {
        this.itemdetailList = itemdetailList;
    }
    @JoinColumn(name = "WarehouseEmployeePersonID", referencedColumnName = "PersonID")
    @ManyToOne(optional = false)
    private Warehouseemployee warehouseEmployeePersonID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Femaleclothes femaleclothes;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "item")
    private Clothes clothes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemID")
    private List<Itemdetail> itemcartList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemID")
    private List<Itemdetail> itemdetailList;

    public Item() {
    }

    public Item(String id) {
        this.id = id;
    }

    public Item(String id, float price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public Category getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Category categoryID) {
        this.categoryID = categoryID;
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
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Item[ id=" + id + " ]";
    }

    public Warehouseemployee getWarehouseEmployeePersonID() {
        return warehouseEmployeePersonID;
    }

    public void setWarehouseEmployeePersonID(Warehouseemployee warehouseEmployeePersonID) {
        this.warehouseEmployeePersonID = warehouseEmployeePersonID;
    }

}
