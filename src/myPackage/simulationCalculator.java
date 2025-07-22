package myPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class simulationCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNumber;
	private JButton btnMinus;
	private JButton btnSum;
	private JButton btnResult;
	private JButton btnPercent;
	private JButton btnnum9;
	private JButton btnnum6;
	private JButton btnnum3;
	private JButton btnComma;
	private JButton btnChangeSign;
	private JButton btnnum8;
	private JButton btnnum5;
	private JButton btnnum2;
	private JButton btnAC;
	private JButton btnnum7;
	private JButton btnnum4;
	private JButton btnnum1;
	private JButton btnnum0;
	private String calculatorString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simulationCalculator frame = new simulationCalculator();
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
	public simulationCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textNumber = new JTextField();
		textNumber.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		textNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		textNumber.setText("0");
		textNumber.setBounds(11, 6, 285, 65);
		contentPane.add(textNumber);
		textNumber.setColumns(10);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnDivide.getText());
			}
		});
		btnDivide.setBounds(226, 70, 72, 37);
		contentPane.add(btnDivide);

		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnMultiply.getText());
			}
		});
		btnMultiply.setBounds(226, 110, 72, 37);
		contentPane.add(btnMultiply);

		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnMinus.getText());
			}
		});
		btnMinus.setBounds(226, 150, 72, 37);
		contentPane.add(btnMinus);

		btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnSum.getText());
			}
		});
		btnSum.setBounds(226, 190, 72, 37);
		contentPane.add(btnSum);

		btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorString = convertCharacter(textNumber.getText());
				System.out.println(calculatorString);
			}
		});
		btnResult.setBounds(226, 230, 72, 37);
		contentPane.add(btnResult);

		btnPercent = new JButton("%");
		btnPercent.setBounds(153, 70, 72, 37);
		contentPane.add(btnPercent);

		btnnum9 = new JButton("9");
		btnnum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum9.getText());
			}
		});
		btnnum9.setBounds(153, 110, 72, 37);
		contentPane.add(btnnum9);

		btnnum6 = new JButton("6");
		btnnum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum6.getText());
			}
		});
		btnnum6.setBounds(153, 150, 72, 37);
		contentPane.add(btnnum6);

		btnnum3 = new JButton("3");
		btnnum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum3.getText());
			}
		});
		btnnum3.setBounds(153, 190, 72, 37);
		contentPane.add(btnnum3);

		btnComma = new JButton(",");
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnComma.getText());
			}
		});
		btnComma.setBounds(153, 229, 72, 37);
		contentPane.add(btnComma);

		btnChangeSign = new JButton("+/-");
		btnChangeSign.setBounds(81, 70, 72, 37);
		contentPane.add(btnChangeSign);

		btnnum8 = new JButton("8");
		btnnum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum8.getText());
			}
		});
		btnnum8.setBounds(81, 110, 72, 37);
		contentPane.add(btnnum8);

		btnnum5 = new JButton("5");
		btnnum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum5.getText());
			}
		});
		btnnum5.setBounds(81, 150, 72, 37);
		contentPane.add(btnnum5);

		btnnum2 = new JButton("2");
		btnnum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum2.getText());
			}
		});
		btnnum2.setBounds(81, 190, 72, 37);
		contentPane.add(btnnum2);

		btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorString = "0";
				textNumber.setText(calculatorString);  
				
			}
		});
		btnAC.setBounds(9, 70, 72, 37);
		contentPane.add(btnAC);

		btnnum7 = new JButton("7");
		btnnum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum7.getText());
			}
		});
		btnnum7.setBounds(9, 110, 72, 37);
		contentPane.add(btnnum7);

		btnnum4 = new JButton("4");
		btnnum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum4.getText());
			}
		});
		btnnum4.setBounds(9, 150, 72, 37);
		contentPane.add(btnnum4);

		btnnum1 = new JButton("1");
		btnnum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum1.getText());
			}
		});
		btnnum1.setBounds(9, 190, 72, 37);
		contentPane.add(btnnum1);

		btnnum0 = new JButton("0");
		btnnum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumbertoMonitor(btnnum0.getText());
			}
		});
		btnnum0.setBounds(9, 230, 144, 37);
		contentPane.add(btnnum0);

	}
	
	public void addNumbertoMonitor(String num) {
		
		// Get current screen content 
		// get text from the textNumber (screen), store it to the calculator string
		
		calculatorString = textNumber.getText();   
		System.out.println(calculatorString);
		
		//When the screen shows 0
		
		if (calculatorString.equals("0")) {				//when screen show 0
			if (Character.isDigit(num.charAt(0))) {		//if the input is a digit,  (charAt(0) = first character in string) 
				calculatorString = num;					//
				textNumber.setText(calculatorString);
				return;
			}
			else if (num.equals("-")) {
				calculatorString = "-";
				textNumber.setText(calculatorString);
				return;
			} else if(num.equals(",")) {
				calculatorString += num;
				textNumber.setText(calculatorString);
				return;
			}
		}
		
		
		if (calculatorString.equals("-")) {
			if (Character.isDigit(num.charAt(0))) {
				calculatorString += num;
				textNumber.setText(calculatorString);
			}else {
				return;
			}
			return;
		}
		
		if(num.equals(",")) {
			for(int i = calculatorString.length() - 1; i >= 0; i--) {
				if(calculatorString.charAt(i) == ',') {
					return;
				}
				if(!Character.isDigit(calculatorString.charAt(i))) {
					break;
				}
			}
		}
		
		char lastItem = calculatorString.charAt(calculatorString.length() -1);
		if(Character.isDigit(lastItem)) {
			if (calculatorString.equals("0")) {
				calculatorString = num;
			} else {
				calculatorString += num;
			}
			textNumber.setText(calculatorString);
		}else {
			switch (lastItem) {
			case '+':
			case '-':
			case 'x':
			case '/':{
				
				if(num.equals(",")) {
					return;
				}
				
				if(calculatorString.length() > 1) {
				
					if(num.equals("+") || num.equals("-") || num.equals("x") || num.equals("/")) { // STRING "" | CHAR ''
						System.out.println("old: " + calculatorString);
						calculatorString = calculatorString.substring(0,calculatorString.length() -1 ) + num;
						System.out.println("new: " + calculatorString);
						textNumber.setText(calculatorString);
					} else {
						calculatorString += num;
						textNumber.setText(calculatorString);
					}
					break;
				}
			}
			case ',': {
				if(num.equals(",") || num.equals("+") || num.equals("-") || num.equals("x") || num.equals("/")) {
					return;
				}
				
			
			}
			default: {
				calculatorString += num;
				textNumber.setText(calculatorString);
				break;
			}
		}
	}
		
		
}
	
	public String convertCharacter(String txtNumber) {
		txtNumber = txtNumber.replace('x', '*').replace(',', '.');
		return txtNumber;
	}
}
