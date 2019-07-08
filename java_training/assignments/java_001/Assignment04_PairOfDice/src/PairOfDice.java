import java.util.Scanner;

public class PairOfDice {
	
	static int dieFace1;
	static int dieFace2;
	final static int max = 6;
	static Scanner sc;
	static Scanner pa;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("Press any key to throw a pair of dice and press Enter (or Q and Enter to quit)");
		
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
		    dieFace1 = (int)(Math.random() * max) +1;
		    dieFace2 = (int)(Math.random() * max) +1;
		    System.out.println("You have rolled the following : ");
		    System.out.println("First Die " + dieFace1);
		    System.out.println("Second Die " + dieFace2);
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
			dieFace1 = (int)(Math.random() * max) +1;
		    dieFace2 = (int)(Math.random() * max) +1;
		    
		    System.out.println("You have rolled the following : ");
		    System.out.println("First Die " + dieFace1);
		    System.out.println("Second Die " + dieFace2);
		}
		else
		{
		    System.exit(0);
		}
	}
	while(p=='y'||p=='Y');
		
	}


	}


