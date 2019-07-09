import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;



public class phone {
	
	static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException, EntryEmptyException{
		// TODO Auto-generated method stub
		
		int i, j;
     	//Scanner input;

		 Object[][] phonebook = new Object[6][3];
		 phonebook[0][0]="Name";
		 phonebook[0][1]="phone#";
		 phonebook[0][2]="city";
		 
		System.out.println("Enter details in the order : Name : Phone number : City (Press Enter after each entry)");
		 
		sc = new Scanner(System.in); 
		 
		 for ( i = 1; i < phonebook.length; i++) 
			{
			 try {
		        for (j = 0; j < phonebook[i].length; j++) {
		 
		   
		        	 String obj = sc.nextLine();
		        	 phonebook[i][j] = obj;
		        	 
		        	 CheckEmptyEntry(obj);
		        	
		        }
		  System.out.println("Entered Row");
		  System.out.print(phonebook[i][0]+"\t");
		  System.out.print(phonebook[i][1]+"\t");
		  System.out.println(phonebook[i][2]);
		     
			 }catch(EntryEmptyException ex) {
				 System.out.println(ex);
				 i--;
				 continue;
			 }
			 		 
			 }
			
		 
		 
		
		 
		  PrintStream fileOut = new PrintStream(new FileOutputStream("./phone.txt"));
		  
		  System.out.println("Press c for printing to Console, f for  file or b for both ");

	 sc = new Scanner(System.in); 
    char c = sc.next().charAt(0);
		

	if(c == 'c'|| c =='C')
	{
		
		 
		 
		 for ( i = 0; i < phonebook.length; i++) 
			{
		        for ( j = 0; j < phonebook[i].length; j++) {
		        	
		        	
		        	System.out.printf(phonebook[i][j] + "\t" );
		        	
		        	}
		        System.out.println("\n");
		       
		        }
			
		
	}
	
	
     
	if(c == 'f'|| c =='F')
	{
	
       
		 for ( i = 0; i < phonebook.length; i++) 
			{
		        for ( j = 0; j < phonebook[i].length; j++) {
           	
           	
           	fileOut.printf(phonebook[i][j] + "\t" );
           	
           	}
           fileOut.println("\n");
          
           }
      
      
       fileOut.close();
	}
	
	
	
	
	if(c == 'b'|| c =='B')
	{
		
		
		 
		 for ( i = 0; i < phonebook.length; i++) 
			{
		        for ( j = 0; j < phonebook[i].length; j++) {
		        	
		        	
		        	System.out.printf(phonebook[i][j] + "\t" );
		        	
		        	fileOut.printf(phonebook[i][j] + "\t" );
		        	
		        	}
		        System.out.println("\n");
		       
		        fileOut.println("\n");
		       
		        }
			
		 fileOut.close();
		
	
		
	}

	}
	
	public static void CheckEmptyEntry(String obj) throws EntryEmptyException{
		if( obj.equals(""))
		{
			throw new EntryEmptyException("Entry Empty");
		}
	}
	 

}
