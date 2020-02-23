package org.jmresler.spring.aw.entities;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author John
 */
@Entity
@Table(name = "vStoreWithAddresses", catalog = "AdventureWorks2017", schema = "Sales")

@NamedQueries({
    @NamedQuery(name = "VStoreWithAddresses.findAll", query = "SELECT v FROM VStoreWithAddresses v"),
    @NamedQuery(name = "VStoreWithAddresses.findByBusinessEntityID", query = "SELECT v FROM VStoreWithAddresses v WHERE v.businessEntityID = :businessEntityID"),
    @NamedQuery(name = "VStoreWithAddresses.findByAddressLine1", query = "SELECT v FROM VStoreWithAddresses v WHERE v.addressLine1 = :addressLine1"),
    @NamedQuery(name = "VStoreWithAddresses.findByAddressLine2", query = "SELECT v FROM VStoreWithAddresses v WHERE v.addressLine2 = :addressLine2"),
    @NamedQuery(name = "VStoreWithAddresses.findByCity", query = "SELECT v FROM VStoreWithAddresses v WHERE v.city = :city"),
    @NamedQuery(name = "VStoreWithAddresses.findByPostalCode", query = "SELECT v FROM VStoreWithAddresses v WHERE v.postalCode = :postalCode")})
public class VStoreWithAddresses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BusinessEntityID")
    private int businessEntityID;
    @Basic(optional = false)
    @Column(name = "AddressLine1")
    private String addressLine1;
    @Column(name = "AddressLine2")
    private String addressLine2;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "PostalCode")
    private String postalCode;

    public VStoreWithAddresses() {
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

	@Override
	public int hashCode() {
		return Objects.hash(addressLine1, addressLine2, businessEntityID, city, postalCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VStoreWithAddresses other = (VStoreWithAddresses) obj;
		return Objects.equals(addressLine1, other.addressLine1) && Objects.equals(addressLine2, other.addressLine2)
				&& businessEntityID == other.businessEntityID && Objects.equals(city, other.city)
				&& Objects.equals(postalCode, other.postalCode);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VStoreWithAddresses [businessEntityID=")
				.append(businessEntityID)
				.append(", addressLine1=")
				.append(addressLine1)
				.append(", addressLine2=")
				.append(addressLine2)
				.append(", city=")
				.append(city)
				.append(", postalCode=")
				.append(postalCode)
				.append("]");
		return builder.toString();
	}

    
}
