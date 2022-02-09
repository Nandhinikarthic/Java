package paymentModule;

import java.util.ArrayList;

import java.util.Scanner;

import customerModule.CustomerOperation;
import customerModule.ValidateCustomer;
//import menuModule.AdminMenu;
import menuModule.HomePage;
import ordermodule.AddToCart;
import ordermodule.AddToCartProcess;
import productModule.ProductsOperation;

public class Payment extends AddToCartProcess {
	static HomePage homePage=new HomePage();
	//AdminMenu admin = new AdminMenu();
	static Scanner scanner=new Scanner(System.in);
	static CustomerOperation customerOperation=new CustomerOperation();
	static ProductsOperation poductsOperation=new ProductsOperation();
	static ArrayList<Payment> card_list= new ArrayList<>();
	static ArrayList<PaymentProcess>orderDetails=new ArrayList<>();
	ValidateCustomer  validate=new ValidateCustomer ();
	//private static final Object YES = null;
	//private static final Object NO = null;
	int number;
	
	
	
	public void payment() {
		System.out.println("1.Card Payment\n 2.UPI Payment\n");
	    int choice = scanner.nextInt();

	switch(choice) {
	case 1:
		cardPayment();
		break;
		
	case 2:
		upiPayment();
		break;
		
	
		
	  }
	}

	public void cardPayment() {
		System.out.print("Enter the 16 digit Card Number => ");
		String cardNumber = scanner.next();
		while(!(cardNumber.matches("[0-9]{16}"))) {
			System.out.print("Enter the Valid card number => ");
			cardNumber = scanner.next();
		     }
		
		System.out.print("Enter the 3 digit CVV Number => ");
		String ccvNumber = scanner.next();
		while(!(ccvNumber.matches("[0-9]{3}"))) {
			System.out.print("Enter the Valid CVV number => ");
			ccvNumber = scanner.next();
			}
		confirmPayment() ;
		
		
	}
	public void upiPayment() {
		System.out.print("Enter the UPI PIN: ");
		int upiPin = scanner.nextInt();
		String pin = Integer.toString(upiPin);
		while(!(pin.matches("[0-9]{4}"))) {
			System.out.print("INVALID...\nEnter the Valid PIN => ");
			upiPayment();
			
		}
		confirmPayment() ;
		
	}
	public void confirmPayment() {
		System.out.print("Enter to 1 to confirm payment and 2 for cancel payment:");
		int number=scanner.nextInt();
		
		//String caseFormate=(paymentConfirm.toUpperCase());
		if(number==1){
	    	System.out.print("Payment successful");
	    	
	    	address();
	    }
		else if(number==2) {
	    	System.out.print("Payment unsuccessful");
	    	
	    	homePage.display();
	    }
	    else  {
	    	System.out.print("Wrong Choice");
		       
		       homePage.display();
	    }
		       
		}
	public void address() {
		
			System.out.print("\nFill your details for delivering the product\nEnter Your Name : ");
			String customerName = scanner.next();
			scanner.next();
			while(!(customerName.matches("^[a-zA-Z\\s]{4,20}$"))) {
			System.out.print("WRONG INPUT ALERT : Enter a valid Name. Only alphabets are allowed, Name should be within range of 4-20 letters. Not more than 2 letters can be repeated in sequence\n\nEnter your Name again : ");
			customerName = scanner.next();
			}	
			
			System.out.print("Enter Mobile Number:");
			String phoneNumber = scanner.next();
		    while(!(phoneNumber.matches("[6-9]{1}[0-9]{9}")))  
		    {
		    	System.out.println("Phone number is invalid.It should contain only 10 digits of number and start between 6-9");
		    	System.out.print("Enter the correct phone number => ");
		    	phoneNumber = scanner.next();
		    	
	    	}
		    
		    System.out.print("Enter the Pincode");
		    String pincode = scanner.next();
		    
		    
		    System.out.print("Enter the State:");
		    String state = scanner.next();
		    while(!(state.matches("^[a-zA-Z\\s]{3,50}$"))) {
		    	System.out.println("INCORRECT...Enter the proper State Name => ");
		    	state = scanner.next();
		    }
		    
		    System.out.println("Enter the city:");
		    String city = scanner.next();
		    while(!(city.matches("^[a-zA-Z\\s]{3,50}$")))
		    {
		    	System.out.println("INCORRECT...Enter the proper City:");
		    	city = scanner.next();
		    }
		    
		    System.out.println("Enter the House No, Road Name, Area, Colony => ");
		    String addressDetails = scanner.next();
		    while(!(addressDetails.matches("^[#.0-9a-zA-Z\\s,-]+$"))) {
		    	System.out.println("Enter the PROPER ADDRESS => ");
		    	addressDetails = scanner.next();
		    }
		    orderDetails();
		    }
		    


	
	
	
	public static void orderDetails() {
		//System.out.println("hhhhhh");
	
	for(AddToCart order:AddToCartProcess.cart)
	{
	System.out.println("-----------------------------------------------------");
	System.out.println(" ProductName\t No.of Items \t Total Amount ");
	System.out.println("-----------------------------------------------------");
    System.out.println(order.getItemName()+"\t"+order.getQuantity()+"\t"+order.getPrice()+"\t");
	System.out.println("-----------------------------------------------------");
	System.out.println("----Order Will Be Deliered Soon----");
	customerOperation.userMenu();
	}


	 	
   }

	
}

  




