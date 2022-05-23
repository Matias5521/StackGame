package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Background {
	
	Timer back;

	public Background() {
		back = new Timer();
		back.scheduleAtFixedRate(new TimerTask() {
		
		//Methode zum Bewegen des Hintergrundes	
		@Override
		public void run() {
			
			//Nur probeweise
			/*Toleranzbereich 
			if(Var.backgroundspeed<596 && Var.moveUp==true) {
				Var.backgroundY1-=2;
			}else {
				Var.backgroundY1=-600;
			}
			
			if(Var.backgroundspeed<596 && Var.moveUp==false) {
				Var.backgroundY2+=2;
			}else {
				Var.backgroundY2=-600;
			}
			*/
			
		}
			
		}, 0, Var.backgroundspeed);
	}

}
