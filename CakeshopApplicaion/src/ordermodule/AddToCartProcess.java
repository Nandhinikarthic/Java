package ordermodule;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import customerModule.CustomerOperation;
import exception.ExceptionHandling;
import menuModule.AdminMenu;
import paymentModule.Payment;
import paymentModule.PaymentProcess;
import productModule.Products;
import productModule.ProductsOperation;

public class AddToCartProcess  {
	public static ArrayList<AddToCart> cart= new ArrayList<>();
	static Scanner scanner=new Scanner(System.in);
	static ProductsOperation productsOperation=new ProductsOperation();
	CustomerOperation customerOperation=new CustomerOperation();
	static Payment payment=new Payment();
	int quantity=0;
	
	public void addToCart() {
		String itemName=ItemName();

		System.out.println("Enter Quantity:");
		quantity=scanner.nextInt();
		//double price=0.0;
		try
		{

			if(quantity<=0) {
				throw new ExceptionHandling("Quantity should be greater than ZERO");
			}
			//		productsOperation.addcakes(itemName, quantity, price);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(ExceptionHandling e)
		{
			System.out.println(e.getMessage());
		}

		//		double price1 = 0;
		//		String itemName1="";
		//		int quan=0;
		double tot = 0;
		for(Products p:ProductsOperation.productList)
		{
			if(p.getItemName().equals(itemName))
			{
			
				System.out.println("The total price to be paid ="+p.getPrice()*quantity);
				cart.add(new AddToCart(itemName,quantity,(p.getPrice()*quantity)));
				int quan=p.getQuantity()-quantity;
				p.setQuantity(quan);
				//System.out.println("The price is:"+p.getPrice());
			} 
			
		}
		//addCart(itemName,quantity,tot);
	}



	//	double rupee=productsOperation.price(itemName);
	//	System.out.println("ruppes: "+rupee);
	//	double price=rupee*quantity;
	//	System.out.println("ruppe23: "+price);
	public String ItemName() {
		boolean isValidateName=false;

		String itemName="";
		do {
			System.out.println("Enter the Cakename");
			itemName=scanner.next();
			isValidateName = CheckIItem(itemName);
		}while(isValidateName==false);
		return itemName;
	}
	public boolean CheckIItem(String itemName)
	{
		String[] arr= {"Blackforest","Whiteforest","Redvelvet","Blackcurrent","Butterscotch"};
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equalsIgnoreCase(itemName))
			{
				return true;
			}	
		}
		return false;
	}

	public void addCart(String itemName,int quantity,double price)
	{
		cart.add(new AddToCart(itemName,quantity,price));
		System.out.println("Successfully Product Added to Cart ");

		for(AddToCart c:cart)
		{
			System.out.println("Item Name \t  Quantity \t Total Amount");
			System.out.println(c.getItemName()+"\t"+c.getQuantity()+"\t"+c.getPrice());
		}


	}

	public void viewCartDetails()
	{
		for(AddToCart c:cart)
		{
			System.out.println("Item Name \t  Quantity \t Total Amount");
			System.out.println(c.getItemName()+"      "+c.getQuantity()+"      "+c.getPrice());
			System.out.println("Enter 1 for Buy 2 for Back");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
			{
				payment.payment();
				break;
			}
			case 2:
			{
				customerOperation.userMenu();
				break;
			}
			default :
			{
				System.out.println("Enter a Correct Option");
				viewCartDetails();
			}
			}
		}
	}


}

