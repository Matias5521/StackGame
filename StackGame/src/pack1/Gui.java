package pack1;

import javax.swing.JFrame;

public class Gui {

	public Gui() {
		
		//Vllt mit Timer lösbar?
		//Erzeugt Bild (JFrame allg.)
		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwidth,Var.screenheight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("StackGame");
		Var.jf1.setResizable(false);
		Var.jf1.addKeyListener(new TastaturEingabe());
		Var.jf1.requestFocus();
		Var.jf1.setVisible(true);		
			
		//Ruft TitleScreen auf
		Var.lbl = new Label();
		Var.lbl.setBounds(0,0, Var.screenwidth, Var.screenheight);
		Var.lbl.setVisible(true);
		Var.jf1.add(Var.lbl);
				
	}
}
