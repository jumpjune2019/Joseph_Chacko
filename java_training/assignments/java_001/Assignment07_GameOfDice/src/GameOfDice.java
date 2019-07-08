import java.util.Scanner;

public class GameOfDice {
	
	static int computerRoll1=0;
	static int userRoll1=0;
	static int computerRoll2=0;
	static int userRoll2=0;
	final static int max = 6;
	static Scanner sc;
	static Scanner pa;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array with labels
		 String[][] matrix = {  { "" , "" , " ", "" , "" , "" , "" },
		         { "" ,"Snake eyes" , "Australian Yo ", " Little Joe from Kolomo" , "No Field Five" , "Easy Six" , "Six one you’re done" },
		         {"" , "Ace caught a deuce" , "Ballerina" , "The Fever" , "Jimmie Hicks" , "Benny Blue" , "Easy eight"  },
		         {"" , "Easy four" , "OJ" , "Brooklyn Forest" , "Big Red" , "Eighter from Decatur" , "Nina from Pasedena" },
		         {"" , "Little Phoebe" , "Easy six" , " Skinny McKinney" , " Square pair" , "Railroad nine" , "Big one on the end" },
		         {"" , "Sixie from Dixie" , "Skinny Dugan" , "Easy eight" , "Jesse James" , "Puppy paws" , "Yo" },
		         {"" , "The Devil" , "Easy eight" , "Lou Brown" , "Tennessee" , "Six five no jive" , " Midnight" }
		      };
		 
		 
		System.out.println("Welcome to the dice throw challenge!");
		System.out.println("Do you feel lucky? “Punk”… Do ya?"); 
		System.out.println("Press any key and ENTER to throw your dice or press (Q or q) to chicken your\r\n" + 
				"butt off…");
		
		
		//User input
		 sc = new Scanner(System.in); 
	     char c = sc.next().charAt(0);
	 		

		if(c == 'q'|| c =='Q')
		{
			//Terminating the prg if user wants to quit
			System.out.println("See ya later alligator!");
		    System.exit(0);
		}
		else
		{
			System.out.println("Rolling the Dice");
		    computerRoll1 = (int)(Math.random() * max) +1;
		    computerRoll2 = (int)(Math.random() * max) +1;
		    userRoll1 = (int)(Math.random() * max) +1;
		    userRoll2 = (int)(Math.random() * max) +1;
		}
		
		//Possible Results
		if((computerRoll1+computerRoll2)>( userRoll1+ userRoll2))
		{
			System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
			System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
			System.out.println("I Win!!!");
			System.out.println("Wanna try again? Press any key and ENTER to throw your dice or press (Q or q) to quit");
		}
		
		if((computerRoll1+computerRoll2)<( userRoll1+ userRoll2))
		{
			System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
			System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
			System.out.println("You Win!!!");
			System.out.println("Did you cheat?? Gimme another try, c’mon Press any key and ENTER to throw your dice or press (Q or q) to quit");
		}
		
		if((computerRoll1+computerRoll2)==( userRoll1+ userRoll2))
		{
			if(userRoll1== userRoll2)
			{
			System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
			System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
			System.out.println("Damn! You win on a Double! What Luck!");
			System.out.println("Did you cheat?? Gimme another try, c’mon Press any key and ENTER to throw your dice or press (Q or q) to quit");
			}
			
			if(computerRoll1== computerRoll2)
			{
			System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
			System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
			System.out.println("Damn! I win on a Double! Ah! I pity you fool!");
			System.out.println("Wanna try again? Press any key and ENTER to throw your dice or press (Q or q) to quit");
			}
			else {
				
				System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
				System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
				System.out.println("Stalemate! You’re tough, let’s try for a tie-breaker Press any key and ENTER to throw your dice or press (Q or q) to quit");
			}
		
		}
		
		
		char p;
		
		//Iterating loop till the user decides to quit
		do {

			
			//User input
			 pa = new Scanner(System.in); 
		    p = pa.next().charAt(0);
		    
		    
		    if(p == 'q'|| p =='Q')
			{
				//Terminating the prg if user wants to quit
		    	System.out.println("Thanks for being a sport! laters!");
			    System.exit(0);
			}
			else
			{
				System.out.println("Rolling the Dice");
			    computerRoll1 = (int)(Math.random() * max) +1;
			    computerRoll2 = (int)(Math.random() * max) +1;
			    userRoll1 = (int)(Math.random() * max) +1;
			    userRoll2 = (int)(Math.random() * max) +1;
			}
			
			if((computerRoll1+computerRoll2)>( userRoll1+ userRoll2))
			{
				System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
				System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
				System.out.println("I Win!!!");
				System.out.println("Wanna try again? Press any key and ENTER to throw your dice or press (Q or q) to quit");
			}
			
			if((computerRoll1+computerRoll2)<( userRoll1+ userRoll2))
			{
				System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
				System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
				System.out.println("You Win!!!");
				System.out.println("Did you cheat?? Gimme another try, c’mon Press any key and ENTER to throw your dice or press (Q or q) to quit");
			}
			
			if((computerRoll1+computerRoll2)==( userRoll1+ userRoll2))
			{
				if(userRoll1== userRoll2)
				{
				System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
				System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
				System.out.println("Damn! You win on a Double! What Luck!");
				System.out.println("Did you cheat?? Gimme another try, c’mon Press any key and ENTER to throw your dice or press (Q or q) to quit");
				}
				
				if(computerRoll1== computerRoll2)
				{
				System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
				System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
				System.out.println("Damn! I win on a Double! Ah! I pity you fool!");
				System.out.println("Wanna try again? Press any key and ENTER to throw your dice or press (Q or q) to quit");
				}
				else {
					
					System.out.println("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
					System.out.println("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
					System.out.println("Stalemate! You’re tough, let’s try for a tie-breaker Press any key and ENTER to throw your dice or press (Q or q) to quit");
				}
			
			}
			
		     
		
		}
		while(p!='q'||p!='Q');
		
		
	}

}
