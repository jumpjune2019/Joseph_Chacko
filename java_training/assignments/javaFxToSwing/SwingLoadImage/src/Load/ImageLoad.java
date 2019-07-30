package Load;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ImageLoad {
	
	public JFrame window = new JFrame("Fungi is hilarious");
	public JPanel container = new JPanel();
	public JLabel frame = new JLabel();
	public ImageIcon fImage = new ImageIcon("C:\\java_training\\assignments\\JavaFX\\SwingButtonImage\\src\\button\\fungi.png");

	public ImageLoad() {
		prepareGUI();
	}
	
	public void prepareGUI() {
		BorderLayout layout = new BorderLayout();
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
	//Display the layout
	public void displayTheImage() {
		frame.setIcon(fImage);
		container.add(frame);
		window.pack();
		window.setVisible(true);
	}
}