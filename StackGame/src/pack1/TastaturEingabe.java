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
		
		//Wenn TitleScreen aktiv ist...
		if(Var.gameActive==0) {
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				System.out.println("Taste nach oben gedrückt");
				Var.buttonNumber--;
				//Bewirkt flüssigeres Bewegen der Auswahl 
				if(Var.buttonNumber<0) {
					Var.buttonNumber=2;
				}
			} 
			
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				System.out.println("Taste nach unten gedrückt");
				Var.buttonNumber++;
				if(Var.buttonNumber>2) {
					Var.buttonNumber=0;
				}
			}
			
			//Überprüft ob Taste ausgewählt
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				if(Var.buttonNumber==0) {
					System.out.println("Spiel wird gestartet");
					Var.gameActive=1;
				} else if(Var.buttonNumber==1) {
					System.out.println("Spiel wird geschlossen");
					Var.gameActive=2;
				} else if(Var.buttonNumber==2) {
					System.out.println("Settings werden geöffnet");
					Var.gameActive=3;
				}
			}
		}
		
		//Wenn SpielScreen aktiv ist...
		if(Var.gameActive==1) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				Var.moveUp=true;  
				System.out.println("Leertaste gedrückt.");
			} 
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(Var.gameActive==1) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				Var.moveUp=false;
				System.out.println("Leertaste losgelassen.");
			}
		}
    }	
}

