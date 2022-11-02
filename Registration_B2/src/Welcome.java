import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome extends JFrame 
{
	JLabel lblmsg;
	Container c;
	public void showMessage(String username) {
		c=getContentPane();
		c.setLayout(new FlowLayout());
		lblmsg=new JLabel();
		lblmsg.setText(username);
		c.add(lblmsg);
	}
}
