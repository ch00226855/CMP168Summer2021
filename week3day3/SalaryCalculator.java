package week3day3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SalaryCalculator extends JComponent 
		implements ActionListener {
	
	private JLabel label1;
	private JLabel label2;
	private JTextField field1;
	private JTextField field2;
	private JButton button1;
	
	public SalaryCalculator() {
		label1 = new JLabel("Hourly wage:  ");
		label2 = new JLabel("Yearly salary:");
		field1 = new JTextField(15);
		field2 = new JTextField(15);
		button1 = new JButton("Calculate");
		
		setLayout(new GridLayout(3, 2));
		
		setSize(200, 150);
		
		this.add(label1);
		this.add(field1);
		this.add(label2);
		this.add(field2);
		this.add(button1);
		
		button1.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// read the value form field1
		int hourlyWage = Integer.parseInt(field1.getText().trim());
		
		// calculate yearly salary
		int yearlySalary = hourlyWage * 2000;
		
		// display yearly salary in field2
		field2.setText("" + yearlySalary);
		
	}

}
