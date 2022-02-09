package menuModule;
import java.util.Scanner;

import customerModule.CustomerOperation;
import customerModule.ValidateCustomer;
//import paymentModule.Payment;
import productModule.ProductsOperation;
 

public class HomePage {
   Scanner scanner = new Scanner(System.in);
   static CustomerOperation customerOperation=new CustomerOperation();
   AdminMenu admin = new AdminMenu();
   ProductsOperation productOperation=new ProductsOperation();
   ValidateCustomer validateCustomer= new ValidateCustomer();
	
   int choice;
   

	   
   public void display() {
	   Scanner scanner=new Scanner(System.in);
	     System.out.println("****Welcome to Cakeshop****");
	     productOperation.run();
	     productOperation.viewproducts();
		 System.out.println("enter your choice:");
		 System.out.println("1.Registration");
		 System.out.println("2.Login");
		 System.out.println("3.Admin");
		 // choice=scanner.nextInt();
		 try
		 {
			 choice=Integer.parseInt(scanner.nextLine());
		 }
		 catch(Exception e)
		 {
			 System.out.println("Input should not contain space and character");
			 display();
			    
		 }
		 
		 switch(choice)
		 {
		 case 1:
			 String name=name();
			 String emailId=emailId();
			 String password=password();
			 long mobileNumber=mobileNumber();
			 customerOperation.registrator(name,emailId,mobileNumber,password);
		     System.out.println("Register Successfully");
		     break;
		 case 2:
			   System.out.println("Enter the emailId");
			   String emailid=scanner.next();
			   System.out.println("Enter the password");
			   String passcode=scanner.next();
			   System.out.print(customerOperation.Login(emailid, passcode));
			 break;
			 
		 case 3:
			 System.out.println("Enter the emailId:");
			   String adminEmailId=scanner.next();
			   System.out.println("Enter the password:");
			   String pass=scanner.next();
			   customerOperation.Admin1(adminEmailId, pass);
			 break;
		 case 4:
			 System.out.println("Exit");
			 break;
		
   }
   display();
}
public String name() {
	boolean isValidName=false;
	String name=null;
	do {
		System.out.print("Enter your name:");
		name=scanner.nextLine();
		isValidName=validateCustomer.validateuserName(name);
	}
	while(isValidName==false);
	return name;
		}
	
public String emailId() {
	boolean isValidemailId=false;
	String emailId=null;
	do {
		System.out.print("Enter your MailId:");
		emailId=scanner.nextLine();
		isValidemailId=validateCustomer.validateemailId(emailId);
	}
	while(isValidemailId==false);
	return emailId;
		}
	
public long mobileNumber() {
	boolean isValidmobileNumber=false;
	long mobileNumber;
	do {
		
       System.out.print("Enter your Mobilenumber:");
	   mobileNumber=scanner.nextLong();
	   isValidmobileNumber=validateCustomer.validatemobileNumber(Long.toString(mobileNumber));
	}
	while(isValidmobileNumber==false);
	return mobileNumber;
		}
public String password() {
	boolean isValidPassword=false;
	String password=null;
	do {
		System.out.println("Enter your password:");
		password=scanner.nextLine();
		isValidPassword=validateCustomer.validatepassword(password);
		}
	while(isValidPassword==false);
	return password;
}
	


 



public void displayMainmenu() {
	// TODO Auto-generated method stub
	
}
}



