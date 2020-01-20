
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
 
import java.awt.Insets;
import java.awt.Dimension;

public class GuiWPHelper {		 
	    public static void main(String[] args) {
		        // Create and set up a frame window
	    		SwingUtilities.invokeLater(new Runnable() {
	    			public void run() {
	    	    		new MainFrame();
	   
	    			}
	    		});	 
	}
}