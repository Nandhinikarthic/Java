package productModule;

public class Products {
	private String itemName;
	private int quantity;
	private double price;
	
	public Products(String itemName, int quantity,double price ) {
		
		this.itemName = itemName;
		this.quantity = quantity;
		this.price =price ;
	}

	
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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



	@Override
	public String toString() {
		return   itemName + "," + quantity + ","  + price;
	}
	
	
	
	
}
