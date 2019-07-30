package gridlayoutchallenge;

import javax.swing.JFrame; //imports JFrame library
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.BoxLayout;
import javax.swing.JButton; //imports JButton library

import java.awt.BorderLayout;

import java.awt.GridLayout; //imports GridLayout library
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main extends JFrame implements ActionListener{
	
	JFrame frame=new JFrame("Matrix Demo"); //creates frame
    JButton[][] grid; //names the grid of buttons
   // JLabel[][] grid1;
   JLabel jlabTitle;
   JLabel jlabFooter;
    //JButton jbtnReset;
    JLabel[][] gridlabel;
  
   

    Main(int width, int length)  //constructor
    {    	
    	
    	char[] rows = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       	
            frame.setLayout(new BorderLayout()); //set layout
            grid=new JButton[width][length]; //allocate the size of grid
            
            JPanel panel1 = new JPanel();
            panel1.setLayout(new GridLayout(width, length));
            
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
          
            jlabTitle = new JLabel("Basic Matrix Demo");
           // JButton jbtnReset = new JButton("Reset");
            
            jlabFooter = new JLabel (" No seats Selected");
            
           for(int x=0; x<length; x++){
                    for(int y=0; y<width; y++){
                           grid[x][y]=new JButton("("+rows[x]+","+y+")"); //creates new button   
                           JLabel jlab = new JLabel("("+rows[x]+","+y+")");
                       
                          panel1.add(grid[x][y]);
                          panel1.add(jlab);
                          //panel.add(grid1[x][y]);
                           //adds button to grid
                         
                          grid[x][y].addActionListener(this);
                           
                    }
                  
            }
                     
        frame.add(jlabTitle, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);
        frame.add(jlabFooter, BorderLayout.SOUTH);
          
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack(); //sets appropriate size for frame
            frame.setVisible(true); //makes frame visible
            
    }
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() instanceof JButton) {
            String text = ((JButton) e.getSource()).getText();
            jlabFooter.setText("Selected seat : " + text);
        }
		
	}
   
    
    public static void main(String[] args)  {
    	
    	
            SwingUtilities.invokeLater(new Runnable() {
    			public void run() {
    				
    				int y =(int)(Math.random() * 4) +2;
    			
						new Main(y , y );
					
					
    			}
    		});
            
            
    }
} 