package LG06;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;

public class Q1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q1 frame = new Q1();
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
	public Q1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Student Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setToolTipText("");
		panel.setBounds(20, 11, 406, 252);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 21, 63, 21);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Surname:");
		lblNewLabel_2.setBounds(10, 48, 63, 21);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(76, 21, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 48, 96, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Allowed");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(173, 75, 110, 22);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Not Allowed");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(285, 75, 110, 22);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Campus Access Status:");
		lblNewLabel_3.setBounds(10, 79, 157, 18);
		panel.add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 108, 385, 133);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String surname = textField_1.getText();
				String statusMsg = "";

				if (rdbtnNewRadioButton.isSelected()) {
				    statusMsg = "is ALLOWED :)";
				} else {
				    statusMsg = "is NOT ALLOWED!";
				}

				String output = "STUDENT INFORMATION\n"
				        + "*****************************\n"
				        + name + " " + surname + " " + statusMsg;
				        
				textArea.setText(output);
			}
		});
		
		btnNewButton.setBounds(207, 10, 88, 22);
		panel.add(btnNewButton);
	}
}
