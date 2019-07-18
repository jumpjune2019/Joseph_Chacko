package basicsorting;

import java.util.Arrays;
import java.util.Collections;

public class Main {

public static void main(String[] args) {
		
	Integer[] numArr = { 10, 3, 4, 15, 7, 9, 1, 21 };
	
    System.out.println("Initial Integer Array: " + Arrays.toString(numArr));
			
				SortFunc<Integer> intArray = (a, order, caseSen) -> {
			         Integer[] arr = a;
			         if(order.equalsIgnoreCase("ASC")){
			        	 Arrays.sort(arr);
			         }else if(order.equalsIgnoreCase("DESC")) {
			        	 Arrays.sort(arr,Collections.reverseOrder());
			         }
			         
			         return arr;
			     };
        
     numArr = intArray.sort(numArr,"ASC",false);
     System.out.println("Sorted ASC: " + Arrays.toString(numArr));
     
    
     numArr = intArray.sort(numArr,"DESC" ,false);
     System.out.println("Sorted DESC: " +Arrays.toString(numArr));
     
     


		String[] strArr = { "claude", "Phil", "lois", "clark", "Arthur", "Mera", "bruce" };
		
		 System.out.println("\nInitial String Array: " + Arrays.toString(strArr));
		
				SortFunc<String> strArray = (a, order, caseSen) -> {
					String[] arr = a;
					
					if(order.equalsIgnoreCase("ASC")) {
						
						if (caseSen == true) {
							Arrays.sort(arr);
						
						} else if (caseSen == false) {
							Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
						}
					
					} else if ( order.equalsIgnoreCase("DESC")) {
						
						if (caseSen == true) {
							Arrays.sort(arr);
							
							Collections.reverse(Arrays.asList(arr));
						} else if (caseSen == false) {
							Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
							Collections.reverse(Arrays.asList(arr));
						}
					}
					
					return arr;
				};
        
        
       
	   
	    strArr = strArray.sort(strArr,"ASC",true);
	    System.out.println("Sorted ASC and CASE SENSITIVITY ON: " + Arrays.toString(strArr));
	    
	    
	    strArr = strArray.sort(strArr,"ASC",false);
	    System.out.println("Sorted ASC and CASE SENSITIVITY OFF: " + Arrays.toString(strArr));
	     
	  
	    strArr = strArray.sort(strArr,"DESC",true);
	    System.out.println("Sorted DESC and CASE SENSITIVITY ON: " + Arrays.toString(strArr));
	    
	    
	    strArr = strArray.sort(strArr,"DESC",false);
	    System.out.println("Sorted DESC and CASE SENSITIVITY OFF: " + Arrays.toString(strArr));

}
	
	

}
