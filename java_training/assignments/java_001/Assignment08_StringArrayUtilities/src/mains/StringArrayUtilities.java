package mains;
public class StringArrayUtilities {
	
	
	
	public   boolean arrayHasExactMatch(String[] array,String string , boolean found) 
	{
		String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo" };
				boolean found;
				
				found = arrayHasExactMatch (myList, "zo", false);
				found = arrayHasExactMatch (myList, "zoo", false);
				found = arrayHasExactMatch (myList, "zoo", true);
				found = arrayHasExactMatch (myList, "foo", true);
				found = arrayHasExactMatch (myList, "foo", false);
				found = arrayHasExactMatch (myList, "delta", true);
				found = arrayHasExactMatch (myList, "Delta", true);

		
	}
	
	public  int[] indexOfOccuranceInArray(String[] array, string, boolean value) 
	{
		
		String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money","Zoo"};
				int foundIndexes[];
				foundIndexes = indexOfOccuranceInArray (myList, "zo", false);
				// foundIndexes will contain [-1]
				foundIndexes = indexOfOccuranceInArray (myList, "zoo", false);
				// foundIndexes will contain [5]
				foundIndexes = indexOfOccuranceInArray (myList, "zoo", true);
				// foundIndexes will contain [-1]
				
				foundIndexes = indexOfOccuranceInArray (myList, "zoo", true);
				foundIndexes = indexOfOccuranceInArray (myList, "foo", true);
				foundIndexes = indexOfOccuranceInArray (myList, "foo", false);
				foundIndexes = indexOfOccuranceInArray (myList, "delta", true);
				foundIndexes = indexOfOccuranceInArray (myList, "Delta", true);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items");
		System.out.println("{“Bozo”, “FooBar”, “Delta”, “Foozball”, “Demo”, “Money”, “Zoo”}");
		
		System.out.println("Scenario 1");
		System.out.println("arrayHasExactMatch (myList, \"zo\", false)"  );
		
		System.out.println("Scenario 2");
		System.out.println("arrayHasExactMatch (myList, \"zoo\", false)" );
		
		System.out.println("Scenario 3");
		System.out.println("arrayHasExactMatch (myList, \"zoo\", true)" );
		
		System.out.println("Scenario 4");
		System.out.println("arrayHasExactMatch (myList, \"foo\", true)" );
		
		System.out.println("Scenario 5");
		System.out.println("arrayHasExactMatch (myList, \"foo\", false)" );
		
		System.out.println("Scenario 6");
		System.out.println("arrayHasExactMatch (myList, \"delta\", true)" );
		
		System.out.println("Scenario 7");
		System.out.println("arrayHasExactMatch (myList, \"Delta\", true)" );
		
		System.out.println("Scenario 8");
		System.out.println("indexOfOccuranceInArray (myList, \"zo\", false)" );
		
		System.out.println("Scenario 9");
		System.out.println("indexOfOccuranceInArray (myList, \"zoo\", false)" );
		
		System.out.println("Scenario 10");
		System.out.println("indexOfOccuranceInArray (myList, \"zoo\", true)" );
		
		System.out.println("Scenario 11");
		System.out.println("indexOfOccuranceInArray (myList, \"zoo\", true)" );
		
		System.out.println("Scenario 12");
		System.out.println("indexOfOccuranceInArray (myList, \"foo\", true)" );
		
		System.out.println("Scenario 13");
		System.out.println("indexOfOccuranceInArray (myList, \"foo\", false)" );
		
		System.out.println("Scenario 14");
		System.out.println("indexOfOccuranceInArray (myList, \"delta\", true)" );
		
		System.out.println("Scenario 15");
		System.out.println("indexOfOccuranceInArray (myList, \"Delta\", true)" );
		
		

	}
	

}
