package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//�berwacht Bewegungszustand der notwendigen Tasten
public class TastaturEingabe implements KeyListener {

	//private Sounds music;
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		//music.load();
		if(e.getKeyCode()==KeyEvent.VK_M) {
			Var.i+=1;
		}
		
        if(e.getKeyCode()==KeyEvent.VK_T) {
        	Var.j+=1;
        }
		
		//Wenn TitleScreen aktiv ist...
		if(Var.gameActive==0) {
			if(e.getKeyCode()==KeyEvent.VK_UP || e.getKeyCode()==KeyEvent.VK_W) {
				System.out.println("Taste nach oben oder W gedr�ckt");
				Var.buttonNumber--;
				//Bewirkt fl�ssigeres Bewegen der Auswahl 
				if(Var.buttonNumber<0) {
					Var.buttonNumber=2;
				}
			} 
			
			if(e.getKeyCode()==KeyEvent.VK_DOWN || e.getKeyCode()==KeyEvent.VK_S) {
				System.out.println("Taste nach unten oder S gedr�ckt");
				Var.buttonNumber++;
				if(Var.buttonNumber>2) {
					Var.buttonNumber=0;
				}
			}
			
			//�berpr�ft ob Taste ausgew�hlt
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				//music.play(Sounds.sound1);
				if(Var.buttonNumber==0) {
					System.out.println("Spiel wird gestartet");
					Var.gameActive=1;
				} else if(Var.buttonNumber==1) {
					System.out.println("Spiel wird geschlossen");
					Var.gameActive=2;
				} else if(Var.buttonNumber==2) {
					System.out.println("Settings werden ge�ffnet");
					Var.gameActive=3;
				}
			}
		//Wenn SpielScreen aktiv ist...
		} else if(Var.gameActive==1) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE || e.getKeyCode()==KeyEvent.VK_W || e.getKeyCode()==KeyEvent.VK_UP) {
				Var.moveUp=true;  
				System.out.println("Leertaste oder W oder Pfeiltaste nach oben gedr�ckt.");
			} 
			
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				System.out.println("Escape gedr�ckt");
				Var.buttonNumberGame=1;
				
			//W�hlt yes oder no aus
			}else if(e.getKeyCode()==KeyEvent.VK_ENTER) {
	            if(Var.buttonYN==0) {
	            	System.out.println("YES ausgew�hlt");
	            	Var.gameActive=0;
	            	Var.buttonNumberGame=0;
	            }else if(Var.buttonYN==1) {
	            	System.out.println("NO ausgew�hlt");
	            	Var.buttonNumberGame=0;
	            }
	        }
			
			//Markiert Yes
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				System.out.println("Taste nach links gedr�ckt");
				Var.buttonYN++;
				//f�r einen "Durchlauf" bei Markierung
				if(Var.buttonYN>1) {
					Var.buttonYN=0;
				}
			}
			
			//Markiert No
            if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
            	System.out.println("Taste nach rechts gedr�ckt");
            	Var.buttonYN--;
            	//f�r einen "Durchlauf" bei Markierung
            	if(Var.buttonYN<0) {
            		Var.buttonYN=1;
            	}
			}
		} else if(Var.gameActive==3) {
			//Geht zum Startmen� zur�ck
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				Var.gameActive=0;
				System.out.println("Settings verlassen");
			}
				
		} else if(Var.gameActive==4) {
			//Geht zum Startmen� zur�ck
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				Var.gameActive=0;
			}
				
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		//Wenn SpielScreen aktiv ist...
		if(Var.gameActive==1) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE || e.getKeyCode()==KeyEvent.VK_W || e.getKeyCode()==KeyEvent.VK_UP) {
				Var.moveUp=false;
				System.out.println("Leertaste oder W oder Pfeiltaste nach oben losgelassen.");
			}
		}
    }	
}

