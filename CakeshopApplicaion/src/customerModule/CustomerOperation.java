package customerModule;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import menuModule.AdminMenu;
import menuModule.HomePage;
import ordermodule.AddToCart;
import ordermodule.AddToCartProcess;
import productModule.Products;
import productModule.ProductsOperation;

public class CustomerOperation {
	 public static  ArrayList<Customer> customerList=new ArrayList<>();
	 AdminMenu Ad=new AdminMenu();
	static ProductsOperation productsOperation=new ProductsOperation();
	static CustomerOperation customerOperation=new CustomerOperation();
	File file=new File("Customer.txt");
	
	public CustomerOperation  () {
		try {
	    FileReader filereader=new FileReader(file);
		BufferedReader v=new BufferedReader(filereader);
		String str=" ";
		if(customerList.size()==0)
		{
			v.readLine();
	        while((str=v.readLine())!=null)
		{
				String[]data=str.split(",");
				customerList.add(new Customer( data[0],data[1],Long.parseLong(data[2]),data[3]));
		}
	        
	    }
	}
	catch(IOException e) {
			System.out.println(e);
	}
		
	} 
	
	public void registrator (String name, String emailId, long mobileNumber, String password)
	
	{
	customerList.add(new Customer(name,emailId,mobileNumber,password));
	fileWrite();
	}
	
	//USER LOGIN
	public boolean Login(String emailId,String password ) {
		
		for(int i=0;i<customerList.size();i++) {
			//AdminMenu admin= new AdminMenu();
			 if(customerList.get(i).getEmailId().equals(emailId)&&(customerList.get(i).getPassword().equals(password)))
			 {
				 
				 System.out.println("Logged in");
				 productsOperation.start();
				 userMenu();
				 
				 
				
				// productsOperation.addCart(String itemName,double quantity);
				 				 return true;
			}
		
			}
		return false;
	}
	//USER OPERATIONS
	public void userMenu()
	{
		System.out.println("***User Menu***\n 1.View Cakes \n 2.Add To Cart\n 3.View Cart\n 4.LogOut ");
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		switch(input)

	{
		case 1:
		{
			 productsOperation.viewproducts();
			 userMenu();
			 break;
		}
		case 2:
		{
//			System.out.println("Enter Cake name:");
//			String itemName=scanner.next();
//		         
//			System.out.println("Enter Quantity");
//			int quantity=scanner.nextInt();
//			//ProductsOperation po=new ProductsOperation();
//			//double price=po.price(itemName);
//			AddToCartProcess acs=new AddToCartProcess();
//			Add
			AddToCartProcess acp=new AddToCartProcess();
			acp.addToCart();
//			acs.addCart(itemName,quantity,price);
			userMenu();
			break;
		}
		case 3:
		{   
			
			AddToCartProcess addtoCart=new AddToCartProcess();
			addtoCart.viewCartDetails();
			//userMenu();
			break;
		}
		case 4:
		{
			HomePage homePage=new HomePage();
			homePage.display();
			break;
		}
		default :
		{
			System.out.println("Please Enter the Valid Input Between 1 to 4");
			break;
		}
		}
	}
	//ADMIN LOGIN
	public boolean Admin1(String  adminEmailId,String password) {
		if(adminEmailId.equals("nandhini@gmail.com")&&(password.equals("Nandy@123")))
		{
//			try
//			{
//				 productsOperation.start();
				 productsOperation.run();
//			}
//			catch(InterruptedException exp)
//			{
//				System.out.println("Products not available");
//			}
			System.out.println("----Admin Logged in successfully----");
			Ad.menu();
			return true;
		}
			System.out.println("Unsucessfull Login");	
		return false;	
		
			
	}
		
	
	public boolean checkUserExits(String emailId) {
		for(Customer details:customerList) {
			if(details.getEmailId().contains(emailId)) {
				return true;
			}
		}
		return false;
		
		}
	
//public void display() {
	//for(Customer c: customer_List ) {
		//System.out.println(c.getEmailId());}
	//}

//public void adduser(String name, String emailId, String mobileNumber, String password) {
	//customer_List.add(new Customer(name,emailId,mobileNumber,password));
	//System.out.println("User added succesfully");
//}

public void viewuser() {
	
	for(Customer buyer: customerList) {
		System.out.println("Registeration");
		System.out.println("name:" +buyer.getName()+"\t"+"emailId:" +buyer.getEmailId()+"\t"+"mobileNumber:"+buyer.getMobileNumber()+"\t"+"password:" +buyer.getPassword());
		
		
	} 
}
public void removeUser(String emailId) 
{
	for(int i=0;i<customerList.size();i++) {
		if(customerList.get(i).getEmailId().equals(emailId))
				{
			customerList.remove(i);
		
		}
		
	}
}

public void fileWrite() {

	try {
		
		FileWriter fileWriter=new FileWriter(file,false);
		fileWriter.write("The User List:");
		fileWriter.write("\n");
		for(int i=0;i< customerList.size();i++) {
			fileWriter.write( customerList.get(i)+"\n");
		}
		fileWriter.flush();
		fileWriter.close();
		
	}
	catch(Exception e) {
		System.out.print("e");
	}
	
}
}



