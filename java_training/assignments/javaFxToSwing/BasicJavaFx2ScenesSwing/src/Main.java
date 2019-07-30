import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame {

     JPanel cardPanel;
     JPanel panel1;
     JPanel panel2;
     JPanel buttonPanel;
     JLabel jlabScene1;
     JLabel jlabScene2;
     
 
    

    public Main() {
            
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setTitle("Two Scenes");
        
        CardLayout cardLayout = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        
        buttonPanel = new JPanel();
        buttonPanel.setSize(300, 300);
        
        JToggleButton btn = new JToggleButton(" Go To Scene 2 ");
        btn.setPreferredSize(new Dimension(300, 50));
       
        panel1 = new JPanel();
        panel2 = new JPanel();
        
       jlabScene1 = new JLabel("This is first scene ");
       jlabScene2 = new JLabel(" ");
       
       
        panel1.add(jlabScene1);
        panel2.add(jlabScene2);
        cardPanel.add(panel1, "1");
        cardPanel.add(panel2, "2");
        buttonPanel.add(btn);
        
        frame.add(buttonPanel);
        frame.add(cardPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
        
        
        
        btn.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent event) {
	            if (btn.isSelected()){
	                btn.setText("Go To Scene 1");
	                cardLayout.show(cardPanel, "1");
	                jlabScene1.setText("This is the Second Scene");
	               
	            } else {
	                btn.setText("Go To Scene 2");
	                cardLayout.show(cardPanel, "2");
	                
	                jlabScene2.setText("This is the First Scene");
	               
	            }
	        }
	    });
    }
    

    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                 new Main();
               
            }
        });
    }
}