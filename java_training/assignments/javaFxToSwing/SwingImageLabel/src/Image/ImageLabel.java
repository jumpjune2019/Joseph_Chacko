package Image;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabel {

	public JFrame window = new JFrame("Use an Image in a Label");
	public JPanel container = new JPanel();
	public ImageIcon fImage = new ImageIcon("C:\\java_training\\assignments\\JavaFX\\SwingButtonImage\\src\\button\\fungi.png");
	public ImageIcon resizedF = resizeImage(fImage);
	public JLabel label = new JLabel(" Fungi");
	
	
	public ImageLabel() {
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
	public void displayTheLabel() {
		label.setIcon(resizedF);
		container.add(label);
		
		window.setVisible(true);
	}
	//resize the ImageIcon passed
	public ImageIcon resizeImage(ImageIcon image) {
        Image img = image.getImage();
        Image newImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon resImage = new ImageIcon(newImg);
		
		return resImage;
	}
}
