package Demo1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo1 implements ActionListener {

	public JFrame window = new JFrame("Hellow World!");
	public JPanel container = new JPanel();
	public JButton hi = new JButton("Say 'Hello World!'");
	
	public Demo1() {
		prepareGUI();
	}
	public void prepareGUI() {
		BorderLayout layout = new BorderLayout();
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
	public void displayTheButton() {
		hi.addActionListener(this);
		container.add(hi);
		
		window.setVisible(true);
	}
	//Print the text 'Hellow World!'
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Hello World!");
	}
}
