package Demo3;

import javax.swing.SwingUtilities;

public class Main {

	
	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Demo3 displayDemo = new Demo3();
				displayDemo.displayTheButtons();

			}
		}); 
	}
}
