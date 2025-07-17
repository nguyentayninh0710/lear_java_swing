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
		btnDivide.setBounds(226, 70, 72, 37);
		contentPane.add(btnDivide);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.setBounds(226, 110, 72, 37);
		contentPane.add(btnMultiply);
		
		btnMinus = new JButton("-");
		btnMinus.setBounds(226, 150, 72, 37);
		contentPane.add(btnMinus);
		
		btnSum = new JButton("+");
		btnSum.setBounds(226, 190, 72, 37);
		contentPane.add(btnSum);
		
		btnResult = new JButton("=");
		btnResult.setBounds(226, 230, 72, 37);
		contentPane.add(btnResult);
		
		btnPercent = new JButton("%");
		btnPercent.setBounds(153, 70, 72, 37);
		contentPane.add(btnPercent);
		
		btnnum9 = new JButton("9");
		btnnum9.setBounds(153, 110, 72, 37);
		contentPane.add(btnnum9);
		
		btnnum6 = new JButton("6");
		btnnum6.setBounds(153, 150, 72, 37);
		contentPane.add(btnnum6);
		
		btnnum3 = new JButton("3");
		btnnum3.setBounds(153, 190, 72, 37);
		contentPane.add(btnnum3);
		
		btnComma = new JButton(",");
		btnComma.setBounds(153, 229, 72, 37);
		contentPane.add(btnComma);
		
		btnChangeSign = new JButton("+/-");
		btnChangeSign.setBounds(81, 70, 72, 37);
		contentPane.add(btnChangeSign);
		
		btnnum8 = new JButton("8");
		btnnum8.setBounds(81, 110, 72, 37);
		contentPane.add(btnnum8);
		
		btnnum5 = new JButton("5");
		btnnum5.setBounds(81, 150, 72, 37);
		contentPane.add(btnnum5);
		
		btnnum2 = new JButton("2");
		btnnum2.setBounds(81, 190, 72, 37);
		contentPane.add(btnnum2);
		
		btnAC = new JButton("AC");
		btnAC.setBounds(9, 70, 72, 37);
		contentPane.add(btnAC);
		
		btnnum7 = new JButton("7");
		btnnum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnnum7.setBounds(9, 110, 72, 37);
		contentPane.add(btnnum7);
		
		btnnum4 = new JButton("4");
		btnnum4.setBounds(9, 150, 72, 37);
		contentPane.add(btnnum4);
		
		btnnum1 = new JButton("1");
		btnnum1.setBounds(9, 190, 72, 37);
		contentPane.add(btnnum1);
		
		btnnum0 = new JButton("0");
		btnnum0.setBounds(9, 230, 144, 37);
		contentPane.add(btnnum0);

	}
}
