
public class HeadOrTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generating a random number of either 1 or 2
		int coinFlip = (Math.random() <= 0.5) ? 1 : 2;
		
		//Assigning 1 as Head and 2 as Tail
		if(coinFlip ==1) {
			System.out.println("Coin Flip Program");
			System.out.println("The Coin Flip is : Head");
		}
		else if(coinFlip ==2)
		{
			System.out.println("Coin Flip Program");
			System.out.println("The Coin Flip is : Tail");
		}
		else {
			System.out.println("invalid");
		}
		
	}
}
