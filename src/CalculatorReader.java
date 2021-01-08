import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorReader extends JFrame{
	JButton b1, b2, b3, b4, b5;
	JLabel l1, l2;
	JTextField t1, t2;
	int a, b, c;
	eHandler hand = new eHandler();
	
public CalculatorReader (String str){
	super(str);
	setLayout(new FlowLayout());
	b1 = new JButton("+");
	b2 = new JButton("-");
	b3 = new JButton("*");
	b4 = new JButton("/");
	b5 = new JButton("CLEAR");
	l1 = new JLabel("Number 1");
	l2 = new JLabel("Number 2");
	t1 = new JTextField(10);
	t2 = new JTextField(10);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(b5);
	b1.addActionListener(hand);
	b2.addActionListener(hand);
	b3.addActionListener(hand);
	b4.addActionListener(hand);
	b5.addActionListener(hand);
	
}
public class eHandler implements ActionListener{

	public void actionPerformed(ActionEvent ev) {
		try{
			if (ev.getSource()==b1){
				a = Integer.parseInt(t1.getText());
				b = Integer.parseInt(t2.getText());
				c = a+b;
				JOptionPane.showMessageDialog(null, "Your number is " + c);
			}
			if (ev.getSource()==b2){
				a = Integer.parseInt(t1.getText());
				b = Integer.parseInt(t2.getText());
				c = a-b;
				JOptionPane.showMessageDialog(null, "Your number is " + c);
			}
			if (ev.getSource()==b3){
				a = Integer.parseInt(t1.getText());
				b = Integer.parseInt(t2.getText());
				c = a*b;
				JOptionPane.showMessageDialog(null, "Your number is " + c);
			}
			if (ev.getSource()==b4){
				a = Integer.parseInt(t1.getText());
				b = Integer.parseInt(t2.getText());
				c = a/b;
				JOptionPane.showMessageDialog(null, "Your number is " + c);
			}
			if (ev.getSource()==b5){
				t1.setText(null);
				t2.setText(null);
			}
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Please, enter your numbers!");
		}
	}
	
}

}
