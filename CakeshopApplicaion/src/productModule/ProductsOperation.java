package productModule;
import customerModule.Customer;
import customerModule.CustomerOperation;
import menuModule.AdminMenu;
import menuModule.HomePage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import customerModule.CustomerOperation;
public class ProductsOperation extends Thread {
	public static ArrayList<Products> productList = new ArrayList<Products>();
//	public static ArrayList<Products> product= new ArrayList<>();
	ArrayList<Double> priceList = new ArrayList<Double>(); 
    Scanner scanner = new Scanner(System.in);
    CustomerOperation CustomerOperation=new CustomerOperation();
	static  AdminMenu admin = new AdminMenu();
	static HomePage login=new HomePage();
	File file=new File("Products.txt");
	
	//FILE READ 
	public void run() {
		try {
	    FileReader filereader=new FileReader(file);
		BufferedReader v=new BufferedReader(filereader);
		String str=" ";
		if(productList.size()==0)
		{
			v.readLine();
	        while((str=v.readLine())!=null)
		{
				String[]data=str.split(",");
				productList.add(new Products( data[0],Integer.parseInt(data[1]),Double.parseDouble(data[2])));
		}
	}
		}
		catch(IOException e) {
			System.out.println(e);
	}
			
		
	}   
    public void addcakes(String itemName,int quantity,double price)
    {
    	productList.add(new Products(itemName,quantity,price));
    	System.out.println("Cake added");
    	addFile();
    }
//    public void run()
//   {
//    	System.out.println("Itemname \t Quantity \t Price");
//    	for(Products p:productList) 
//    	{
//    		System.out.println(p.getItemName()+"\t "+p.getQuantity()+" \t"+p.getPrice());
//    	
//    	}
//
//    }
    
    public void viewproducts()
    {
    	
    	System.out.println("Itemname \t Quantity \t Price");
    	for(Products p:productList) 
    	{
    		System.out.println(p.getItemName()+"  \t   "+p.getQuantity()+"  \t   "+p.getPrice());
    	
    	}
    }
    
    
   
     public void removeproducts(int index) {
    	 
    {
    	for(int i=0;i<productList.size();i++)
    	{
    	if((index)==(i+1))
    	{
    	productList.remove(index);
    	addFile();
    	}
    	
    	}
    	
    
     }
     }
     
  
	public double price(String itemName) {
		double price = 0;
		//for(int i=0;i<priceList.size();i++)
		for(Products pl:productList)
			
    	{
			if(pl.getItemName().equals(itemName)) {
				price+=pl.getPrice();
			}
    	}
		return price;
	}
	//FILE WRITE
	
	public void addFile() {

		try {
			
			FileWriter fileWriter=new FileWriter(file,false);
			fileWriter.write("The Product List");
			fileWriter.write("\n");
			for(int i=0;i<productList.size();i++) {
				fileWriter.write(productList.get(i)+"\n");
			}
			fileWriter.flush();
			fileWriter.close();
			
		}
		catch(Exception e) {
			System.out.print("e");
		}
		
	}
 }
    
   
  
    