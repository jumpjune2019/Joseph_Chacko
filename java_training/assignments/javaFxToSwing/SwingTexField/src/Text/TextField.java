package Text;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TextField implements ActionListener {
	
	public JFrame window = new JFrame("Text Field Demo");
	public JPanel header = new JPanel();
	public JPanel container = new JPanel();
	public JTextField userInput = new JTextField("");
	public JLabel intro = new JLabel("Text Feild Demo", SwingConstants.CENTER);
	public JButton getInputBtn = new JButton("Get Input");
	public String input;
	public JLabel result = new JLabel("Search String: ");

	public TextField() {
		prepareGUI();
	}
	
	public void prepareGUI() {
		BorderLayout layout = new BorderLayout();
		//window.setSize(300, 500);
		window.setLayout(layout);
		window.add(container, BorderLayout.CENTER);
		window.add(header, BorderLayout.NORTH);

		
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
	//Display the layout
	public void displayTheText() {
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		getInputBtn.addActionListener(this);
		header.add(intro);
		container.add(userInput);
		container.add(getInputBtn);
		container.add(result);
		window.pack();
		window.setVisible(true);
	}

	//set the text result to whatever the user just typed
	public void actionPerformed(ActionEvent ae) {
		input = userInput.getText();
		result.setText("Search String: " + input);
		userInput.setText("");
	}
}