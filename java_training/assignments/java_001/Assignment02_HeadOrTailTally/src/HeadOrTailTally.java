

public class HeadOrTailTally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//Initialization of tally Array
		int[] tally = new int[2];
		tally[0]=0;
		tally[1]=0;
		
		//Iterating the randomNumGenerator for 1000 times 
		for (int i =0; i<1000;i++)
		{
			
			int randomNumGen = (Math.random() <= 0.5) ? 1 : 2;
			
			//Assigning the value to array index 0 and 1 	
				if(randomNumGen==1)
				{
					tally[0]++;
				}
				if(randomNumGen==2)
				{
					tally[1]++;
				}
		}

		
		
		System.out.println("1000 Coin Flips");
		System.out.println("Count of Head :" +" " + tally[0]);
		System.out.println("Count of Tail :" +" " + tally[1]);


		
	}

}
