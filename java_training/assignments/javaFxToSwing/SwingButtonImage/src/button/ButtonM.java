package button;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ButtonM implements ActionListener {
	
	public JFrame window = new JFrame("Using Images with Buttons");
	public JPanel container = new JPanel();
	public JLabel intro = new JLabel("Push a Button");
	public ImageIcon fImage = new ImageIcon("fungi.png");
	public ImageIcon resizedF = resizeImage(fImage);
	public ImageIcon dImage = new ImageIcon("dairy.png");
	public ImageIcon resizedD = resizeImage(dImage);
	public JButton fungiBtn = new JButton("Fungi", resizedF);
	public JButton dairyBtn = new JButton("Dairy", resizedD);
	public JLabel result = new JLabel("");
	public JButton reset = new JButton("Reset");

	public ButtonM() {
		prepareGUI();
	}
	
	public void prepareGUI() {
		BorderLayout layout = new BorderLayout();
		window.setSize(200, 300);
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
	public void displayTheButtons() {
		GridLayout grid = new GridLayout(5, 1);
		container.setLayout(grid);
		
		fungiBtn.addActionListener(this);
		dairyBtn.addActionListener(this);
		reset.addActionListener(this);

		
		container.add(intro);
		container.add(fungiBtn);
		container.add(dairyBtn);
		container.add(result);
		container.add(reset);
		
		
		window.pack();
		window.setVisible(true);
	}
	//resize the ImageIcon passed
	public ImageIcon resizeImage(ImageIcon image) {
        Image img = image.getImage();
        Image newImg = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon resImage = new ImageIcon(newImg);
		
		return resImage;
	}
	//set the result text to whatever button was just pressed
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Reset")) {
			result.setText("");
		} else {
			result.setText(ae.getActionCommand());
		}
	}
}
