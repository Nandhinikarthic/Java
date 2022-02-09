package ordermodule;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import customerModule.Customer;
import productModule.Products;

public class AddToCart {
	private String itemName;
	private int quantity;
	private double total;
	
		
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
		return total;
	}


	public void setPrice(double price) {
		this.total = price;
	}


	public AddToCart(String itemName,  int quantity, double tot) {
		
		this.itemName = itemName;
		this.quantity= quantity;
		this.total = tot;
		
	}
	
	



	   	
	    	
	    	



}



