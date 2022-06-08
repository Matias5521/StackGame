package pack1;

import javax.swing.JFrame;

public class Gui {

	//private static final String Color_BLUE = null;

	public Gui() {
		
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
		Var.lbl2 = new LabelTwo();
		Var.lbl2.setBounds(0,0, Var.screenwidth, Var.screenheight);
		Var.lbl2.setVisible(true);
		Var.jf1.add(Var.lbl2);
		
		//Ruft SpielScreen auf
		if(Var.gameActive==1) {
			Var.lbl1 = new Label();
			Var.lbl1.setBounds(0,0, Var.screenwidth, Var.screenheight);
			Var.lbl1.setVisible(true);
			Var.jf1.add(Var.lbl1);
		} else if(Var.gameActive==2) {
			System.exit(0);
		}
	}

}
