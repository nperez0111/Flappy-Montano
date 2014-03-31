package src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Jump implements KeyListener {
	public boolean pressed = false;
	public JFrame frame;
	
	public Jump(JFrame _frame){
		frame = _frame;
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		if(!pressed && k.getKeyChar() == ' '){
			Gravity.isFlying = true;
		}
		pressed = true;
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		pressed = false;
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
