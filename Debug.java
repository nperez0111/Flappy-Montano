package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Debug {
	
	public JFrame frame;
	
	public JTextField grvSpeed;
	public JTextField jumpHeight;
	public JTextField jump;
	public JTextField backgroundSpeed;
	
	public JLabel gS;
	public JLabel jH;
	public JLabel j;
	public JLabel bS;
	
	public JButton start;
	
	public Debug(){
		setupFrame();
		setupLabel();
		setupText();
		setupButton();
		frame.setVisible(true);

	}
	
	public void setupLabel(){
		gS = new JLabel("grvSpeed");
		gS.setBounds(0, 50, 75, 30);
		frame.add(gS);
		jH = new JLabel("jumpHeight");
		jH.setBounds(0, 100, 75, 30);
		frame.add(jH);
		j = new JLabel("jump");
		j.setBounds(0, 150, 75, 30);
		frame.add(j);
		bS = new JLabel("bgSpeed");
		bS.setBounds(0, 200, 75, 30);
		frame.add(bS);
		
	}
	public void setupText(){
		grvSpeed = new JTextField("4");
		grvSpeed.setBounds(75, 50, 150, 30);
		frame.add(grvSpeed);
		jumpHeight = new JTextField("7");
		jumpHeight.setBounds(75, 100, 150, 30);
		frame.add(jumpHeight);
		jump = new JTextField("20");
		jump.setBounds(75, 150, 150, 30);
		frame.add(jump);
		backgroundSpeed = new JTextField("2");
		backgroundSpeed.setBounds(75, 200, 150, 30);
		frame.add(backgroundSpeed);
		
	}
	
	public void setupButton(){
		start = new JButton("Start Debugging");
		start.setBounds(50, 400, 150, 30);
		start.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						Gravity.speed = Integer.parseInt(
								grvSpeed.getText());
						Gravity.jumpHeight = Integer.parseInt(
								jumpHeight.getText());
						Gravity.jump = Integer.parseInt(
								jump.getText());
						Background.backgroundSpeed = Integer.parseInt(
								backgroundSpeed.getText());
						GUI g = new GUI();
						
					}
					
					
					
				}
				);
		
		frame.add(start);
	}
	
	public void setupFrame(){
		frame = new JFrame("Flappy Montano Debugger");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 300, 500);
		frame.setLayout(null);
		
	}
}
