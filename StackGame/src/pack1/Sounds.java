package pack1;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sounds {
	
	//Variablen für Sound
	public static File sound1;
	
	public static float value;
	
	Clip clip;
	
	public Sounds() {
		
		value=0;
		
	}
	
	public void load() {
		
		sound1 = new File("sounds/click-sound.wav");
		
	}
	
	public void play(File sound) {
		
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			
			clip.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
