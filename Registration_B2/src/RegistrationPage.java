import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class RegistrationPage extends JFrame implements ActionListener
{
    Container c;
    JLabel lblFirstName;
    JTextField txtFirstName;
    JTextField txtLastName;
    JLabel lblLastName;
    JButton btnRegister;
    public RegistrationPage()
    {
        c=getContentPane();
        c.setLayout(new FlowLayout());

        lblFirstName=new JLabel("First Name");
        txtFirstName=new JTextField(20);

        lblLastName=new JLabel("Last Name");
        txtLastName=new JTextField(20);

        btnRegister=new JButton("Register");

        c.add(lblFirstName);
        c.add(txtFirstName);
        c.add(lblLastName);
        c.add(txtLastName);
        c.add(btnRegister);
        
        btnRegister.addActionListener(this);
    }
    public static void main(String[] args) {
		RegistrationPage p=new RegistrationPage();
		p.setTitle("Registration Page");
		p.setSize(400, 400);
		p.setVisible(true);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btnRegister) {
			
			String firstName=txtFirstName.getText();
			String lastName=txtLastName.getText();
			String sql="Insert into userinfo values('"+firstName+"','"+lastName+"')";
			
			Connection con=null;
			Statement stmt=null;
			con=DBConnection.getDBConnection();
			try 
			{
				stmt=con.createStatement();
				int r=stmt.executeUpdate(sql);
				if(r>0) 
				{
					Welcome w=new Welcome();
					w.setTitle("Welcome:"+firstName);
					w.setSize(400, 400);
					w.setVisible(true);
					w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					w.showMessage("Welcome:"+firstName+" "+lastName);
					JOptionPane.showConfirmDialog(this, "Registration done");
					dispose();
				}
				else
				{
					JOptionPane.showConfirmDialog(this, "Registration Not done");
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