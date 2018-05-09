/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.person;

import entities.customer.Author;
import entities.customer.Customer;
import entities.customer.Customervip;
import entities.employee.Countingemloyee;
import entities.employee.Employee;
import entities.employee.Maketingemployee;
import entities.employee.Managingemployee;
import entities.employee.Selleremployee;
import entities.employee.Warehouseemployee;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "person")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
    , @NamedQuery(name = "Person.findByAccountID", query = "SELECT p FROM Person p WHERE p.accountID = :accountID")
    , @NamedQuery(name = "Person.findById", query = "SELECT p FROM Person p WHERE p.id = :id")
    , @NamedQuery(name = "Person.findByName", query = "SELECT p FROM Person p WHERE p.name = :name")
    , @NamedQuery(name = "Person.findByIdentifier", query = "SELECT p FROM Person p WHERE p.identifier = :identifier")
    , @NamedQuery(name = "Person.findByBirthDay", query = "SELECT p FROM Person p WHERE p.birthDay = :birthDay")
    , @NamedQuery(name = "Person.findByGender", query = "SELECT p FROM Person p WHERE p.gender = :gender")
    , @NamedQuery(name = "Person.findByEmail", query = "SELECT p FROM Person p WHERE p.email = :email")
    , @NamedQuery(name = "Person.findByNumber", query = "SELECT p FROM Person p WHERE p.number = :number")
    , @NamedQuery(name = "Person.findByAddress", query = "SELECT p FROM Person p WHERE p.address = :address")})
public class Person implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Warehouseemployee warehouseemployee;

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
    @Size(max = 255)
    @Column(name = "Identifier")
    private String identifier;
    @Column(name = "BirthDay")
    @Temporal(TemporalType.DATE)
    private Date birthDay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gender")
    private int gender;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "Email")
    private String email;
    @Size(max = 255)
    @Column(name = "Number")
    private String number;
    @Size(max = 255)
    @Column(name = "Address")
    private String address;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Countingemloyee countingemloyee;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Employee employee;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Customervip customervip;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Managingemployee managingemployee;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Maketingemployee maketingemployee;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Author author;
    @JoinColumn(name = "AccountID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Account accountID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Selleremployee selleremployee;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    private Customer customer;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, int gender) {
        this.id = id;
        this.gender = gender;
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

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Countingemloyee getCountingemloyee() {
        return countingemloyee;
    }

    public void setCountingemloyee(Countingemloyee countingemloyee) {
        this.countingemloyee = countingemloyee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customervip getCustomervip() {
        return customervip;
    }

    public void setCustomervip(Customervip customervip) {
        this.customervip = customervip;
    }

    public Managingemployee getManagingemployee() {
        return managingemployee;
    }

    public void setManagingemployee(Managingemployee managingemployee) {
        this.managingemployee = managingemployee;
    }

    public Maketingemployee getMaketingemployee() {
        return maketingemployee;
    }

    public void setMaketingemployee(Maketingemployee maketingemployee) {
        this.maketingemployee = maketingemployee;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Account getAccountID() {
        return accountID;
    }

    public void setAccountID(Account accountID) {
        this.accountID = accountID;
    }

    public Selleremployee getSelleremployee() {
        return selleremployee;
    }

    public void setSelleremployee(Selleremployee selleremployee) {
        this.selleremployee = selleremployee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Person[ id=" + id + " ]";
    }

    public Warehouseemployee getWarehouseemployee() {
        return warehouseemployee;
    }

    public void setWarehouseemployee(Warehouseemployee warehouseemployee) {
        this.warehouseemployee = warehouseemployee;
    }

}
