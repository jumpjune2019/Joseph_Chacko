package Scroll;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class ScrollPane implements ActionListener {
	
	public JFrame window = new JFrame("Scroll Pane Demo");
	public JPanel header = new JPanel();
	public JPanel container = new JPanel();
	public JTextArea paragraph = new JTextArea();
	public String p = "A ScrollPane streamlines the process \n" + 
			" of adding darn scroll bars to a window whose contents \n" + 
			" exceed the viewing area dimension of the window \n " + 
			" It also enables a control to fit in \n " + 
			" Such as this label control in JavaFX \n " + 
			" Without it, we could not really view well the content \n " + 
			" of a control if it overflowed, so using scrollbars helps lots! \n";
	public JScrollPane scrollBox;
	public JLabel msg = new JLabel();
	public JLabel intro = new JLabel("Scroll Pane Demo", SwingConstants.CENTER);
	public JButton reset = new JButton("Reset");

	public ScrollPane() {
		prepareGUI();
	}
	
	public void prepareGUI() {
		BorderLayout layout = new BorderLayout();
		window.setSize(200, 200);
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
	public void displayTheScroll() {
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		paragraph.setText(p);
		//container.setLayout();
		//msg.setText("<html>" + p + "</html>");
		scrollBox = new JScrollPane(paragraph);
		
		reset.addActionListener(this);
		header.add(intro);
		
		container.add(scrollBox);
		container.add(reset);
		
		
		//window.pack();
		window.setVisible(true);
	}

	//set the scroll bars back to original value
	public void actionPerformed(ActionEvent ae) {
	    JScrollBar verticalScrollBar = scrollBox.getVerticalScrollBar();
	    JScrollBar horizontalScrollBar = scrollBox.getHorizontalScrollBar();
	    verticalScrollBar.setValue(verticalScrollBar.getMinimum());
	    horizontalScrollBar.setValue(horizontalScrollBar.getMinimum());
	}
}
