
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MatrixCustomHandlers {

	static Scanner sc;
	

	
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		
		
		 String[][] matrix = { { "" , "" , " ", "" , "" , "" , "" },
		         {"", "   Snake eyes" , "          Australian Yo ", " Little Joe from Kolomo" , "   No Field Five" , "    Easy Six" , "         Six one you’re done" },
		         { "","   Ace caught a deuce" , "   Ballerina" , "           The Fever" , "          Jimmie Hicks" , "            Benny Blue" , "         Easy eight"  },
		         { "","   Easy four" , "            OJ" , "                 Brooklyn Forest" , "     Big Red" , "        Eighter from Decatur" , "  Nina from Pasedena" },
		         { "","   Little Phoebe" , "  Easy six" , "        Skinny McKinney" , "           Square pair" , "          Railroad nine" , "          Big one on the end" },
		         { "","   Sixie from Dixie" , "  Skinny Dugan" , "           Easy eight" , "            Jesse James" , "          Puppy paws" , "          Yo" },
		         { "","   The Devil" , "          Easy eight" , "            Lou Brown" , "          Tennessee" , "        Six five no jive" , "   Midnight" }
		      };

		 
		  PrintStream fileOut = new PrintStream(new FileOutputStream("./out.txt"));
				
		 System.out.println("Enter die faces for 1st and 2nd dice (from 1 to 6)");
		 sc = new Scanner(System.in); 
         int d1 = sc.nextInt();
         
         sc = new Scanner(System.in); 
         int d2 = sc.nextInt();
	
         try {
     		CheckInvalidDieface(d1, d2);
     	}catch(InvalidDiefaceException ex)
     	{
     		System.out.println(ex);
     		System.exit(0);
     	}
	
	System.out.println("Press c for printing to Console, f for  file or b for both ");
	
	//Reading user input
	 sc = new Scanner(System.in); 
     char c = sc.next().charAt(0);
     
 	try {
		CheckKeyPress(c);
	}catch(KeyPressException ex)
	{
		System.out.println(ex);
	}
	
	
     
	if(c == 'c'|| c =='C')
	{
		
		System.out.println("\n"+"\t"+"Dice Combinations Label " +"\n");
          System.out.println(matrix[d1][d2]);
     
	}
	
	
      
	if(c == 'f'|| c =='F')
	{
		
         
         fileOut.println("\n"+"\t"+"Dice Combinations Label Matrix" +"\n");
         
         fileOut.println(matrix[d1][d2]);
		
         fileOut.close();
      
	}
	
	
	
	
	if(c == 'b'|| c =='B')
	{
		System.out.println("\n"+"\t"+"Dice Combinations Label " +"\n");
	
         
         System.out.println(matrix[d1][d2]);
         
         
         fileOut.println("\n"+"\t"+"Dice Combinations Label Matrix" +"\n");
         
         fileOut.println(matrix[d1][d2]);
		
         fileOut.close();
         		
		
	}
	


     
	}
	
	public static void CheckKeyPress(char c) throws KeyPressException{
		if((c!='c')||(c!='f')||(c!='b')||(c!='C')||(c!='F')||(c!='B'))
		{
			throw new KeyPressException();
		}
	}
	
	
	public static void CheckInvalidDieface(int d1, int d2) throws InvalidDiefaceException{
		
		if((d1<1)||(d1>6)||(d2<1)||(d2>6))
		{
			throw new InvalidDiefaceException();
		}
	}

}

