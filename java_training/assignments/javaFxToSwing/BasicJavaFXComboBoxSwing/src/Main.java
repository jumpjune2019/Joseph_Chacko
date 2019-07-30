

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


class Main implements  ListSelectionListener {
	JLabel jlabHeader;
	JLabel jlabSelected;
	

	String[] selectString = {" ", "Train" , "Car", "Airplane"};
	
	Main() {
		
		
		JFrame jfrm = new JFrame("Combobox Demo");
		jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));

		jfrm.setSize(500, 600);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabSelected = new JLabel("  ");
		
		jlabHeader = new JLabel("Select App Deployment Options");
		
		// Make combo boxes.
		JComboBox selectList = new JComboBox(selectString);
		
		
		
		
		
		jfrm.add(jlabHeader);
		jfrm.add(new JSeparator(SwingConstants.HORIZONTAL));
		jfrm.add(selectList);
		jfrm.add(new JSeparator(SwingConstants.HORIZONTAL));
		jfrm.add(jlabSelected);
		jfrm.setVisible(true);
		
	
	
		selectList.addItemListener(new ItemListener()
		{
	    @Override
	    	public void itemStateChanged(ItemEvent e)
	    	{
	        	if (e.getStateChange() == ItemEvent.SELECTED)
	        		{
	        			String selectedItem = (String) e.getItem();
	        			jlabSelected.setText(selectedItem);
	        		}
	    	}
		});
		
	}
	
	
  
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
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