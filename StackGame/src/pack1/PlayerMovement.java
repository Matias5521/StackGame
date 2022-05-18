package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	
Timer movement;

	public PlayerMovement() {
		
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			
		@Override
		public void run() {
			
			//Einzelsprünge fehlen
			if(Var.moveUp==true && Var.y>=Var.grenzeOben){
			    Var.y -= Var.speedup; 
			    // Var.moveUp==false k�nnte auch weg sein, ist nicht zwingend notwendig
			}else if (Var.y<=Var.grenzeUnten && Var.y==Var.grenzeOben) {
				Var.moveUp=false;
			}else if(Var.moveUp==false && Var.y<=Var.grenzeUnten) {
				Var.y += Var.speeddown;
			}
                
			/*if(Var.y==425) {
				Var.a=false;
			} else if(Var.y==385) {
				Var.a=true;
			}
			
			
			if(Var.y>=385 && Var.moveUp==true) {
				Var.y+=Var.speedup;
			} else if(Var.y>=385 && Var.moveUp==false) {
				Var.y-=Var.speeddown;
			}
			*/		
		}
		},0 ,Var.PlayerSpeed);
	}

}

