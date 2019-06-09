package com.customerService.CustomerInfo.model;
import org.hibernate.annotations.NaturalId;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "customer")
public class Customer {
	

	    @Id
	    @Column
	    private long customerID;

	    @Column
	    private String fisrtname;
	    
	    @Column
	    private String lastname;
	   

	    public Customer() {

	    }
		public String getFisrtname() {
			return fisrtname;
		}


		public long getCustomerID() {
			return customerID;
		}
		public void setCustomerID(long customerID) {
			this.customerID = customerID;
		}
		public void setFisrtname(String fisrtname) {
			this.fisrtname = fisrtname;
		}


		public String getLastname() {
			return lastname;
		}


		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		
		public Customer(long customerID, String fisrtname, String lastname) {
			super();
			this.customerID = customerID;
			this.fisrtname = fisrtname;
			this.lastname = lastname;
		}
		@Override
		public String toString() {
			return "Customer [customerID=" + customerID + ", fisrtname=" + fisrtname + ", lastname=" + lastname + "]";
		}


		
	   
}
