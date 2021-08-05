package week3day3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BuiltInComponentsDemo {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Demo of Built-In Components");
		
		window.setLayout(new FlowLayout());
		
//		window.add(new JLabel("This is a JLabel"));
//		window.add(new JLabel("This is another JLable."));
//		window.add(new JTextField(20));
//		window.add(new JTextField("This is a JTextField."));
//		window.add(new JButton("Click me!"));
		
//		window.add(new JLabel("Hourly wage:   "));
//		window.add(new JTextField(20));
//		window.add(new JLabel("Yearly Salary: "));
//		window.add(new JTextField(20));
//		window.add(new JButton("Calculate"));
		
		SalaryCalculator sc = new SalaryCalculator();
		window.add(sc);
		
		
		window.setSize(350, 150);
//		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

}
