package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class studReg extends JFrame {
JFrame f;
JTextField tf1,tf2,tf3,tf4,tf5,tf6;
JTextArea ta,ta1;
JRadioButton rb1,rb2;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JList li;
DefaultListModel Dlm;
JPasswordField pa;
JButton b;
studReg(){

setTitle("Student registration");
setLayout(new FlowLayout());


l1=new JLabel("Full Name: ");
add(l1);
        tf1= new JTextField(20);
        add(tf1);
       
        l2=new JLabel("Address: ");
add(l2);
ta=new JTextArea(5,20);
add(ta);
l3=new JLabel("Admission Number: ");
add(l3);
tf2=new JTextField(3);
add(tf2);
l3=new JLabel("Gender:");
add(l3);
rb1=new JRadioButton("Male");
add(rb1);
rb2=new JRadioButton("Female");
add(rb2);

l4=new JLabel("Age");
add(l4);
        tf3= new JTextField(2);
        add(tf3);
        l5=new JLabel("Email");
add(l5);
        tf4= new JTextField(8);
        add(tf4);
        l6=new JLabel("Phone");
add(l6);
tf5= new JTextField(8);
add(tf5);
       
Dlm=new DefaultListModel();
Dlm.addElement("Computer Science Engineering");
Dlm.addElement("Civil Engineering");
Dlm.addElement("Mechanical Engineering");
Dlm.addElement("Artificial Intelligence and Data Science");



li = new JList(Dlm);
add(li);

l7=new JLabel("Batch");
add(l7);
tf6= new JTextField(2);
add(tf6);

   l8=new JLabel("Password");
   add(l8);
  pa=new JPasswordField(10);
   add(pa);
   
   b=new JButton("Submit");
   add(b);

setSize(360,400);
setVisible(true);
}

public static void main(String[] args) {

new studReg();


}

}
