package Q1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class StudentMain extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    
    // Declared textArea as a class field so action listeners can access it
    private JTextArea textArea;
    JScrollPane scrollPane = new JScrollPane(textArea);
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentMain frame = new StudentMain();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public StudentMain() {
        StudentManagementSystem smsys = new StudentManagementSystem();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 320, 376);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("Name:");
        lblNewLabel_2.setBounds(10, 11, 58, 20);
        contentPane.add(lblNewLabel_2);

        textField = new JTextField();
        textField.setBounds(87, 11, 101, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Id:");
        lblNewLabel.setBounds(10, 50, 58, 20);
        contentPane.add(lblNewLabel);

        textField_1 = new JTextField();
        textField_1.setBounds(87, 50, 101, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Gpa:");
        lblNewLabel_1.setBounds(10, 87, 58, 20);
        contentPane.add(lblNewLabel_1);

        textField_2 = new JTextField();
        textField_2.setBounds(87, 87, 101, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        lblNewLabel_3 = new JLabel("Scholarship:");
        lblNewLabel_3.setBounds(10, 115, 75, 14);
        contentPane.add(lblNewLabel_3);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Yes");
        chckbxNewCheckBox.setBounds(87, 111, 101, 23);
        contentPane.add(chckbxNewCheckBox);

        // Initialized the class field textArea
        textArea = new JTextArea();
        textArea.setBounds(10, 233, 284, 62);
        contentPane.add(textArea);

        btnNewButton = new JButton("Add Student");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                int id = Integer.parseInt(textField_1.getText());
                double gpa = Double.parseDouble(textField_2.getText());
                boolean scholarship = chckbxNewCheckBox.isSelected();

                String result = smsys.addStudent(name, id, gpa, scholarship);
                textArea.setText(result); // Replaced textField_4
            }
        });

        btnNewButton.setBounds(10, 140, 137, 23);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("Display all students");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText(smsys.display()); // Replaced textField_4
            }
        });
        btnNewButton_1.setBounds(157, 140, 137, 23);
        contentPane.add(btnNewButton_1);

        lblNewLabel_4 = new JLabel("Search by Id:");
        lblNewLabel_4.setBounds(10, 174, 85, 17);
        contentPane.add(lblNewLabel_4);

        textField_3 = new JTextField();
        textField_3.setBounds(102, 171, 86, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JButton btnNewButton_2 = new JButton("Search Student");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textField_3.getText());

                Student student = smsys.searchStudent(id);

                if (student != null) {
                    textArea.setText(student.toString()); // Replaced textField_4
                } else {
                    textArea.setText("Student not found!"); // Fixed punctuation
                }
            }
        });

        btnNewButton_2.setBounds(10, 199, 178, 23);
        contentPane.add(btnNewButton_2);
        scrollPane.setBounds(10, 233, 284, 62);
        contentPane.add(scrollPane);
        
        JButton btnNewButton_3 = new JButton("Calculate Average GPA");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double average = smsys.calculateAverageGPA();
                // Matched PDF output string and formatted double to 2 decimal places
                textArea.setText("The average of the students is " + String.format("%.2f", average)); 
            }
        });
        btnNewButton_3.setBounds(10, 306, 284, 23);
        contentPane.add(btnNewButton_3);
    }
}