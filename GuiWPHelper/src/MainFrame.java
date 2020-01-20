import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	private TextPanel textPanel;
	private JTextField textField;
	private JButton btn;
	private Toolbar toolbar;
	private ToolBarStringListener toolbarListener;
	private FormPanel formPanel;
	
	public MainFrame() {
		super("Hello World!");
		
		setLayout( new BorderLayout() );
		
		textPanel = new TextPanel();
		textField = new JTextField(" field ");
		toolbar = new Toolbar();
		toolbarListener = new ToolBarStringListener(textPanel);
		formPanel = new FormPanel();
		
		toolbar.setStringListener( toolbarListener );
		
		formPanel.setFormListener(new FormListener() {
			public void formEventOccurred(FormEvent e) {
				String name = e.getName();
				String occupation = e.getOccupation();
				
				textPanel.appendText(name + ": " + occupation + "\n");
			}
		});
		
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	
	}

}
