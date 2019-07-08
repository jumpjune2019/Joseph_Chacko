import java.util.Scanner;

public class SimpleDie {
	
	static int dieFace;
	final static int max = 6;
	static Scanner sc;
	static Scanner pa;



	public static void main(String[] args)throws java.io.IOException {
		// TODO Auto-generated method stub

		System.out.println("Press any key to throw a die and press Enter (or Q and Enter to quit)");
		
		//Reading user input
		 sc = new Scanner(System.in); 
	     char c = sc.next().charAt(0);
	 		

		if(c == 'q'|| c =='Q')
		{
			//Terminating the prg if user wants to quit
		    System.exit(0);
		}
		else
		{
		    dieFace = (int)(Math.random() * max) +1;
		    System.out.println("You have rolled a " + dieFace);
		}

	char p;
	
	//Iterating the loop till user wants to quit
	do {

		System.out.println("Play Again? (Y or y) and Enter, any other key and Enter to Quit");
		
		//User input
		 pa = new Scanner(System.in); 
	     p = pa.next().charAt(0);
	     
		//pa = (char) System.in.read();
		if(p == 'Y'|| p =='y')
		{
		    dieFace = (int)(Math.random() * max) +1;

		    System.out.println("You have rolled a " + dieFace);
		}
		else
		{
		    System.exit(0);
		}
	}
	while(p=='y'||p=='Y');
		
	}

}




	
		

	


