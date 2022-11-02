import javax.swing.*;
import java.awt.*;
class RegistrationPage extends JFrame{
    Container c;
    JLabel lblFN,lblLN,lblCourse,lblGender,lblOCourse;
    JTextField txtFN,txtLN;
    JButton btnRegister;
    JCheckBox c1,c2;
    JRadioButton r1,r2;
    ButtonGroup g1;
    JComboBox<String> selectCourse;
    String [] course={"JAVA", "Advance","ML",".NET"};
    public RegistrationPage(){
        c=getContentPane();

        lblFN=new JLabel("First Name");
        lblFN.setBounds(40,60,80,20);
        txtFN=new JTextField(10);
        txtFN.setBounds(160,60,180,20);
        lblLN=new JLabel("Last Name");
        lblLN.setBounds(40,120,180,20);
        txtLN=new JTextField(10);
        txtLN.setBounds(160,120,180,20);
        btnRegister=new JButton("Register");
        btnRegister.setBounds(100,400,100,40);

        lblCourse=new JLabel("Interested Course");
        lblCourse.setBounds(40,180,200,40);

        c1=new JCheckBox("BTECH");
        c1.setBounds(160,180,100,40);
        c2=new JCheckBox("MTECH");
        c2.setBounds(290,180,100,40);

        lblGender=new JLabel("Specify Gender");
        lblGender.setBounds(40,240,200,40);
        g1=new ButtonGroup();
        r1=new JRadioButton("Male");
        r1.setBounds(160,240,100,40);
        r2=new JRadioButton("Female");
        r2.setBounds(290,240,100,40);

        lblOCourse=new JLabel("Online Course");
        lblOCourse.setBounds(40,300,150,40);
        selectCourse=new JComboBox<String>(course);
        selectCourse.setBounds(160,300,90,40);
        g1.add(r1);
        g1.add(r2);
        c.add(lblFN);
        c.add(txtFN);
        c.add(lblLN);
        c.add(txtLN);
        c.add(lblCourse);
        c.add(c1);
        c.add(c2);
        c.add(lblGender);
        c.add(r1);
        c.add(r2);
        c.add(lblOCourse);
        c.add(selectCourse);
        c.add(btnRegister);


    }
}

public class DemoRegister{
    public static void main(String args[]){
        RegistrationPage p=new RegistrationPage();
        p.setTitle("Registration Page");
        p.setLayout(null);
        p.setSize(800,800);
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}