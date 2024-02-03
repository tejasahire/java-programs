import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class LoginS1 extends JFrame
{
LoginS1(String s1)
{
super(s1);
}
LoginS1()
{
}
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1,b2,b3;
void setComponents()
{

l1=new JLabel("USERNAME");
l2=new JLabel("PASSWORD");
l3=new JLabel();

t1=new JTextField();
t2=new JTextField();

b1=new JButton("Login");
b2=new JButton("Clear");
b3=new JButton("Add");

setLayout(null);
add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);

l1.setBounds(200,200,120,25);
l2.setBounds(200,400,120,25);
l3.setBounds(200,650,120,25);
t1.setBounds(500,200,120,25);
t2.setBounds(500,400,120,25);
b1.setBounds(150,530,120,25);
b2.setBounds(400,530,120,25);
b3.setBounds(550,530,120,25);

b1.addActionListener(new Login());
b2.addActionListener(new CL());
b3.addActionListener(new Add());

}
class Add implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
try
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a+b;
l3.setText("Addition is "+c);
}
catch(Exception e2)
{

}
}
}

class Login implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
String s1=t1.getText();
String s2=t2.getText();
if(s1.equals("admin") && s2.equals("12345"))
{
l3.setText("Login Successful");
}
else if(s1.equals("")  && s2.equals(""))
{
l3.setText("Enter Username and Password");
}
else
{
l3.setText("Login UnSuccessful");
}
}
}

class CL implements ActionListener
{
public void actionPerformed(ActionEvent e1)
{
t1.setText("");
t2.setText("");
l3.setText("");

}

}

public static void main(String []args)
{

LoginS1 l1=new LoginS1("Welcome to Login Page.");
l1.setVisible(true);
l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1.setSize(900,750);
l1.setComponents();
}
}