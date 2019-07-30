

import java.awt.event.*;
import javax.swing.*;


class Main implements ItemListener {
	JLabel jlabHeader;
	JLabel jlabSelected;
	JLabel jlabChanged;
	JCheckBox jcbWeb;
	JCheckBox jcbDesktop;
	JCheckBox jcbMobile;

	Main() {
		
		
		JFrame jfrm = new JFrame("Checkbox Demo");
		jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));

		jfrm.setSize(400, 300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabSelected = new JLabel("<none>");
		jlabChanged = new JLabel("Nothing Clicked");
		jlabHeader = new JLabel("Select App Deployment Options");
		
		// Make check boxes.
		jcbWeb = new JCheckBox("Web");
		jcbDesktop = new JCheckBox("Desktop");
		jcbMobile = new JCheckBox("Mobile");
		
		
		jcbWeb.addItemListener(this);
		jcbDesktop.addItemListener(this);
		jcbMobile.addItemListener(this);
		
		
		jfrm.add(jlabHeader);
		jfrm.add(new JSeparator(SwingConstants.HORIZONTAL));
		jfrm.add(jcbWeb);
		jfrm.add(jcbDesktop);
		jfrm.add(jcbMobile);
		jfrm.add(new JSeparator(SwingConstants.HORIZONTAL));
		jfrm.add(jlabChanged);
		jfrm.add(new JSeparator(SwingConstants.HORIZONTAL));
		jfrm.add(jlabSelected);
		jfrm.setVisible(true);
		
	}
	
	// This is the handler for the check boxes.
	public void itemStateChanged(ItemEvent ie)
	{
		String str = "";
		int count = 0;
		
		JCheckBox cb = (JCheckBox) ie.getItem();
		
		
		if(cb.isSelected()) {
			jlabChanged.setText("Clicked : " +cb.getText() );
		} else {
			
		}
		
		
		if(jcbWeb.isSelected()) {
			str += jcbWeb.getText();
			count++;
			
		}
		if(jcbDesktop.isSelected()) {
			if(count > 0) {
				str += ", ";
			}
			str += jcbDesktop.getText();
			count++;
		}
		if(jcbMobile.isSelected()) {
			if(count > 0) {
				str += ", ";
			}
			str += jcbMobile.getText();
			count++;
		}
		
		
		jlabSelected.setText( str);
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