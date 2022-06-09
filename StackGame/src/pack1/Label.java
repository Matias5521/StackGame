package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BasicStroke;
import java.awt.Stroke;

import javax.swing.JLabel;

public class Label extends JLabel{
	
	//Nicht zwingend notwendig
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		//Ist für Antialiasing zuständig
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		Stroke stroke1 = new BasicStroke(4f); 
		
		//Öffnet TitleScreen
		if(Var.gameActive==0) {
			
			if(Var.i==2 && Var.j==1) {
				Var.gameActive=4;
			}
			
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
		
		//Offnet Spiel
		} else if(Var.gameActive==1) {
			
			//Hintergrund (Wolkenbild)
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
			
			//Spieler (Pinguin)
			g.drawImage(Var.iplayer,Var.x,Var.y, 100, 100, null);
			
			if(Var.buttonNumberGame==1) {
				
				//Pop-up Fenster fürs Leaven
				g.setColor(Color.CYAN);
				g.fillRect(250, 100, 300, 300);
				//g.drawRect(250, 100, 300, 300);
				((Graphics2D) g).setStroke(stroke1);
				g.setFont(getFont().deriveFont(Font.BOLD, 30F));
				g.setColor(Color.BLUE);
				g.drawString(Var.gameQuestion, 310, 190);
				g.drawLine(310, 200, 490, 200);
				g.drawString(Var.gameQuestion2, 310, 240);
				g.drawLine(310, 250, 490, 250);
				//Kasten linksunten
				g.drawLine(250, 300, 550, 300);
				//Kasten rechtsunten
				g.drawLine(400, 300, 400, 400);
				g.drawString(Var.yes, 290, 360);
				g.drawString(Var.no, 450, 360);
				
				//Markiert yes oder no
				if(Var.buttonYN==0) {
					g.drawString("<",270 ,360);
					g.drawString(">",355 ,360);
				}else if(Var.buttonYN==1) {
					g.drawString("<",430 ,360);
					g.drawString(">",500 ,360);
				}
			}
				
		//Schleißt Programm
		} else if(Var.gameActive==2) {
			
			//Schließt alles
			System.exit(0);
			
		//öffnet Settings
		} else if(Var.gameActive==3) {
			
			//Hintergrund (Wolkenbild)
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
			
			//Lautstärke und Steuerung kommt noch und Escape zurück zum Start
			
		//Easteregg
		} else if(Var.gameActive==4) {
			
			//Hintergrund (Wolkenbild)
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null); 
			
			//Spieler (Pinguin)
			g.drawImage(Var.iplayer,350 ,400 , 100, 100, null);

			g.setFont(getFont().deriveFont(Font.BOLD, 50F));
			g.setColor(Color.BLUE);
			((Graphics2D) g).setStroke(stroke1);
			g.drawString(Var.normalTxt, 180, 190);
			g.drawLine(183, 200, 605, 200);
			g.drawString(Var.normalTxt2, 40, 260);
			g.drawLine(43, 270, 740, 270);
			g.drawString(Var.normalTxt3, 250, 330);
			g.drawLine(253, 340, 545, 340);
		}
		
		repaint();
	}

}
