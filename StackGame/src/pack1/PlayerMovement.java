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
			 	
			    if(Var.moveUp==true) {
				    if(Var.y>0) {
				    	Var.y -= Var.speedup;
				    }
			    }
			}
		}, 0, 9);
	}
}

