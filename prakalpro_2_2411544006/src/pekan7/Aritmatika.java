package pekan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Aritmatika {

	private JFrame frmAritmatika;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aritmatika window = new Aritmatika();
					window.frmAritmatika.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aritmatika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAritmatika = new JFrame();
		frmAritmatika.setTitle("Aritmatika");
		frmAritmatika.setBounds(100, 100, 283, 320);
		frmAritmatika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAritmatika.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(81, 10, 86, 20);
		frmAritmatika.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 109, 86, 20);
		frmAritmatika.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.setBounds(78, 160, 89, 23);
		frmAritmatika.getContentPane().add(btnNewButton);
		
		JTextArea txtrHasil = new JTextArea();
		txtrHasil.setText("Hasil");
		txtrHasil.setBounds(105, 213, 45, 22);
		frmAritmatika.getContentPane().add(txtrHasil);
		
		textField_2 = new JTextField();
		textField_2.setBounds(81, 246, 86, 20);
		frmAritmatika.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(92, 53, 58, 22);
		frmAritmatika.getContentPane().add(comboBox);
	}
}
