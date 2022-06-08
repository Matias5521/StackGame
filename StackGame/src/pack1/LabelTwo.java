package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class LabelTwo extends JLabel{
	
	//Nicht zwingend notwendig
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		//Ist für Antialiasing zuständig
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Hintergrund (Wolkenbild)
		g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
		g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
		
		//Spieler (Pinguin)
		g.drawImage(Var.iplayer,350 ,275 , 100, 100, null);
		
		//Schatten von Title usw...
		//Vom Titel
		g.setFont(getFont().deriveFont(Font.BOLD, 96F));
		g.setColor(Color.BLACK);
		g.drawString(Var.titleTxt,130 , 200);
		
		//Title usw...
		g.setFont(getFont().deriveFont(Font.BOLD, 96F));
		g.setColor(Color.BLUE);
		g.drawString(Var.titleTxt,125 , 200);
		//Subtitle
		g.setFont(getFont().deriveFont(Font.BOLD, 20F));
		g.drawString(Var.subtitle,200 , 250);
		
		//Spiel starten
		g.setFont(getFont().deriveFont(Font.BOLD, 40F));
		g.drawString(Var.start, 300 , 425);
		
		//Spiel schließen
		g.setFont(getFont().deriveFont(Font.BOLD, 36F));
		g.drawString(Var.close, 304 , 480);
		
		//Settings
		g.drawString(Var.setting,340, 535);
		
		//Prüft ob welcher Button gedrückt und markiert die Auswahl
		if(Var.buttonNumber == 0) {
			g.setFont(getFont().deriveFont(Font.BOLD, 40F));
			g.drawString("<", 270,  425);
			g.drawString(">", 525,  425);
		} else if(Var.buttonNumber == 1) {
			g.drawString("<", 270,  480);
			g.drawString(">", 525,  480);
		} else if(Var.buttonNumber == 2) {
			g.drawString("<", 270,  535);
			g.drawString(">", 525,  535);
		}

		
		repaint();
	}

}
