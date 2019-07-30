package Demo1;

import javax.swing.SwingUtilities;

public class Main {

	
	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Demo1 displayDemo = new Demo1();
				displayDemo.displayTheButton();

			}
		}); 
	}
}