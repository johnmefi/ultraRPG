package ultraRPG_final;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class UltraRPGmain extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UltraRPGmain urpg = new UltraRPGmain();
		
		urpg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		urpg.repaint();
	}
	
	public UltraRPGmain(){
		JFrame startUp = new JFrame("Startup Window");
		startUp.setSize(600,600);
		startUp.setVisible(true);
		startUp.setLayout(new BorderLayout());
		
		JPanel buttons = new JPanel();
		
		
		//new jframe here
		JFrame frame1 = new JFrame("Dummy Window");
		frame1.setSize(600, 600);
		frame1.setVisible(true);
		frame1.setLayout(new BorderLayout());
		
		//JPanel declared here.
		

		
		//new buttons
		JButton newGame = new JButton("New Game");
		
		buttons.add(newGame);
		
		JButton loadGame = new JButton("Load Game");
		buttons.add(loadGame);
		
		JButton settings = new JButton("Settings");
		buttons.add(settings);
		
		JButton credits = new JButton("Credits");	
	    buttons.add(credits);
	    
	    frame1.add(buttons, BorderLayout.CENTER);
		}
	
	    
	}
