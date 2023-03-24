package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class StudentRecord {

		
		ChoiceHandler cHandler = new ChoiceHandler();
		UI ui = new UI();
		MyInfo myinfo = new MyInfo();
		
	public static void main(String[] args) {
		
		
		new StudentRecord();
	}
	
	public StudentRecord() {
		ui.createUI(cHandler);
		ui.userTextArea.setText("Welcome to the Student Management System\n\n"
				+ "Please make a selection");
		
	}

	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
		
			String yourChoice = event.getActionCommand();
			
			
			
			
			
			switch(yourChoice) {
			case "c1": 
				
			
			ui.userTextArea.setText("Please enter a name: ");
			/*			
			String text = jtf.getText();
			textLabel.setText(text); */
			
				
			break;
			case "c2": break;
			case "c3": break;
			case "c4": break;
			case "c5": break;
			case "c6": break;
			}
		}
	}
}
