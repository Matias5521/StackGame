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
				//Muss am Ende weg
				System.out.println("Taste nach oben gedrückt");
				Var.buttonNumber=0;
			} 
			
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				//Muss am Ende weg
				System.out.println("Taste nach unten gedrückt");
				Var.buttonNumber=1;
			}
			
			//Überprüft ob Taste ausgewählt
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				if(Var.buttonNumber==0) {
					//Muss am Ende weg
					System.out.println("Spiel wird gestartet");
					Var.gameActive=1;
				} else if(Var.buttonNumber==1) {
					System.out.println("Spiel wird geschlossen");
					Var.gameActive=2;
				}
			}
		}
		
		//Wenn SpielScreen aktiv ist...
		if(Var.gameActive==1) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				Var.moveUp=true;  
				//Muss am Ende weg
				System.out.println("Leertaste gedrückt.");
			} 
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(Var.gameActive==1) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				Var.moveUp=false;
				//Muss am Ende weg
				System.out.println("Leertaste losgelassen.");
			}
		}
    }	
}

