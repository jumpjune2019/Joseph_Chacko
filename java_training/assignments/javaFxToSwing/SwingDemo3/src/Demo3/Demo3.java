package Demo3;

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

public class Demo3 implements ActionListener {

	public JFrame window = new JFrame("Alpha & Beta");
	public JPanel container = new JPanel();
	public JButton alphaBtn = new JButton("Alpha");
	public JButton betaBtn = new JButton("Beta");
	public JLabel result = new JLabel("Push a Button");
	
	public Demo3() {
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
		alphaBtn.addActionListener(this);
		betaBtn.addActionListener(this);
		container.add(alphaBtn);
		container.add(result);
		container.add(betaBtn);
		
		window.setVisible(true);
	}
	//set the result text to whatever button was just pressed
	public void actionPerformed(ActionEvent ae) {
		result.setText(ae.getActionCommand() + " was just pressed.");
	}
}