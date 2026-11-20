package LG06;

import javax.swing.ImageIcon;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Q2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q2 frame = new Q2();
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
	public Q2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Member Name Surname:");
		lblNewLabel.setBounds(10, 11, 150, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(194, 11, 175, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gym:");
		lblNewLabel_1.setBounds(10, 42, 48, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("VIP cost: 500.0 TL");
		lblNewLabel_2.setBounds(204, 42, 113, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(282, 71, 144, 53);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon("src/gymfit.png"));
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedGym = (String) comboBox.getSelectedItem();
				
				if(selectedGym.equalsIgnoreCase("Sports International")) {
					lblNewLabel_2.setText("VIP cost: 1000.0 TL");
					lblLogo.setIcon(new ImageIcon("src/sportsINT.png"));
				}
				else if(selectedGym.equalsIgnoreCase("MacFit")) {
					lblNewLabel_2.setText("VIP cost: 850.0 TL");
					lblLogo.setIcon(new ImageIcon("src/macfit.png"));
				}
				else if(selectedGym.equalsIgnoreCase("GymFit")) {
					lblNewLabel_2.setText("VIP cost: 500.0 TL");
					lblLogo.setIcon(new ImageIcon("src/gymfit.png"));
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GymFit", "Sports International", "MacFit"}));
		comboBox.setBounds(68, 40, 125, 22);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("VIP");
		chckbxNewCheckBox.setBounds(372, 40, 58, 22);
		contentPane.add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Academic");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 67, 80, 22);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Student");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(100, 67, 72, 22);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(189, 69, 80, 22);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 135, 420, 117);
		contentPane.add(textArea);

		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String selectedGym = (String) comboBox.getSelectedItem();
				boolean isVip = chckbxNewCheckBox.isSelected();

				double baseFee = 0;
				double finalFee = 0;
				double vipRaise = 0;

				if (selectedGym.equals("Sports International")) {
				    baseFee = 75000;
				    vipRaise = 1000;
				} else if (selectedGym.equals("Gym Fit")) {
				    baseFee = 52000;
				    vipRaise = 500;
				} else if (selectedGym.equals("Mac Fit")) {
				    baseFee = 65000;
				    vipRaise = 850;
				}

				if (selectedGym.equals("Sports International")) {
				    if (rdbtnNewRadioButton.isSelected()) {
				        finalFee = baseFee - (baseFee * 0.58);
				    } else if (rdbtnNewRadioButton_1.isSelected()) {
				        finalFee = baseFee - (baseFee * 0.38);
				    } else if (rdbtnNewRadioButton_2.isSelected()) {
				        finalFee = baseFee - (baseFee * 0.03);
				    }
				} else if (selectedGym.equals("Gym Fit")) {
				    if (rdbtnNewRadioButton.isSelected()) { 
				        finalFee = baseFee - (baseFee * 0.20);
				    } else if (rdbtnNewRadioButton_1.isSelected()) { 
				        finalFee = baseFee - (baseFee * 0.10);
				    } else if (rdbtnNewRadioButton_2.isSelected()) { 
				        finalFee = baseFee - (baseFee * 0.05);
				    }
				} else if (selectedGym.equals("Mac Fit")) {
				    if (rdbtnNewRadioButton.isSelected()) { 
				        finalFee = baseFee - (baseFee * 0.06);
				    } else if (rdbtnNewRadioButton_1.isSelected()) { 
				        finalFee = baseFee - (baseFee * 0.035);
				    } else if (rdbtnNewRadioButton_2.isSelected()) { 
				        finalFee = baseFee; 
				    }
				}

				if (isVip) {
				    finalFee += vipRaise;
				}

				String output = "Member name : " + name + "\n"
				              + "VIP : " + isVip + "\n"
				              + "Fee: " + finalFee + "TL";
				              
				textArea.setText(output);
			}
		});
		btnNewButton.setBounds(110, 96, 137, 22);
		contentPane.add(btnNewButton);
	}
}
