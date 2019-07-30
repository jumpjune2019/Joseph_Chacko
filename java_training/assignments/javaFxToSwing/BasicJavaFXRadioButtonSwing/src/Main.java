

import java.awt.event.*;
import javax.swing.*;


class Main implements  ActionListener {
	JLabel jlabHeader;
	JLabel jlabSelected;
	
	Main() {
		
		
		JFrame jfrm = new JFrame("Radio Buttons Demo");
		jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));

		jfrm.setSize(500, 600);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabSelected = new JLabel("  ");
		
		jlabHeader = new JLabel("Radio Buttons");
		
		JRadioButton Train = new JRadioButton("Train");
		JRadioButton Car = new JRadioButton("Car");
		JRadioButton Plane = new JRadioButton("Plane");
		JRadioButton Boat = new JRadioButton("Boat");
		
		ButtonGroup group = new ButtonGroup();
        group.add(Train);
        group.add(Car);
        group.add(Plane);
        group.add(Boat);
        
        Train.addActionListener(this);
        Car.addActionListener(this);
        Plane.addActionListener(this);
        Boat.addActionListener(this);
	
		
		jfrm.add(jlabHeader);
		jfrm.add(Train);
		jfrm.add(Car);
		jfrm.add(Plane);
		jfrm.add(Boat);
		jfrm.add(jlabSelected);
		jfrm.setVisible(true);
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JRadioButton button = (JRadioButton) e.getSource();

        
        if (button.getText().equals("Car")){
            jlabSelected.setText("Car") ;
        } 
        else  if (button.getText().equals("Train")){
            jlabSelected.setText("Train") ;
        }
        else  if (button.getText().equals("Plane")){
            jlabSelected.setText("Plane") ;
        }
        else  if (button.getText().equals("Boat")){
            jlabSelected.setText("Boat") ;
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