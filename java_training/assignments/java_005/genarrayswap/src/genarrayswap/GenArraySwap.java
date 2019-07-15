package genarrayswap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class GenArraySwap {
	
	
	public static final <T> void swap (T[] a, int i, int j) {
		  T t = a[i];
		  a[i] = a[j];
		  a[j] = t;
		}

		public static final <T> void swap (List<T> l, int i, int j) {
		  Collections.<T>swap(l, i, j);
		}

		private static void test() {
			
			  String [] a = {"ONE","THREE","TWO","FOUR"};
			  System.out.println("\n"+"Array Before Swapping:"+Arrays.toString(a));
			  
			  List<String> l = new ArrayList<String>(Arrays.asList(a));
			  swap(l, 2, 1);
			  System.out.println("\n"+"Array after Swapping:"+l);
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();

	}

}
