

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;


class Main implements  ItemListener {
	JLabel jlabHeader;
	JLabel jlabSelected;
	
	Main() {
		
		
		JFrame jfrm = new JFrame("Toggle Button Demo");
		jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		jfrm.setSize(400, 200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabSelected = new JLabel("  ");
		
		jlabHeader = new JLabel("Push Button");
		
		JToggleButton btn = new JToggleButton("On/Off");
		
		
        btn.addItemListener(this);
        
		
		panel.add(jlabHeader, BorderLayout.NORTH);
		panel.add(btn, BorderLayout.CENTER);
		panel.add(jlabSelected, BorderLayout.SOUTH);
		jfrm.add(panel);
		jfrm.setVisible(true);
		
		
	}
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		int state = e.getStateChange();
        if (state == ItemEvent.SELECTED) {
        	jlabSelected.setText("Button is On"); 
        } else {
        	jlabSelected.setText("Button is Off");
        }
		
	}




	public static void main(String args[]) 
	{
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
			}
		});
	}

	
}