import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.util.Random;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DungeonCrawl {

	
	
			
			JFrame myFrame;
			Container myCon;
			JPanel titlePanelName, startPanelButton, gameTextPanel, choiceButtonPanel, playerHpPanel,
			wpPanel, playerArmorPanel;
			JLabel titleLabelName, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName, armorLabel,
			armorLabelNumber;
			Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
			Font startText = new Font("Times New Roman", Font.PLAIN, 25);
			Font playerInterface = new Font("Times New Roman", Font.PLAIN, 25);
			JButton startButton, choice1, choice2, choice3, choice4;
			JTextArea gameTextArea;
			int playerHP, monsterHP, trophy, armor, enemyHP;		
			String weapon, position;
			
			Random rand = new Random();
			
			
			TitleScreenHandler myHandler = new TitleScreenHandler();
			ChoiceHandler choiceHandler = new ChoiceHandler();
			
			public static void main(String[] args) {
				
				new DungeonCrawl();

			}
			
		//**********************************************************************************//	
			
			public DungeonCrawl() {
				
				myFrame = new JFrame();
				myFrame.setSize(800,600);
				myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				myFrame.getContentPane().setBackground(Color.black);
				myFrame.setLayout(null);
				myCon = myFrame.getContentPane();
				
				titlePanelName = new JPanel();
				titlePanelName.setBounds(100, 100, 600, 150);
				titlePanelName.setBackground(Color.black);
				titleLabelName = new JLabel("The Dungeon");
				titleLabelName.setForeground(Color.red);
				titleLabelName.setFont(titleFont);
				
				startPanelButton = new JPanel();
				startPanelButton.setBounds(300, 400, 200, 100);
				startPanelButton.setBackground(Color.black);
				
				
				startButton = new JButton(" Start Adventure ");
				startButton.setBackground(Color.black);
				startButton.setForeground(Color.red);
				startButton.setFont(startText);
				startButton.setFocusPainted(false);
				startButton.addActionListener(myHandler);
				
				titlePanelName.add(titleLabelName);
				startPanelButton.add(startButton);
				
				myCon.add(titlePanelName);
				myCon.add(startPanelButton);
				
				myFrame.setVisible(true);
				myFrame.setLocationRelativeTo(null);

			}
			
		//******************************************************************************************//	
			
			public void gameScreen() {
				
				titlePanelName.setVisible(false);
				startPanelButton.setVisible(false);
				
				gameTextPanel = new JPanel();
				gameTextPanel.setBounds(100, 100, 600, 250);
				gameTextPanel.setBackground(Color.black);
				myCon.add(gameTextPanel);
				
				gameTextArea = new JTextArea();
				gameTextArea.setBounds(100, 100, 600, 250);
				gameTextArea.setBackground(Color.black);
				gameTextArea.setForeground(Color.red);
				gameTextArea.setFont(startText);
				gameTextArea.setLineWrap(true);
				gameTextPanel.add(gameTextArea);
				
				choiceButtonPanel = new JPanel();
				choiceButtonPanel.setBounds(250, 350, 300, 150);
				choiceButtonPanel.setBackground(Color.black);
				choiceButtonPanel.setLayout(new GridLayout(4,1));
				myCon.add(choiceButtonPanel);
				startButton.setFocusPainted(false);

				choice1 = new JButton("Choice A");
				choice1.setBackground(Color.black);
				choice1.setForeground(Color.red);
				choice1.setFont(startText);
				choice1.setFocusPainted(false);
				choiceButtonPanel.add(choice1);
				choice1.addActionListener(choiceHandler);
				choice1.setActionCommand("c1");
				
				choice2 = new JButton("Choice B");
				choice2.setBackground(Color.black);
				choice2.setForeground(Color.red);
				choice2.setFont(startText);
				choice2.setFocusPainted(false);
				choiceButtonPanel.add(choice2);
				choice2.addActionListener(choiceHandler);
				choice2.setActionCommand("c2");
				
				choice3 = new JButton("Choice C");
				choice3.setBackground(Color.black);
				choice3.setForeground(Color.red);
				choice3.setFont(startText);
				choice3.setFocusPainted(false);
				choiceButtonPanel.add(choice3);
				choice3.addActionListener(choiceHandler);
				choice3.setActionCommand("c3");
				
				choice4 = new JButton("Choice D");
				choice4.setBackground(Color.black);
				choice4.setForeground(Color.red);
				choice4.setFont(startText);
				choice4.setFocusPainted(false);
				choiceButtonPanel.add(choice4);
				choice4.addActionListener(choiceHandler);
				choice4.setActionCommand("c4");
				
				playerHpPanel = new JPanel();
				playerHpPanel.setBounds(0, 15, 200, 50);
				playerHpPanel.setBackground(Color.black);
				playerHpPanel.setLayout(new GridLayout(1,2));	
				myCon.add(playerHpPanel);
				
				
		//------------------------------		
				playerArmorPanel = new JPanel();
				playerArmorPanel.setBounds(80, 15, 300, 50);
				playerArmorPanel.setBackground(Color.black);
				playerArmorPanel.setLayout(new GridLayout(1,2));
				myCon.add(playerArmorPanel);
				
				armorLabel = new JLabel();
				armorLabel.setFont(playerInterface);
				armorLabel.setForeground(Color.red);
				playerArmorPanel.add(armorLabel);
				
				armorLabelNumber = new JLabel();
				armorLabelNumber.setFont(playerInterface);
				armorLabelNumber.setForeground(Color.red);
				playerArmorPanel.add(armorLabelNumber);
				
		//-----------------------------------------------------------
				wpPanel = new JPanel();
				wpPanel.setBounds(300, 15, 500, 50);
				wpPanel.setBackground(Color.black);
				wpPanel.setLayout(new GridLayout(1,1));	
				myCon.add(wpPanel);
				
				hpLabel = new JLabel();
				hpLabel.setFont(playerInterface);
				hpLabel.setForeground(Color.red);
				playerHpPanel.add(hpLabel);
				
				hpLabelNumber = new JLabel();
				hpLabelNumber.setFont(playerInterface);
				hpLabelNumber.setForeground(Color.red);
				playerHpPanel.add(hpLabelNumber);
			
				weaponLabel = new JLabel();
				weaponLabel.setFont(playerInterface);
				weaponLabel.setForeground(Color.red);
				wpPanel.add(weaponLabel);	
				
				weaponLabelName = new JLabel();
				weaponLabelName.setFont(playerInterface);
				weaponLabelName.setForeground(Color.red);
				wpPanel.add(weaponLabelName);

				playerSetup();
						
			}

		//***************************************************************************************//
			
			public void playerSetup() {
				
				playerHP = 100;
				monsterHP = 50;
				armor = 0;
				weapon = "Sword";
				weaponLabelName.setText("Weapon:  " + weapon);
				hpLabelNumber.setText("Hp:  " + playerHP);
				armorLabelNumber.setText("Armor:  " + armor);
				
				townEntrance();
			}

		//**************************************************************************************//
			
			public void townEntrance() {
				position = "townEntrance";
				gameTextArea.setText("~You are the goblin slayer who makes his living"
						+ " by slaying monsters. You recently heard about a trouble in a village\n"
						+ "called Waterfall and decided to investigate~\n"
						+ "\nGoblin Slayer: This must be the village...\nI need to talk to someone about "
					+ "the contract.");
				
				choice1.setText("Talk to the guard");
				choice2.setText("Attack the guard");
				choice3.setText("Leave the village");
				choice4.setText("");
				
				
			}
		//****************************************************************************************//
			public void acceptContract() {
				position = "acceptContract";
				gameTextArea.setText("Guard: Here take a look...\n\n"
						+ "~Some evil monster taken hold of our fields.\n"
						+ " Anyone who is willing to slay the beast will be rewarded\n"
						+ " 300 golds will be offered if you bring the trophy.~");
				
				choice1.setText("Accept");
				choice2.setText("Decline");
				choice3.setText("");
				choice4.setText("");
			}

			public void acceptChoice() {
				position = "acceptChoice";
				gameTextArea.setText("Guard: Be careful, the beast already claimed many souls...\n"
						+ "Here take this\n"
						+ "~ You gained gambeson.\n"
						+"Armor increased by 25");
				armor = armor + 25;
				
				armorLabelNumber.setText("Armor: " + armor);
				
				choice1.setText("Leave the village");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
				
			}

		//*******************************************************************************************//
			
			public void talkGuard() {
				position = "talkGuard";
				gameTextArea.setText("Guard: Look at what we got here, a goblin slayer...\n"
						+ "Are you here for the contract ?");
				
				if (armor == 25) {
					gameTextArea.setText("Are you still here ?");
					choice1.setText("Nevermind");
					choice2.setText("");
					choice3.setText("");
					choice4.setText("");
				}
				else {
				
				
				choice1.setText("Yes, what do you need ?");
				choice2.setText("Forget it, I'll take my leave");
				choice3.setText("");
				choice4.setText("");
				}
			}
			
		//***********************************************************************************************//

			public void attackGuard() {
				position = "attackGuard";
				gameTextArea.setText("Guard: Big mistake!");
				playerHP = playerHP - 10;
				
				hpLabelNumber.setText("HP:  " + playerHP);
				choice1.setText(">");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
			}
		//********************************************************************************************//
			public void crossRoad() {
				position = "crossRoad";
				gameTextArea.setText("You are at crossroad. \nIf you go south, you can go back to town");
				choice1.setText("Altar of Replenish");
				choice2.setText("Go east");
				choice3.setText("Go south");
				choice4.setText("Go west");
			}
			public void north() {
				position = "north";
				gameTextArea.setText("There is a river. Drink and replenish 20 HP");
				
				
				playerHP = playerHP + 10;
				hpLabelNumber.setText("Hp:  " + playerHP);
				choice1.setText("Go south");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
			}
			public void east() {
				position = "east";
				gameTextArea.setText("While walking in the forest, you found a greatsword...");
				weapon = "Long Sword";
				weaponLabelName.setText("Weapon: " + weapon);
				choice1.setText("Go west");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
			}
			
			
			public void west() {
				position = "west";
				
				gameTextArea.setText("You encounter a monster!");   
				choice1.setText("Fight");
				choice2.setText("Run");
				choice3.setText("");
				choice4.setText("");
				
			}
			
			public void fight() {
				position = "fight";
				gameTextArea.setText("Common Goblin: " + monsterHP + "\n\nMake your next move\nYou can leave"
						+ " and try another way to slay the creature!");
				choice1.setText("Attack");
				choice2.setText("Run");
				choice3.setText("");
				choice4.setText("");
			}
			
			
			public void playerAttack() {
				position = "playerAttack";
					
					int playerDamage = 0;
					
					if(weapon.equals("Sword")) {
						
					playerDamage = new java.util.Random().nextInt(15);
					
					}
					else if(weapon.equals("Long Sword")) {
						
				 	playerDamage = new java.util.Random().nextInt(20);
					}	
						
					gameTextArea.setText("You attacked the goblin and gave " + playerDamage + " damage!");
					
					monsterHP = monsterHP - playerDamage;
					
					choice1.setText(">");
					choice2.setText("");
					choice3.setText("");
					choice4.setText("");
			}
			public void monsterAttack() {
				position = "monsterAttack";
				
				int monsterDamage = 0;
				
				monsterDamage = new java.util.Random().nextInt(15);
				gameTextArea.setText("The goblin attacked you and gave " + monsterDamage + " damage!");
				
				
				if (armor > 0) {
					
					armor = armor - monsterDamage;
					hpLabelNumber.setText("Hp:  " + playerHP);
					armorLabelNumber.setText("Armor:  " + armor);
					
				}
				else {
					
					
					playerHP = playerHP - monsterDamage;
					armor = 0;
					hpLabelNumber.setText("Hp:  " + playerHP);
					armorLabelNumber.setText("Armor:  " + armor);
				}
				
				choice1.setText(">");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
			}
			
			public void win() {
				position = "win";
				gameTextArea.setText("You defeated the goblin and collected the trophy,\n"
						+ "however you can hear strange things deep in the darkness...");
				
				trophy = 1;
				
				choice1.setText("Go east");
				choice2.setText("Perhaps another time");
				choice3.setText("");
				choice4.setText("");
			}
			
			public void lose() {
				position = "lose";
				gameTextArea.setText("You are dead !\n\n <GAME OVER>");
				
				
				choice1.setVisible(false);
				choice2.setVisible(false);
				choice3.setVisible(false);
				choice4.setVisible(false);
			}
			
			public void ending() {
				position = "ending";
				
				gameTextArea.setText("Guard: Nice job witcher, go ahead\nGood luck!");
				choice1.setText(">");
				choice2.setText("");
				choice3.setText("");
				choice4.setText("");
				choice1.setVisible(false);
				choice2.setVisible(false);
				choice3.setVisible(false);
				choice4.setVisible(false);
			}
			

			
			
			
			
			public class TitleScreenHandler implements ActionListener{
				
				public void actionPerformed(ActionEvent event) {
					
					gameScreen();
							
				}
			}

		//********************************************************************************************//
			
			public class ChoiceHandler implements ActionListener{
				
				public void actionPerformed(ActionEvent event) {
					
					String yourChoice = event.getActionCommand();
					
					switch(position) {
					case "townEntrance":
						switch(yourChoice) {
						case "c1": 
							if(trophy == 1) {
								ending();
							}
							else {
								talkGuard();
							}
							break;
						case "c2": attackGuard(); break;
						case "c3": crossRoad(); break;
						}
						break;
					case "talkGuard":
						switch(yourChoice) {
						
				
						case "c1":
							if(armor == 25) {
								townEntrance(); break;
							}
							else {
								acceptContract(); break;
							}
					
						case "c2": townEntrance(); break;
						}
						break;
					case "acceptContract":
						switch(yourChoice) {
						case "c1": acceptChoice(); break;
						case "c2": townEntrance(); break;
						}
						break;
					case "acceptChoice":
						switch(yourChoice) {
						case "c1": crossRoad(); break;
						}
						break;
					case "attackGuard":
						switch(yourChoice) {
						case "c1": townEntrance(); break;
						}
						break;
					case "crossRoad":
						switch(yourChoice) {
						case "c1": 
							if (playerHP > 100) {
								crossRoad(); break;
								
							}
							else {
								north(); break;
							}
						case "c2": east(); break;
						case "c3": townEntrance(); break;
						case "c4": 
							
							if (trophy == 1) {
								crossRoad(); break;
							}else {
								west(); break;
							}
							
							
						}
						break;
					case "north":
						switch(yourChoice) {
						case "c1": 
			
							crossRoad(); break;
						}
						break;
					case "east":
						switch(yourChoice) {
						case "c1": crossRoad(); break;
					}
						break;
					case "west":
						switch(yourChoice) {
						case "c1": fight(); break;
						case "c2": crossRoad(); break;
						}
						break;
					case "fight":
						switch(yourChoice) {
						case "c1": playerAttack(); break;
						case "c2": crossRoad(); break;
						}
						break;
					case "playerAttack":
						switch(yourChoice) {
						case "c1": 
							if(monsterHP <1) {
								win();
							}
							else {
								monsterAttack(); 
							}
							break;
						}
						break;
					case "monsterAttack": 
						switch(yourChoice) {
						case "c1": 
							if(playerHP < 1) {
								lose();
							}
							else {
								fight(); break;
								
							}
						}
						break;
					case "win":
						switch(yourChoice) {
						case "c1": crossRoad();
						
						}
						break;
						
			
					}	
					
				}
			}
		


	}


