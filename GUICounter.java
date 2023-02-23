package University;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUICounter implements ActionListener {
	JFrame f;
    JButton b1,b2,b3;
    JTextField f1;
    JLabel l;
    int count=0;
	GUICounter(){
		
	
		
		f=new JFrame("Counter");
		b1=new JButton("UP");
		b2=new JButton("DOWN");
		b3=new JButton("RESET");
		l=new JLabel("OOPJ Lab CSL 203");
		f1=new JTextField(5);
		
		
		f.setLayout(new FlowLayout());
		f.setSize(300,120);
		
		
		f.add(f1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l);
		
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	
	}

	public static void main(String[] args) {
		
		new GUICounter();

	}

	
	public void actionPerformed(ActionEvent e) {
    
		if(e.getSource()==b1) {
			count++;
			f1.setText(Integer.toString(count));
		}
		if(e.getSource()==b2) {
			count--;
			f1.setText(Integer.toString(count));
		}
		if(e.getSource()==b3) {
			count=0;
			f1.setText("0");
		}
	}

}
