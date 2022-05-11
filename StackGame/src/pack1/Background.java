package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
	
	Timer back;

	public Background() {
		back = new Timer();
		back.scheduleAtFixedRate(new TimerTask() {
		
		@Override
		public void run() {
			
			//Methode zum Bewegen des Hintergrundes
			
		}
			
		}, 0, Var.backgroundspeed);
	}

}
