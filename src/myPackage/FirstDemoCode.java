package myPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstDemoCode extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNumber1;
	private JTextField textNumber2;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstDemoCode frame = new FirstDemoCode();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstDemoCode() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number 1:");
		lblNewLabel.setBounds(6, 6, 71, 16);
		contentPane.add(lblNewLabel);
		
		textNumber1 = new JTextField();
		textNumber1.setBounds(79, 1, 130, 26);
		contentPane.add(textNumber1);
		textNumber1.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number 2:");
		lblNumber.setBounds(6, 34, 71, 16);
		contentPane.add(lblNumber);
		
		textNumber2 = new JTextField();
		textNumber2.setBounds(79, 29, 130, 26);
		contentPane.add(textNumber2);
		textNumber2.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(6, 62, 203, 26);
		contentPane.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		JButton btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNumber1.getText());
				int num2 = Integer.parseInt(textNumber2.getText());
				int sum = num1 + num2;
				textFieldResult.setText(String.valueOf(sum));
			}
		});
		btnSum.setBounds(6, 100, 62, 29);
		contentPane.add(btnSum);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNumber1.getText());
				int num2 = Integer.parseInt(textNumber2.getText());
				int minus = num1 - num2;
				textFieldResult.setText(String.valueOf(minus));
			}
		});
		btnMinus.setBounds(76, 100, 62, 29);
		contentPane.add(btnMinus);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNumber1.getText());
				int num2 = Integer.parseInt(textNumber2.getText());
				int multiply = num1 * num2;
				textFieldResult.setText(String.valueOf(multiply));
			}
		});
		btnMultiply.setBounds(147, 100, 62, 29);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(textNumber1.getText());
				double num2 = Double.parseDouble(textNumber2.getText());
				double divide = num1 / num2;
				textFieldResult.setText(String.valueOf(divide));
			}
		});
		btnDivide.setBounds(219, 100, 62, 29);
		contentPane.add(btnDivide);

	}
}
