package customerModule;


public class ValidateCustomer {
	public boolean validateName(String name)
	{
		if(name!=null) {   
			String regex="^(?!.*(.)\\1\\1)+[A-Z\\s][1][a-z]{4,15}";
		    while((name.matches(regex)))
		    {
			System.out.println("Invalid Name.Name should be contain Alphabets and no special character.");
			System.out.println("Enter your name again");
			return false;
			
			}
		    System.out.println("Invalid Name.Name should be contain Alphabets and no special character.");
			System.out.println("Enter your name again");
			}
		return true;
	}
	public static boolean validateuserName(String name) {
		String regexp="^(?!.*(.)\\1\\1)+[A-Z\\s]{1}[a-z]{4,15}+[ ]+[a-zA-Z]{1,15}";
		//String regexp="[(\\d)a-zA-Z-0-9]{4,29}";
		if(name.matches(regexp)) {
		return true;
		}

		System.out.println("--Invalid User Name..!--");
		System.out.println("Note: Name has been alphabet letters only");
		return false;

		}
	
	public boolean validateemailId(String emailId) {
		String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z]+(.+com)$";
	    while(!(emailId.matches(regex)))
	   {
	       System.out.println("your email is not valid");
	       System.out.println("Enter your email again.");
	       return false;
	    
	   }
	    return true;
	    
	   }
	public boolean validatepassword(String password) {
		String regex=("^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$"); 
                
        while(!(password.matches(regex)))
          {
            System.out.println("your password is not valid.password should contain a number,special character,upper and lower case letters.");
            System.out.println("Enter your password again.");
            return false;
          }
          return true;
      }
	public boolean validatemobileNumber(String mobileNumber) {
		
			{
		
		String regex="[6-9]{1}[0-9]{9}";
		   while(!(mobileNumber.matches(regex)))
		   {
		       System.out.println("your mobile number is not valid.it contains only 10 digits and starting Number from 6-9");
		    System.out.println("Enter your mobile number again.");
		    return false;
		   }
		   return true;
	}
		}
	public  boolean validateAddress(String address){
		String regexp=("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#&()–:;',/.]).{10,80}$");

		if(!address.matches(regexp)){
		System.out.println("Incorrect address.Address should be atleast 10 characters.");
		System.out.print("Enter your Address again:");
		//address=input.nextLine();
		validateAddress(address);
		}
		return true;
		}
	
	}

	            
     
	


