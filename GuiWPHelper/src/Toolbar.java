import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private StringListener textListener;
//	private TextPanel textPanel;
	
	public Toolbar() {
		setBorder(BorderFactory.createEtchedBorder());
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(helloButton);
		add(goodbyeButton);
	}
	
	public void setStringListener(StringListener _listener) {
		this.textListener = _listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if ( clicked == helloButton )
		{
			if ( null != textListener ) {
				textListener.textEmitted("Hello\n");
			}
		}
		else if ( clicked == goodbyeButton )
		{
			if ( null != textListener ) {
				textListener.textEmitted("Goodbye\n");
			}
		}
	}
}
