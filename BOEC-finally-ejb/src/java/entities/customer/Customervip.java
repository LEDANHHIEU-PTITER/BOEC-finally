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
@Table(name = "customervip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customervip.findAll", query = "SELECT c FROM Customervip c")
    , @NamedQuery(name = "Customervip.findByNumberCard", query = "SELECT c FROM Customervip c WHERE c.numberCard = :numberCard")
    , @NamedQuery(name = "Customervip.findByPoint", query = "SELECT c FROM Customervip c WHERE c.point = :point")
    , @NamedQuery(name = "Customervip.findByPersonID", query = "SELECT c FROM Customervip c WHERE c.personID = :personID")})
public class Customervip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "NumberCard")
    private String numberCard;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Point")
    private float point;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PersonID")
    private String personID;
    @JoinColumn(name = "PersonID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Person person;

    public Customervip() {
    }

    public Customervip(String personID) {
        this.personID = personID;
    }

    public Customervip(String personID, float point) {
        this.personID = personID;
        this.point = point;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personID != null ? personID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customervip)) {
            return false;
        }
        Customervip other = (Customervip) object;
        if ((this.personID == null && other.personID != null) || (this.personID != null && !this.personID.equals(other.personID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Customervip[ personID=" + personID + " ]";
    }
    
}
