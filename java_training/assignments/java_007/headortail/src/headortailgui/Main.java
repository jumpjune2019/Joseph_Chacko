package headortailgui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public  class Main  implements ActionListener{
	
	JLabel jlabSelected;	
	JButton jbtnClick;
	JButton jbtnReset;
	
		
	Main() {
		
		
		JFrame frm = new JFrame("Head Or Tail");
		
		JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
		
		frm.setLayout(new FlowLayout());
		frm.setSize(300, 200);
		// Terminate the program when the user closes the application.
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton jbtnClick = new JButton("Click To Flip");
		
		JButton jbtnReset = new JButton("Reset");
		
		jlabSelected = new JLabel("waiting");
		
	
		// Add action listeners.
		jbtnClick.addActionListener(this);
		jbtnReset.addActionListener(this);
		
		
		
		panel.add(jbtnClick, BorderLayout.NORTH);
		panel.add(jlabSelected, BorderLayout.CENTER);
		panel.add(jbtnReset, BorderLayout.SOUTH);
		frm.add(panel);
		frm.setVisible(true);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand().equals("Click To Flip"))
		{
			
			int coinFlip = (Math.random() <= 0.5) ? 1 : 2;
			
				if(coinFlip==1) {
				jlabSelected.setText("You Flipped Head");
			} else if (coinFlip==2){
				jlabSelected.setText("You Flipped Tail");
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
		jlabSelected.setText("waiting");
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



