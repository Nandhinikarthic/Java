package paymentModule;

	 
public class PaymentProcess {
	private String itemName;
	private String mobileNumber;
	private int quantity;
	private double price;
    private String cardNumber;
    private String cvvNumber;
    private String upiPayment;
    private String address;
    private String status;
    private String name;
	private String emailId;
	private String city ;
	private String pincode;
	private String state;
	
	
public PaymentProcess(String itemName,
			String mobileNumber,int quantity,
	 double price,String cardNumber,String cvvNumber,String UpiPayment,String address,String status,
    String name,String emailId,String city,String state,String pincode)
	
	
	{
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	    this.cardNumber=cardNumber;
	    this.itemName = itemName;
		this.quantity = quantity;
		this.price =price ;
	    this.cvvNumber=cvvNumber;
	    this.upiPayment=upiPayment;
	    this.address=address;
	    this.status=status;
	    this.city=city;
	    this.pincode=pincode;
	    this.state=state;
	}
	


public String getUpiPayment() {
	return upiPayment;
}



public void setUpiPayment(String upiPayment) {
	this.upiPayment = upiPayment;
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


public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


public String getCardNumber() {
	return cardNumber;
}


public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}


public String getCvvNumber() {
	return cvvNumber;
}


public void setCvvNumber(String cvvNumber) {
	this.cvvNumber = cvvNumber;
}

public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



public String getPincode() {
	return pincode;
}



public void setPincode(String pincode) {
	this.pincode = pincode;
}



public String getState() {
	return state;
}



public void setState(String state) {
	this.state = state;
}



public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}



}