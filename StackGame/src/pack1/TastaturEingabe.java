package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//Überwacht Bewegungszustand der notwendigen Tasten
public class TastaturEingabe implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_W) {
			Var.moveUp=true;
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			Var.moveLeft=true;
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			Var.moveRight=true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_W) {
			Var.moveUp=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			Var.moveLeft=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
			Var.moveRight=false;
		}
		
	}

	

}
