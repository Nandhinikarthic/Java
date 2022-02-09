
package customerModule;
 

import java.awt.List;
import java.util.ArrayList;

import productModule.Products;

public class Customer {
	private String name;
	private String emailId;
	private long mobileNumber;
	private String password ;
//	private ArrayList<Products> Products;
//	
//	private List Products1;
//	
		
	 public Customer(String name, String emailId, long mobileNumber, String password) {
		
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return  name + "," + emailId + "," + mobileNumber + ","
				+ password ;
	}


	
//public ArrayList<Products> getProduct(){
//	return Products;
//}
//
//	public void setProducts(ArrayList<Products> product) {
//		this.Products=product;
//		
//		
//	}
	
	
}
