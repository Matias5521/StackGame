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
			 	
			if(Var.moveUp==true){
			    Var.y -= Var.speedup;
			    
			}
			if(Var.moveUp==false) {
				Var.y += Var.speedup;
				if (Var.y<=-590) {
					Var.speedup=0;
				}
			}			
			}
		}, 0, 9);
	}
}

