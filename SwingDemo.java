package Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo implements ActionListener {
	JButton b1,b2;
	JTextField tf;
	String str;
	
	SwingDemo(){
	JFrame f=new JFrame("Sample");
	tf=new JTextField(15);
	b1=new JButton("B1");
	b2=new JButton("B2");
	JPanel p=new JPanel();
	p.setLayout(new FlowLayout());
	p.add(tf);
	p.add(b1);
	p.add(b2);
	f.add(p);
	
	f.setSize(200,300);
	f.setVisible(true);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	tf.addActionListener(this);
	
	}
	
	

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
		 // str=tf.getText();
		  System.out.println(tf.getText());
		}
	}


	public static void main(String[] args) {
		new SwingDemo();
		

	}


	

}
