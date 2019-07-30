// Demonstrate a simple JList.
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main implements ListSelectionListener, ActionListener {
	JList<String> jlst;
	JLabel jlab;
	JLabel jlabHeader;
	JScrollPane jscrlp;
	// Create an array of names.
	String names[] = { "Train", "Car" , "Airplane"};
	DefaultListModel<String> model = new DefaultListModel<>();

	Main() {
		// Create a new JFrame container.
		JFrame jfrm = new JFrame("JList Demo");
		jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));
		
		// Give the frame an initial size.
		jfrm.setSize(500, 400);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnAdd = new JButton("Add an item");
		JButton btnRemove = new JButton("Remove First Item");
		
		
		// Create a JList.
		
		
		jlst = new JList<String>(model);
		model.addElement("Train");
		model.addElement("Car");
		model.addElement("Airplane");
		
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// Add list to a scroll pane.
		jscrlp = new JScrollPane(jlst);
		// Set the preferred size of the scroll pane.
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
		
		jlabHeader =new JLabel("Select Transport Type");
		jlab = new JLabel("Nothing Clicked.");
		
		jlst.addListSelectionListener(this);
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);
		
		jfrm.add(jlabHeader);
		jfrm.add(new JSeparator(SwingConstants.HORIZONTAL));
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		jfrm.add(btnAdd);
		jfrm.add(btnRemove);
		jfrm.setVisible(true);
		
	}
	
	// Handle list selection events.
	public void valueChanged(ListSelectionEvent le) {
		// Get the index of the changed item.
		int idx = jlst.getSelectedIndex();
		// Display selection, if item was selected.
		if(idx != -1) {
			jlab.setText("Transport Selected is " + names[idx]);
		} else {
			
		}
	}

	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if (e.getActionCommand().equals("Add an item"))
		{
			
			model.addElement("Test");
			

		}
		
		else if (e.getActionCommand().equals("Remove First Item"))
		{
			if(!model.isEmpty()) {
				model.remove(0);
			}
			else {
				jlab.setText(" ");
			}
			
		}
		
		
	}
}