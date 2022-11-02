import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener
{
	Container c;
	JLabel lblUserName,lblPasswd;
	JTextField txtUserName;
	JPasswordField txtPasswd;
	JButton btnLogin,btnCancel;
	
	public LoginPage() 
	{
		// TODO Auto-generated constructor stub
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		lblUserName=new JLabel("User Name");
		txtUserName=new JTextField(10);
		
		lblPasswd=new JLabel("Password");
		txtPasswd=new JPasswordField(10);
		
		btnLogin=new JButton("Login");
		btnCancel=new JButton("Cancel");
		
		c.add(lblUserName);
		c.add(txtUserName);
		c.add(lblPasswd);
		c.add(txtPasswd);
		c.add(btnLogin);
		c.add(btnCancel);
		
		btnLogin.addActionListener(this);
	}
	
	public static void main(String[] args) {
		LoginPage p=new LoginPage();
		p.setTitle("Login Page");
		p.setSize(600, 600);
		p.setVisible(true);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btnLogin) {
			String un=txtUserName.getText();
			String pwd=String.valueOf(txtPasswd.getPassword());
			
			String sql=
"Select username,password from tbluser where username='"+un+"' and password='"+pwd+"'";
			Connection con=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			con=DBConnection.getDatabaseConnection();
			try 
			{
				stmt=con.createStatement();
				rs=stmt.executeQuery(sql);
				if(rs.next()) {
					Welcome w=new Welcome();
					w.setTitle("Welcome Page");
					w.setVisible(true);
					w.setSize(400, 400);
					w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JOptionPane.showMessageDialog(this, "Password Match");
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Please check username and password");
				}
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
