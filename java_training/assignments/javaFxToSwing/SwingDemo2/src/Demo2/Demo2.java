package Demo2;

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

public class Demo2 implements ActionListener {

	public JFrame window = new JFrame("Hellow World!");
	public JPanel container = new JPanel();
	public JButton hi = new JButton("Say 'Hello World!'");
	public JButton reset = new JButton("Reset");
	public JLabel result = new JLabel("");
	
	public Demo2() {
		prepareGUI();
	}
	public void prepareGUI() {
		BorderLayout layout = new BorderLayout(3, 1);
		window.setSize(500, 500);
		window.setLayout(layout);
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
		GridLayout layout = new GridLayout(3, 1);
		container.setLayout(layout);
		hi.addActionListener(this);
		reset.addActionListener(this);
		container.add(hi);
		container.add(result);
		container.add(reset);
		
		window.setVisible(true);
	}
	//set the result text to whatever button was just pressed
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Reset")) {
			result.setText("");
		} else if (ae.getActionCommand().equals("Say 'Hello World!'")){
			result.setText("Hello World!");
		}
	}
}
