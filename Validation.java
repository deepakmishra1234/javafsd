package phase1.project;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Validation
	
	{

	    public static void main(String[] args) 
	    
	    {
	        
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("lingala.vanky@xms.com");
	        emailID.add("dheeru.bheera@blj.com");
	        emailID.add("lovely.sharma@fgf.com");
	        emailID.add("hiroshima.bmb@blast.com");
	        emailID.add("ashish.handa@gmail.com");
	        emailID.add("aneesha.rawat@rsht.com");
	        emailID.add("suresh.kera@mhbt.com");
	        
	         
	        String searchEmail = null;
	      
	        System.out.println("Enter the email to search");
	         
	        try (Scanner input = new Scanner(System.in))
	         
	         {
				System.out.println("Enter email Id : ");
	            searchEmail = input.nextLine(); 
			 }
	        
	        
	         if(emailID.contains(searchEmail))
	            	 
	           {
	            	 
	            System.out.println("email ID " + searchEmail + " found");
	            
               }
	         
	         else
	    	  
	           {
	    	  
	             System.out.println( "email ID " + searchEmail + " not found");
	          
	           }   
	             
	        }

	}


