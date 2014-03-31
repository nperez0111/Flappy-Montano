package src;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	
	public JFrame frame;
	public JLabel hiScore;
	public JLabel curScore;
	public JLabel bird;
	public JLabel bg;
	public JLabel bg2;
	public JPanel[] pipes;
	public Thread gravity;
	public Thread background;
	
	public GUI(){
		pipes = new JPanel[10];
		setupFrame();
		setupBird();
		setupPipes();
		setupBG();
		frame.setVisible(true);
		gravity = new Thread(new Gravity(frame, bird));
		gravity.start();
		background = new Thread(new Background(bird, pipes, bg, bg2, frame));
		background.start();
	}
	
	public void setupFrame(){
		frame = new JFrame("Flappy Montano");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(0, 0, 800, 600);
		frame.setLayout(null);
		frame.addKeyListener(new Jump(frame));
		
	}
	
	public void setupBird(){
		bird = new JLabel(new ImageIcon(getClass().
				getResource("bird.png")));
		bird.setBounds(400, 300, 50, 50);
		frame.add(bird);
	}
	
	public void setupBG(){
		bg = new JLabel(new ImageIcon(getClass().
				getResource("bg.JPG")));
		bg.setBounds(0, 0, 800, 600);
		frame.add(bg);
		bg2 = new JLabel(new ImageIcon(getClass().
				getResource("bg.JPG")));
		bg2.setBounds(800, 0, 800, 600);
		frame.add(bg2);
	}
	
	public void setupPipes(){
		pipes[0] = new JPanel();
		ImageIcon i = new ImageIcon(getClass().
				getResource("boxtops.png"));
		ImageIcon i2 = new ImageIcon(getClass().
				getResource("boxbod.png"));
		ImageIcon i3 = new ImageIcon(getClass().
				getResource("boxbots.png"));
		pipes[0].setLayout(
				new GridLayout(0,1));
		pipes[0].add(new JLabel(i));
		pipes[0].add(new JLabel(i2));
		pipes[0].add(new JLabel(i3));
		pipes[0].setBounds(600, 412, 100, 150);
		frame.add(pipes[0]);
  	}

}
