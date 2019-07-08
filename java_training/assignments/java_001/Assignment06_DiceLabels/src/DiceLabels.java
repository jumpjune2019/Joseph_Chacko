
public class DiceLabels {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			// Labeling the combinations for the die faces
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
		
		//Initializing the array and setting value to zero
		//int[][] matrix = new int[6][6];
		
		/*for ( i = 0; i < matrix.length; i++) 
		{
            for ( j = 0; j < matrix[i].length; j++) {
            	
            	matrix[i][j]=0;
            	}
            }*/
			 System.out.println("\n"+"\t"+"Dice Combinations Label Matrix" +"\n");
			 
			 for(int k=0;k<prompt.length;k++)
			 {
				 System.out.printf(prompt[k]+"      \t      ");
				 
			 }
			 System.out.println("\n");
			 
			 //Setting the title for each Row
			matrix[0][0]="Die1" +"\t " + matrix[0][0];
			matrix[1][0]="Die2" +"\t " + matrix[1][0];
			matrix[2][0]="Die3" +"\t " + matrix[2][0];
			matrix[3][0]="Die4" +"\t " + matrix[3][0];
			matrix[4][0]="Die5" +"\t " + matrix[4][0];
			matrix[5][0]="Die6" +"\t " + matrix[5][0];

		// Printing the two Dimensional array containing all the labels for each combo
		for (int i = 0; i < matrix.length; i++) 
		{
            for (int j = 0; j < matrix[i].length; j++) {
            	
            	//matrix[0][0]= "Die1";
            	
            	 
            	
            	System.out.printf(matrix[i][j] + "\t" );
            	
            	}
            System.out.println("\n");
           
            }
		
		
		}       

}
