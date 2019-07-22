package gameofdicegui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public  class Main  implements ActionListener{
	
	JLabel jlabMsg;	
	JLabel jlabMsg1;	
	JLabel jlabMsg2;	
	
	JButton jbtnClick;
	JButton jbtnReset;
	

	final static int max = 6;
	static int computerRoll1=0;
	static int userRoll1=0;
	static int computerRoll2=0;
	static int userRoll2=0;
	
	
	String[][] matrix = {  { "" , "" , " ", "" , "" , "" , "" },
	         { "" ,"Snake eyes" , "Australian Yo ", " Little Joe from Kolomo" , "No Field Five" , "Easy Six" , "Six one you’re done" },
	         {"" , "Ace caught a deuce" , "Ballerina" , "The Fever" , "Jimmie Hicks" , "Benny Blue" , "Easy eight"  },
	         {"" , "Easy four" , "OJ" , "Brooklyn Forest" , "Big Red" , "Eighter from Decatur" , "Nina from Pasedena" },
	         {"" , "Little Phoebe" , "Easy six" , " Skinny McKinney" , " Square pair" , "Railroad nine" , "Big one on the end" },
	         {"" , "Sixie from Dixie" , "Skinny Dugan" , "Easy eight" , "Jesse James" , "Puppy paws" , "Yo" },
	         {"" , "The Devil" , "Easy eight" , "Lou Brown" , "Tennessee" , "Six five no jive" , " Midnight" }
	      };
	
		
	Main() {
		
		
		JFrame frm = new JFrame("Game of Dice");
		JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
		
		frm.setLayout(new FlowLayout());
		frm.setSize(200, 300);
		// Terminate the program when the user closes the application.
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JButton jbtnClick = new JButton("Click To Roll Dice");
		
		JButton jbtnReset = new JButton("Reset");
		
		jlabMsg = new JLabel("User Roll ");
		jlabMsg1 = new JLabel("Computer Roll ");
		jlabMsg2 = new JLabel(" ");
		
	
		// Add action listeners.
		jbtnClick.addActionListener(this);
		jbtnReset.addActionListener(this);
		
		
		
		
		panel.add(jbtnClick, BorderLayout.NORTH);
		panel.add(jlabMsg, BorderLayout.WEST);
		panel.add(jlabMsg1, BorderLayout.EAST);
		panel.add(jlabMsg2, BorderLayout.SOUTH);
		panel.add(jbtnReset, BorderLayout.CENTER);
		
		 frm.add(panel);
	      
		
		frm.setVisible(true);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand().equals("Click To Roll Dice"))
		{
			
			 computerRoll1 = (int)(Math.random() * max) +1;
			    computerRoll2 = (int)(Math.random() * max) +1;
			    userRoll1 = (int)(Math.random() * max) +1;
			    userRoll2 = (int)(Math.random() * max) +1;
			
			    
			    
			    if((computerRoll1+computerRoll2)>( userRoll1+ userRoll2))
				{
			    	jlabMsg.setText("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " +  matrix[userRoll1][userRoll2] );
			    	jlabMsg1.setText(" I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
			    	jlabMsg2.setText("I Win!!!");
			    	
				}
				
				if((computerRoll1+computerRoll2)<( userRoll1+ userRoll2))
				{
					jlabMsg.setText("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
					jlabMsg1.setText("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
					jlabMsg2.setText("You Win!!!");
					
				}
				
				if((computerRoll1+computerRoll2)==( userRoll1+ userRoll2))
				{
					if(userRoll1== userRoll2)
					{
					jlabMsg.setText("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
					jlabMsg1.setText("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
					jlabMsg2.setText("Damn! You win on a Double! What Luck!");
					}
					
					if(computerRoll1== computerRoll2)
					{
					jlabMsg.setText("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
					jlabMsg1.setText("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
					jlabMsg2.setText("Damn! I win on a Double! Ah! I pity you fool!");
					
					}
					else {
						
						jlabMsg.setText("You have rolled a " + userRoll1 + " and " + userRoll2 + " > the " + matrix[userRoll1][userRoll2] );
						jlabMsg1.setText("I have rolled a " + computerRoll1 + " and " + computerRoll2 + " > the " + matrix[computerRoll1][computerRoll2] );
						jlabMsg2.setText("Stalemate! You’re tough");
					}
				
				}
			    
			    
			    
		
		}
		else if (e.getActionCommand().equals("Reset"))
	        {
				//frm.dispose();
	            //Main.main (null); 
			clearFields();
	        } 
		

	}
	
	private void clearFields()
	{
		jlabMsg.setText("User Roll");
		jlabMsg1.setText("Computer Roll");
		jlabMsg2.setText(null);
	}
	
	
	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new Main();
				}
			});
		}

}



