package Load;

import javax.swing.SwingUtilities;

public class Main {

	
	public static void main(String args[]) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ImageLoad displayDemo = new ImageLoad();
				displayDemo.displayTheImage();

			}
		}); 
	}
}
