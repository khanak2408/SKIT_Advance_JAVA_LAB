import javax.swing.*;
import java.awt.*;
import java.awt.Container;
class RegistrationPage extends JFrame{
        Container c=null;
        JLabel lblFirstName,lblLastName;
        JTextField txtFirstName,txtLastName;
        JButton btnRegister;
        public RegistrationPage(){
                  c=getContentPane();
                  c.setLayout(new FlowLayout());
                 
                  lblFirstName=new JLabel("First Name");
                  txtFirstName=new JTextField(10);
                  lblLastName=new JLabel("Last Name");
                  txtLastName=new JTextField(10);
                  btnRegister=new JButton("Register");
                 
                  c.add(lblFirstName);
                  c.add(txtFirstName);
                  c.add(lblLastName);                      
                  c.add(txtLastName);
                  c.add(btnRegister);
       
        }
    public static void main(String[] args) {
		RegistrationPage p=new RegistrationPage();
		p.setTitle("Registration Page");
		p.setSize(400, 400);
		p.setVisible(true);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}