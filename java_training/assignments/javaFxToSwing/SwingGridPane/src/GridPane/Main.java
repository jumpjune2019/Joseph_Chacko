package GridPane;

import javax.swing.SwingUtilities;

public class Main {

	
	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GridPane displayDemo = new GridPane();
				displayDemo.displayTheButtons();

			}
		}); 
	}
}
