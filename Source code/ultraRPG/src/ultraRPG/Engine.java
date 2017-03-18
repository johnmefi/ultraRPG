package ultraRPG;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Engine extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Engine();
	}

	public Engine() {

		super(" Ultra RPG ");

		Player _player = new Player(10, 10, 20, 0, 1);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(null);

		JLabel lblHitPoints = new JLabel("Hit Points: ");
		panel.add(lblHitPoints);
		Dimension dimHitPoints = lblHitPoints.getPreferredSize();
		lblHitPoints.setBounds(18, 20, dimHitPoints.width, dimHitPoints.height);

		JLabel lblGold = new JLabel("Gold: ");
		panel.add(lblGold);
		Dimension dimGold = lblGold.getPreferredSize();
		lblGold.setBounds(18, 46, dimGold.width, dimGold.height);

		JLabel lblExperience = new JLabel("Experience: ");
		panel.add(lblExperience);
		Dimension dimExperience = lblExperience.getPreferredSize();
		lblExperience.setBounds(18, 74, dimExperience.width, dimExperience.height);

		JLabel lblLevel = new JLabel("Level: ");
		panel.add(lblLevel);
		Dimension dimLevel = lblLevel.getPreferredSize();
		lblLevel.setBounds(18, 100, dimLevel.width, dimLevel.height);
		
		JLabel selectAction = new JLabel("Select Action: ");
		panel.add(selectAction);
		Dimension dimSelectAction = selectAction.getPreferredSize();
		selectAction.setBounds(417, 431, 100 , dimSelectAction.width);

		JButton firstButton = new JButton("Test Button");
		panel.add(firstButton);
		Dimension dimFirstButton = firstButton.getPreferredSize();
		firstButton.setBounds(200, 20, dimFirstButton.width, dimFirstButton.height);

		JComboBox cboWeapons = new JComboBox<Weapon>();
		panel.add(cboWeapons);
		cboWeapons.setBounds(500, 465, 60, 30);
		
		JComboBox cboPotions = new JComboBox<HealingPotion>();
		panel.add(cboPotions);
		cboPotions.setBounds(600, 465, 60, 30);
	 
		
		// JTextArea firstTextArea = new JTextArea();
		// panel.add(firstTextArea);
		// @SuppressWarnings("deprecation")
		// Dimension dimFirstTextArea = firstTextArea.preferredSize();
		// firstTextArea.setBounds(88, 20, 15 , 15 );
		//

		JTextField firstTextField = new JTextField();

		JFormattedTextField firstFormattedField = new JFormattedTextField();
		panel.add(firstFormattedField);
		Dimension dimFirstFormatted = firstFormattedField.getPreferredSize();
		firstFormattedField.setBounds(95, 20, 30, 15);

		JTextField secondField = new JTextField();
		panel.add(secondField);
		secondField.setBounds(95, 46, 30, 15);

		JTextField thirdField = new JTextField();
		panel.add(thirdField);
		thirdField.setBounds(95, 74, 30, 15);

		JTextField forthField = new JTextField();
		panel.add(forthField);
		forthField.setBounds(95, 100, 30, 15);

		firstFormattedField.setText(Integer.valueOf(_player.CurrentHitPoints).toString());
		secondField.setText(Integer.valueOf(_player.gold).toString());
		thirdField.setText(Integer.valueOf(_player.experiencePoints).toString());
		forthField.setText(Integer.valueOf(_player.level).toString());

		panel.add(firstTextField);
		Dimension dimFirstTextField = firstTextField.getPreferredSize();
		firstTextField.setBounds(88, 20, dimFirstTextField.width, dimFirstTextField.width);

		frame.setSize(750, 670);
		frame.setVisible(true);

		Location location = new Location(1, "Home", "This is your house.", null, null, null);

	}

}
