import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentRecord {

	JFrame window;
	Container con;
	JPanel textPanel, inputPanel;
	JLabel textLabel;
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
	JTextField jtf;
	JButton enterB;
	
	
	InputHandler iHandler = new InputHandler();
	
	
	
	
	public static void main(String[] args) {
		
		new StudentRecord();

	}
	
	public StudentRecord()  {
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		textPanel = new JPanel();
		textPanel.setBounds(150, 250, 500, 100);
		textPanel.setBackground(Color.black);
		textLabel = new JLabel("PLEASE ENTER NAME");
		textLabel.setForeground(Color.white);
		textLabel.setFont(normalFont);
		textPanel.add(textLabel);
		con.add(textPanel);
		
		inputPanel = new JPanel();
		inputPanel.setBounds(150, 450, 500, 50);
		inputPanel.setBackground(Color.black);
		inputPanel.setLayout(new GridLayout(1,2));
		
		jtf = new JTextField();
		inputPanel.add(jtf);
		
		enterB = new JButton("Please enter a Name");
		enterB.setForeground(Color.black);
		enterB.addActionListener(iHandler);
		
		
		inputPanel.add(enterB);
		con.add(inputPanel);
		
		window.setVisible(true);
		
		
		
	}
	
	public class InputHandler implements ActionListener{
		
		
		public void actionPerformed(ActionEvent event) {
			
			String text = jtf.getText();
			textLabel.setText(text);
			
			
		}  
	}
	

	
	
	

}
