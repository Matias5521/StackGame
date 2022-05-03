package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var {
	
	static JFrame jf1;
	static int screenwidth = 800;
	static int screenheight = 600;
	static int backgroundY1 = 0;
	static int backgroundY2 = -600;
	static int x = 350;
	static int y = 450;

	static boolean moveUp = false;
	static boolean moveLeft = false;
	static boolean moveRight = false;
	static Label lbl1;
	
	static BufferedImage ib1;
	static BufferedImage ib2;
	static BufferedImage iplayer;

	public Var() {
		
		try {
			//Hintergrund
			ib1 = ImageIO.read(new File("rsc/b1.png"));
			ib2 = ImageIO.read(new File("rsc/b2.png"));
			//Spieler
			iplayer = ImageIO.read(new File("rsc/player.png"));
		}catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
		
	}

}
