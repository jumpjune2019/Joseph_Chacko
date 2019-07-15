package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLightSim {

	

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Traffic Light simulator is a GO");
		System.out.println("Press Enter key to break out of loop");
		System.out.println("\n");
		
		

		try {
			MyThread mt = new MyThread("");
			
					//Reading user input for ENTER key press
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String input = null;
					input = br.readLine();
					System.out.println("Traffic Light Simulator is Done!");
					mt.mystop();
		    
		     
		} catch (IOException e) {
		     //handle exception
		}
		
				
		
		
	}

}
