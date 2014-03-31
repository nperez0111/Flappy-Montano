package src;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gravity implements Runnable {

	public JFrame frame;
	public JLabel bird;
	public static final int maxHeight = -50;
	public static int speed = 1;
	public static int jump = 1;
	public static int jumpHeight = 10;
	public static boolean isFlying = false;

	public Gravity(JFrame _frame, JLabel _bird) {
		frame = _frame;
		bird = _bird;
	}

	public void run() {
		while(bird.getLocation().y < frame.getHeight() - 88){
			if(!isFlying){
				bird.setLocation(bird.getLocation().x, 
				++bird.getLocation().y);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else{
				for(int i = 0; i < 10; i++){
					if(bird.getLocation().y < maxHeight)
						break;
				bird.setLocation(bird.getLocation().x, 
							bird.getLocation().y - jumpHeight);
					try {
						Thread.sleep(jump);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				isFlying = false;
			}
		}
	}

}
