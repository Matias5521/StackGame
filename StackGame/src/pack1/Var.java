package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {
	
	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0, backgroundY2 = -600;
	static int backgroundspeed = 12;
	static int PlayerSpeed = 3;
	static int x = 350, y = 425;
	static int speedup = 1, speeddown=2;
	static boolean moveUp = false;
	//static boolean moveDown = false;
	static Label lbl1;
	static LabelTwo lbl2;
	static boolean a, b;
	static int grenzeOben = 385, grenzeUnten = 425;
	
	//Variablen für TitleScreen
	//Erkennung des Aktiven Bildschirms
	static int gameActive = 0;
	static String titleTxt = "StackGame", subtitle = "Made by: Marius, Matias, Thomas...", start = "Start Game", close = "Close Game";
	static int buttonNumber = 0;
	
	//static BufferedImage ib1;
	static BufferedImage ib1;
	static BufferedImage ib2;
	static BufferedImage iplayer;

	public Var() {
		
		try {
			//Hintergrund
			ib1 = ImageIO.read(new File("rsc/b2.1.png"));
			ib2 = ImageIO.read(new File("rsc/b3.png"));
			//Spieler
			iplayer = ImageIO.read(new File("rsc/player.png"));
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
		
	}

}
