package pekan8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 353, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(8, 10, 316, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(89, 91, 73, 71);
		frame.getContentPane().add(btnClear);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(8, 415, 73, 71);
		frame.getContentPane().add(btn0);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(8, 334, 73, 71);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(89, 334, 73, 71);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(170, 334, 73, 71);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(8, 253, 73, 71);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(89, 253, 73, 71);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(170, 253, 73, 71);
		frame.getContentPane().add(btn6);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(8, 172, 73, 71);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(89, 172, 73, 71);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(170, 172, 73, 71);
		frame.getContentPane().add(btn9);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn00.setBounds(170, 91, 73, 71);
		frame.getContentPane().add(btn00);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPlus.setBounds(251, 91, 73, 71);
		frame.getContentPane().add(btnPlus);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first + second;
					answer = String.format("%.2f",  result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first - second;
					answer = String.format("%.2f",  result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first * second;
					answer = String.format("%.2f",  result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first / second;
					answer = String.format("%.2f",  result);
					textField.setText(answer);
				}
				else if(operation == "%")
				{
					result = first % second;
					answer = String.format("%.2f",  result);
					textField.setText(answer);
				}
			}
		});
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.setBounds(251, 172, 73, 71);
		frame.getContentPane().add(btnSub);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMul.setBounds(251, 253, 73, 71);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDiv.setBounds(251, 334, 73, 71);
		frame.getContentPane().add(btnDiv);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPercent.setBounds(251, 415, 73, 71);
		frame.getContentPane().add(btnPercent);
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEquals.setBounds(170, 415, 73, 71);
		frame.getContentPane().add(btnEquals);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDot.setBounds(89, 415, 73, 71);
		frame.getContentPane().add(btnDot);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
						if(textField.getText().length()>0)
						{
							StringBuilder str = new StringBuilder(textField.getText());
							str.deleteCharAt(textField.getText().length()-1);
							textField.setText(backSpace);
						}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 25));
		btnBackspace.setBounds(8, 91, 73, 71);
		frame.getContentPane().add(btnBackspace);
	}

}
