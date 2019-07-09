import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MatrixChoice {
	
	static Scanner sc;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	
		
		 String[][] matrix = {
		         { "   Snake eyes" , "          Australian Yo ", " Little Joe from Kolomo" , "   No Field Five" , "    Easy Six" , "         Six one you’re done" },
		         { "   Ace caught a deuce" , "   Ballerina" , "           The Fever" , "          Jimmie Hicks" , "            Benny Blue" , "         Easy eight"  },
		         { "   Easy four" , "            OJ" , "                 Brooklyn Forest" , "     Big Red" , "        Eighter from Decatur" , "  Nina from Pasedena" },
		         { "   Little Phoebe" , "  Easy six" , "        Skinny McKinney" , "           Square pair" , "          Railroad nine" , "          Big one on the end" },
		         { "   Sixie from Dixie" , "  Skinny Dugan" , "           Easy eight" , "            Jesse James" , "          Puppy paws" , "          Yo" },
		         { "   The Devil" , "          Easy eight" , "            Lou Brown" , "          Tennessee" , "        Six five no jive" , "   Midnight" }
		      };
		 
		 //Array containing the title for each column
		 String[] prompt = {"","Die1","Die2","Die3","Die4","Die5","Die6"}; 
		 
		 
		  PrintStream fileOut = new PrintStream(new FileOutputStream("./out.txt"));
		
	
		
		 
		 //Setting the title for each Row
		matrix[0][0]="Die1" +"\t " + matrix[0][0];
		matrix[1][0]="Die2" +"\t " + matrix[1][0];
		matrix[2][0]="Die3" +"\t " + matrix[2][0];
		matrix[3][0]="Die4" +"\t " + matrix[3][0];
		matrix[4][0]="Die5" +"\t " + matrix[4][0];
		matrix[5][0]="Die6" +"\t " + matrix[5][0];

	
	
	
	
	
	System.out.println("Press c for printing to Console, f for  file or b for both ");
	
	//Reading user input
	 sc = new Scanner(System.in); 
     char c = sc.next().charAt(0);
 		

	if(c == 'c'|| c =='C')
	{
		
		System.out.println("\n"+"\t"+"Dice Combinations Label Matrix" +"\n");
		 
		 for(int k=0;k<prompt.length;k++)
		 {
			 System.out.printf(prompt[k]+"      \t      ");
			 
		 }
		 System.out.println("\n");
		 
		 
		 for (int i = 0; i < matrix.length; i++) 
			{
		        for (int j = 0; j < matrix[i].length; j++) {
		        	
		        	
		        	System.out.printf(matrix[i][j] + "\t" );
		        	
		        	}
		        System.out.println("\n");
		       
		        }
			
		
	}
	
	
      
	if(c == 'f'|| c =='F')
	{
	
	fileOut.println("\n"+"\t"+"Dice Combinations Label Matrix" +"\n");
	 
	
	 for(int k=0;k<prompt.length;k++)
	 {
		 fileOut.printf(prompt[k]+"      \t      ");
		 
	 }
	 fileOut.println("\n");
        
        for (int i = 0; i < matrix.length; i++) 
    	{
            for (int j = 0; j < matrix[i].length; j++) {
            	
            	
            	fileOut.printf(matrix[i][j] + "\t" );
            	
            	}
            fileOut.println("\n");
           
            }
       
       
        fileOut.close();
	}
	
	
	
	
	if(c == 'b'|| c =='B')
	{
		
		System.out.println("\n"+"\t"+"Dice Combinations Label Matrix" +"\n");
		 
		 for(int k=0;k<prompt.length;k++)
		 {
			 System.out.printf(prompt[k]+"      \t      ");
			 
		 }
		 System.out.println("\n");
		 
		 
		 for (int i = 0; i < matrix.length; i++) 
			{
		        for (int j = 0; j < matrix[i].length; j++) {
		        	
		        	
		        	System.out.printf(matrix[i][j] + "\t" );
		        	
		        	}
		        System.out.println("\n");
		       
		        }
		 
		 
		 
		 
		 fileOut.println("\n"+"\t"+"Dice Combinations Label Matrix" +"\n");
		 
			
		 for(int k=0;k<prompt.length;k++)
		 {
			 fileOut.printf(prompt[k]+"      \t      ");
			 
		 }
		 fileOut.println("\n");
	        
	        for (int i = 0; i < matrix.length; i++) 
	    	{
	            for (int j = 0; j < matrix[i].length; j++) {
	            	
	            	
	            	fileOut.printf(matrix[i][j] + "\t" );
	            	
	            	}
	            fileOut.println("\n");
	           
	            }
	     
	       
	        fileOut.close();
		
		
		
		
		
	}

	}

}
