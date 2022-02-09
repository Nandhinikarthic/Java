package menuModule;
import java.util.Scanner;

import customerModule.CustomerOperation;

import java.util.ArrayList;

import productModule.Products;
import productModule.ProductsOperation;

public class AdminMenu {
	static ArrayList<Products>product_List=new ArrayList<Products>();
	static ProductsOperation productsbo =new ProductsOperation();
	static CustomerOperation cust=new CustomerOperation();
    
	
	
	public void menu() {
		System.out.println("*****MENU*****");
		System.out.println("1.Add Items");
		System.out.println("2.view product");
		//System.out.println("3.Add User");
		System.out.println("3.Remove user");
		System.out.println("4.view Users");
		System.out.println("5.LogOut");
		Scanner s= new Scanner(System.in);
		int choice=s.nextInt();
		switch (choice)
	{
			case 1:
			{
				System.out.println("Enter cake name:");
				String itemName=s.next();
				System.out.println("Enter Quantity:");
				int quantity=s.nextInt();
				System.out.println("Enter Price:");
				double price=s.nextDouble();
				productsbo.addcakes(itemName, quantity, price);
				menu();
				break;
				}
			case 2:
			   {
				productsbo.viewproducts();
				break;
				}
			

	
			
			case 3:
			{
				System.out.println("Enter EmailId");
				String emailId=s.next();
				cust.removeUser(emailId);
				menu();
				break;
			}
			case 4:
			{
				cust.viewuser();
				menu();
				break;
			}
			case 5:
			{
				HomePage homePage=new HomePage();
				homePage.display();
			}
			
	}
	
	}
}

