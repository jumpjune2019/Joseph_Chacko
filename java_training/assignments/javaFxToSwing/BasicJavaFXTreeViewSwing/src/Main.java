


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

import com.sun.source.util.TreePath;


class Main implements  TreeSelectionListener,  ChangeListener {
	JLabel jlabHeader;
	JLabel jlabSelected;
	JLabel jlab;
	
	Main() {
		
		
		JFrame jfrm = new JFrame("Tree View Demo");
		jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));
		
		
		
		  //create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Food");
        //create the child nodes
        DefaultMutableTreeNode fruits = new DefaultMutableTreeNode("Fruits");
        DefaultMutableTreeNode vegetables = new DefaultMutableTreeNode("Vegetables");
        DefaultMutableTreeNode nuts = new DefaultMutableTreeNode("Nuts");
        //add the child nodes to the root node
        root.add(fruits);
        root.add(vegetables);
        root.add(nuts);
        
        DefaultMutableTreeNode apples = new DefaultMutableTreeNode("Apples");
        DefaultMutableTreeNode pears = new DefaultMutableTreeNode("Pears");
        DefaultMutableTreeNode oranges = new DefaultMutableTreeNode("Oranges");
        fruits.add(apples);
        fruits.add(pears);
        fruits.add(oranges);
        
        DefaultMutableTreeNode fuji = new DefaultMutableTreeNode("Fuji");
        DefaultMutableTreeNode winesap = new DefaultMutableTreeNode("Winesap");
        DefaultMutableTreeNode clark = new DefaultMutableTreeNode("Clark");
        apples.add(fuji);
        apples.add(winesap);
        apples.add(clark);
        
        DefaultMutableTreeNode corn = new DefaultMutableTreeNode("Corn");
        DefaultMutableTreeNode peas = new DefaultMutableTreeNode("Peas");
        DefaultMutableTreeNode broccoli = new DefaultMutableTreeNode("Broccoli");
        DefaultMutableTreeNode beans = new DefaultMutableTreeNode("Beans");
        vegetables.add(corn);
        vegetables.add(peas);
        vegetables.add(broccoli);
        vegetables.add(beans);
        
        DefaultMutableTreeNode walnuts = new DefaultMutableTreeNode("Walnuts");
        DefaultMutableTreeNode almonds = new DefaultMutableTreeNode("Almonds");
        DefaultMutableTreeNode pistachios = new DefaultMutableTreeNode("Pistachio");
        nuts.add(walnuts);
        nuts.add(almonds);
        nuts.add(pistachios);
		
		JTree tree = new JTree(root);
		 
		tree.setSize(400, 100);
		
		jfrm.setSize(600, 600);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabSelected = new JLabel(" No Selection ");
		
		jlabHeader = new JLabel("Tree View Demo");
		jlab = new JLabel(" ");
		
		JToggleButton btn = new JToggleButton("Expand All");
		
		
        //btn.addItemListener(this);
        
		
		jfrm.add(jlabHeader);
		jfrm.add(new JScrollPane(tree));
		jfrm.add(jlab);
		jfrm.add(jlabSelected);
		
		jfrm.add(btn);
		jfrm.setVisible(true);
		
		
		tree.getSelectionModel().addTreeSelectionListener(new TreeSelectionListener() {
		    @Override
		    public void valueChanged(TreeSelectionEvent e) {
		    	
		    	 DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
		         jlab.setText("Selection is : " + selectedNode.getUserObject().toString());
		        jlabSelected.setText("Complete Path is : " + e.getPath().toString());
		    }
		});
		
		btn.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent event) {
	            if (btn.isSelected()){
	                btn.setText("Collapse All");
	                expandAll(tree);
	            } else {
	                btn.setText("Expand All");
	                collapseAll(tree);
	            }
	        }
	    });
		
	}
	
	 public void expandAll(JTree tree) {
		    int row = 0;
		    while (row < tree.getRowCount()) {
		      tree.expandRow(row);
		      row++;
		      }
		    }
	
	 public void collapseAll(JTree tree) {
		    int row = tree.getRowCount() - 1;
		    while (row >= 0) {
		      tree.collapseRow(row);
		      row--;
		      }
		    }



		@Override
		public void valueChanged(TreeSelectionEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
		}


	public static void main(String args[]) 
	{
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
				
			}
		});
	}



	
}