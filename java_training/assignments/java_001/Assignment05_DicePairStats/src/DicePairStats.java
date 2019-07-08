
public class DicePairStats {
	
	static int dieFace1;
	static int dieFace2;
	final static int max = 6;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		//Initializing the array and setting value to zero
		int[] tally = new int[21];
		
			for( i=0; i<tally.length;i++)
			{
				tally[i]=0;
			}
		/*for(i=0;i<tally.length;i++)
		{
			System.out.println(tally[i]);
		}*/
		
		//Iterating dice throw 1000 times
		for(int j=0;j<1000;j++)
			
				{
						dieFace1 = (int)(Math.random() * max) +1;
					    dieFace2 = (int)(Math.random() * max) +1;
					    
					    //Tallying the combinations as counts into array indexes 
									  if(dieFace1==1 && dieFace2==1)
									  {
										tally[0]++;  
									  }
									  if(dieFace1==2 && dieFace2==2)
									  {
										tally[1]++;  
									  }
									  if(dieFace1==3 && dieFace2==3)
									  {
										tally[2]++;  
									  }
									  if(dieFace1==4 && dieFace2==4)
									  {
										tally[3]++;  
									  }
									  if(dieFace1==5 && dieFace2==5)
									  {
										tally[4]++;  
									  }
									  if(dieFace1==6 && dieFace2==6)
									  {
										tally[5]++;  
									  }
									  if((dieFace1==2 && dieFace2==1)||(dieFace1==1 && dieFace2==2))
									  {
										tally[6]++;  
									  }
									  if((dieFace1==3 && dieFace2==1)||(dieFace1==1 && dieFace2==3))
									  {
										tally[7]++;  
									  }
									  if((dieFace1==3 && dieFace2==2)||(dieFace1==2 && dieFace2==3))
									  {
										tally[8]++;  
									  }
									  if((dieFace1==4 && dieFace2==1)||(dieFace1==1 && dieFace2==4))
									  {
										tally[9]++;  
									  }
									  if((dieFace1==4 && dieFace2==2)||(dieFace1==2 && dieFace2==4))
									  {
										tally[10]++;  
									  }
									  if((dieFace1==4 && dieFace2==3)||(dieFace1==3 && dieFace2==4))
									  {
										tally[11]++;  
									  }
									  if((dieFace1==5 && dieFace2==1)||(dieFace1==1 && dieFace2==5))
									  {
										tally[12]++;  
									  }
									  if((dieFace1==5 && dieFace2==2)||(dieFace1==2 && dieFace2==5))
									  {
										tally[13]++;  
									  }
									  if((dieFace1==5 && dieFace2==3)||(dieFace1==3 && dieFace2==5))
									  {
										tally[14]++;  
									  }
									  if((dieFace1==5 && dieFace2==4)||(dieFace1==4 && dieFace2==5))
									  {
										tally[15]++;  
									  }
									  if((dieFace1==6 && dieFace2==1)||(dieFace1==1 && dieFace2==6))
									  {
										tally[16]++;  
									  }
									  if((dieFace1==6 && dieFace2==2)||(dieFace1==2 && dieFace2==6))
									  {
										tally[17]++;  
									  }
									  if((dieFace1==6 && dieFace2==3)||(dieFace1==3 && dieFace2==6))
									  {
										tally[18]++;  
									  }
									  if((dieFace1==6 && dieFace2==4)||(dieFace1==4 && dieFace2==6))
									  {
										tally[19]++;  
									  }
									  if((dieFace1==6 && dieFace2==5)||(dieFace1==5 && dieFace2==6))
									  {
										tally[20]++;  
									  }
						}
		
		
		System.out.println("1000 random 2 dice toss stats");
		System.out.println("Dice 2 and 1 : " +tally[6]);
		System.out.println("Dice 3 and 1 : " +tally[7]);
		System.out.println("Dice 3 and 2 : " +tally[8]);
		System.out.println("Dice 4 and 1 : " +tally[9]);
		System.out.println("Dice 4 and 2 : " +tally[10]);
		System.out.println("Dice 4 and 3 : " +tally[11]);
		System.out.println("Dice 5 and 1 : " +tally[12]);
		System.out.println("Dice 5 and 2 : " +tally[13]);
		System.out.println("Dice 5 and 3 : " +tally[14]);
		System.out.println("Dice 5 and 4 : " +tally[15]);
		System.out.println("Dice 6 and 1 : " +tally[16]);
		System.out.println("Dice 6 and 2 : " +tally[17]);
		System.out.println("Dice 6 and 3 : " +tally[18]);
		System.out.println("Dice 6 and 4 : " +tally[19]);
		System.out.println("Dice 6 and 5 : " +tally[20]);
		System.out.println("Dice 1 and 1 : " +tally[0]);
		System.out.println("Dice 2 and 2 : " +tally[1]);
		System.out.println("Dice 3 and 3 : " +tally[2]);
		System.out.println("Dice 4 and 4 : " +tally[3]);
		System.out.println("Dice 5 and 5 : " +tally[4]);
		System.out.println("Dice 6 and 6 : " +tally[5]);
		
				
		
		

	}

}
