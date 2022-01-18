package ergasia;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Gui{
	public static void main(String[] args) {
		int epipedo = Integer.parseInt(JOptionPane.showInputDialog("Epilekste Epipedo (1 , 2 , 3)"));
		if ( epipedo == 1 || epipedo == 2 || epipedo == 3) {
			JOptionPane.showMessageDialog(null, "Epileksate to epipedo " + epipedo);
			
			String apantisi = JOptionPane.showInputDialog("EPIPEDO " + epipedo + "\n Erotisi 1");
			JOptionPane.showMessageDialog(null, "H apadhsh " + apantisi + " einai " + "swsth/lathos");
		} else {	    
			       JFrame errorframe = new JFrame("Lathos epipedo!");
			       errorframe.getContentPane().setBackground(Color.LIGHT_GRAY);
			       errorframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			       errorframe.setResizable(false);
			       errorframe.setSize(420,420);
			       errorframe.setVisible(true);
		}
		
	}

}
