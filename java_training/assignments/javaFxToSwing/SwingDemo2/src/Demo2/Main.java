package Demo2;

import javax.swing.SwingUtilities;

public class Main {

	
	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Demo2 displayDemo = new Demo2();
				displayDemo.displayTheButtons();

			}
		}); 
	}
}