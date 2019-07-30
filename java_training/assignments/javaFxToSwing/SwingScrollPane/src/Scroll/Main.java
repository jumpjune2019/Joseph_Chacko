package Scroll;

import javax.swing.SwingUtilities;

public class Main {

	
	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ScrollPane displayDemo = new ScrollPane();
				displayDemo.displayTheScroll();

			}
		}); 
	}
}