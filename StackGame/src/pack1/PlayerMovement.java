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
			}else if (Var.y<=425) {
				Var.y += Var.speeddown;
			}
			}
		},0 ,6);
		
	}
}

