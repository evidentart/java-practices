package package01;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import package01.StudentRecord.ChoiceHandler;

public class UI {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, choiceButtonPanel, userTextPanel, inputPanel;
	JLabel titleNameLabel, textLabel;
	JTextArea userTextArea;
	JTextField jtf;
	JButton choice1, choice2, choice3, choice4, choice5, choice6, enterA;
	
	
	
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 30);
	Font regularFont = new Font("Times New Roman", Font.PLAIN, 20);
	
	
	public void createUI(ChoiceHandler cHandler) {
		
			window = new JFrame();
			window.setSize(800, 600);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.getContentPane().setBackground(Color.white);
			window.setLayout(null);
			con = window.getContentPane();
	
			titleNamePanel = new JPanel();
			titleNamePanel.setBounds(90, 15, 600, 40);
			titleNamePanel.setBackground(Color.black);
			titleNameLabel = new JLabel("Student Management System");
			titleNameLabel.setForeground(Color.white);
			titleNameLabel.setFont(titleFont);
			titleNamePanel.add(titleNameLabel);
			con.add(titleNamePanel);
//************************************
			userTextPanel = new JPanel();
			userTextPanel.setBounds(90, 70, 600, 240);
			userTextPanel.setBackground(Color.black);
			window.add(userTextPanel);
			con.add(userTextPanel);
			
			userTextArea = new JTextArea("");
			userTextArea.setBounds(90, 90, 600, 200);
			userTextArea.setBackground(Color.black);
			userTextArea.setForeground(Color.white);
			userTextArea.setFont(regularFont);
			userTextArea.setLineWrap(true);
			userTextArea.setWrapStyleWord(true);
			userTextArea.setEditable(false);
			userTextPanel.add(userTextArea);
//******************************************************************

			choiceButtonPanel = new JPanel();
			choiceButtonPanel.setBounds(90, 330, 600, 220);
			choiceButtonPanel.setBackground(Color.black);
			choiceButtonPanel.setLayout(new GridLayout(6,1));
			window.add(choiceButtonPanel);
			con.add(choiceButtonPanel);
			
			choice1 = new JButton("Add Student");
			choice1.setBackground(Color.white);
			choice1.setForeground(Color.black);
			choice1.setFont(regularFont);
			choice1.setFocusPainted(false);
			choice1.addActionListener(cHandler);
			choice1.setActionCommand("c1");
			choiceButtonPanel.add(choice1);
			
			
			choice2 = new JButton("Delete Student");
			choice2.setBackground(Color.white);
			choice2.setForeground(Color.black);
			choice2.setFont(regularFont);
			choice2.setFocusPainted(false);
			choice2.addActionListener(cHandler);
			choice2.setActionCommand("c2");
			choiceButtonPanel.add(choice2);
			
			
			choice3 = new JButton("Update Student");
			choice3.setBackground(Color.white);
			choice3.setForeground(Color.black);
			choice3.setFont(regularFont);
			choice3.setFocusPainted(false);
			choice3.addActionListener(cHandler);
			choice3.setActionCommand("c3");
			choiceButtonPanel.add(choice3);
			

			choice4 = new JButton("Search Student");
			choice4.setBackground(Color.white);
			choice4.setForeground(Color.black);
			choice4.setFont(regularFont);
			choice4.setFocusPainted(false);
			choice4.addActionListener(cHandler);
			choice4.setActionCommand("c4");
			choiceButtonPanel.add(choice4);

			
			choice5 = new JButton("Display Student");
			choice5.setBackground(Color.white);
			choice5.setForeground(Color.black);
			choice5.setFont(regularFont);
			choice5.setFocusPainted(false);
			choice5.addActionListener(cHandler);
			choice5.setActionCommand("c5");
			choiceButtonPanel.add(choice5);

			
			choice6 = new JButton("Exit program");
			choice6.setBackground(Color.white);
			choice6.setForeground(Color.black);
			choice6.setFont(regularFont);
			choice6.setFocusPainted(false);
			choice6.addActionListener(cHandler);
			choice6.setActionCommand("c6");
			choiceButtonPanel.add(choice6); 
			
			
				
//*******************************************
			inputPanel = new JPanel();
			inputPanel.setBounds(150, 450, 500, 50);
			inputPanel.setBackground(Color.black);
			inputPanel.setLayout(new GridLayout(1,2));
			
			jtf = new JTextField();
			inputPanel.add(jtf);
			
			enterA = new JButton("Please enter a Name");
			enterA.setForeground(Color.black);
			enterA.addActionListener(cHandler);
			
			inputPanel.add(enterA);
			con.add(inputPanel);
			
			window.setLocationRelativeTo(null);
			window.setVisible(true); 
}
	

	


	
	

}