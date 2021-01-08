import javax.swing.JFrame;

public class Calculator {
	public static void main(String args[]){
		CalculatorReader cr = new CalculatorReader("Calculator");
		cr.setVisible(true);
		cr.setSize(240, 170);
		cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cr.setResizable(false);
		cr.setLocationRelativeTo(null);
	}

}
