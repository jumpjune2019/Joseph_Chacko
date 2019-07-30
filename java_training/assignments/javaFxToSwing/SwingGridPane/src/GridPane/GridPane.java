package GridPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GridPane implements ActionListener {

	public JFrame window = new JFrame("Grid Demo");
	public JPanel container = new JPanel();
	public JPanel header = new JPanel();
	public JLabel intro = new JLabel("Push a Button", SwingConstants.CENTER);
	public JButton Btn1 = new JButton("Button 1");
	public JButton Btn2 = new JButton("Button 2");
	public JButton Btn3 = new JButton("Button 3");
	public JButton Btn4 = new JButton("Button 4");
	public JButton Btn5 = new JButton("Button 5");
	public JButton Btn6 = new JButton("Button 6");
	
	public GridPane() {
		prepareGUI();
	}
	public void prepareGUI() {
		BorderLayout layout = new BorderLayout(3, 1);
		window.setSize(500, 500);
		window.setLayout(layout);
		window.add(intro, BorderLayout.NORTH);
		window.add(container, BorderLayout.CENTER);
		
		// old school way to close a window
		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				// this is the way to force a java application to gracefully exit
				// when not going to end via the main method entry point
				System.out.println("Yo I got out fine");
				System.exit(0);
			}        
		}); 
		window.setVisible(true);
	}
	public void displayTheButtons() {		
		GridLayout gLayout = new GridLayout(2, 3);
		container.setLayout(gLayout);
		Btn1.addActionListener(this);
		Btn2.addActionListener(this);
		Btn3.addActionListener(this);
		Btn4.addActionListener(this);
		Btn5.addActionListener(this);
		Btn6.addActionListener(this);
		container.add(Btn1);
		container.add(Btn2);
		container.add(Btn3);
		container.add(Btn4);
		container.add(Btn5);
		container.add(Btn6);
		
		window.setVisible(true);
	}
	//set the result text to whatever button was just pressed
	public void actionPerformed(ActionEvent ae) {
		System.out.println(ae.getActionCommand());
	}
}
