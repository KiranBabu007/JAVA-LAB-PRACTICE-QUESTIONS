package University;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GUITempConvert implements ActionListener {
	JFrame f;
    JButton b1,b2,b3;
    JTextField f1;
    JLabel l1,l2,l3;
	public GUITempConvert() {
		f=new JFrame("Temperature Converter");
		f1=new JTextField(10);
		b1=new JButton("Convert");
		b2=new JButton("Reset");
		l1=new JLabel("Temperatre in Celsius:");
		l2=new JLabel("Temperatre in Farenheit:");
		//Displaying the converted value in a label for that setting label with blank text at first
		l3=new JLabel("    ", 10);
		
		f.setSize(500,100);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.add(l1);
		f.add(f1);
		f.add(l2);
		f.add(l3);
		f.add(b1);
		f.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			int c=Integer.parseInt(f1.getText());
			int f=(c*9)/5+32;
			l3.setText(Integer.toString(f));
			
		}
		if(e.getSource()==b2) {
			f1.setText(" ");
			l3.setText(" ");
		}
		
	}
	
public static void main(String[] args) {
		
		new GUITempConvert();

	}
}
