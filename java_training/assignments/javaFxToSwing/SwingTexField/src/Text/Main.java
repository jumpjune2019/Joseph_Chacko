package Text;

import javax.swing.SwingUtilities;

public class Main {

	
	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TextField displayDemo = new TextField();
				displayDemo.displayTheText();

			}
		}); 
	}
}