package src;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Background implements Runnable {
	
	public JLabel bg;
	public JLabel bg2;
	public JLabel bird;
	public JPanel[] pipes;
	public JFrame frame;
	public int speed = 10;
	public static int backgroundSpeed = 1;
	
	public Background(JLabel _bird, JPanel[] _pipes, JLabel _bg, JLabel _bg2, JFrame _frame){
		bird = _bird;
		pipes = _pipes;
		bg = _bg;
		bg2 = _bg2;
		frame = _frame;
	}
	@Override
	public void run() {
		while(true){
			if(bird.getLocation().x + 50 > 
					pipes[0].getLocation().x  &&
					bird.getLocation().x <
					pipes[0].getLocation().x + 100
					){
				if(bird.getLocation().y + 50 
						> pipes[0].getLocation().y){
				JOptionPane.showMessageDialog(null, "CRASH!");
				frame.dispose();
				frame = null;
				return;
				}
			}
			if(bg.getLocation().x < -799)
				bg.setLocation(800, 0);
			if(bg2.getLocation().x < -799)
				bg2.setLocation(800, 0);
			bg.setLocation(bg.getLocation().x - backgroundSpeed, 
					bg.getLocation().y);
			bg2.setLocation(bg2.getLocation().x - backgroundSpeed, 
					bg2.getLocation().y);
			pipes[0].setLocation(
					pipes[0].getLocation().x - backgroundSpeed,
					pipes[0].getLocation().y);
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
