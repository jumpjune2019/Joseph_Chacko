package headortail;

import java.util.Scanner;



public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc;
		System.out.println("Welcome to the game of Head or Tail where you will flip your life away!");
		System.out.println("Press the F key and flip your luck!");
		
		sc = new Scanner(System.in); 
		
		while(sc.hasNext("f")) {
			
		do
		{
			sc = new Scanner(System.in); 
			
			FuncFlip coinFlip = () -> (int)(Math.random() * 2) + 1;
			CoinString flipGame = (int c) -> { 
				if (c == 1) {
					
					return "head"; 
				} else {
					
				}
					return "tail";
				};
				
				System.out.println("The coin flip is: " + flipGame.flipGame(coinFlip.coinFlip()) + "!");
		
			System.out.println("Press the F key to try again, press Q or q to Quit");
			
		} while(sc.hasNext("f"));
		
		System.out.println("Thank you for playing");
		
		}
		
	}

}
