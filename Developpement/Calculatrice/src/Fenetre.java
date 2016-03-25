import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Fenetre extends JFrame {

	String result = "0";
	public Fenetre() {
		this.setTitle("Calculatrice");
		
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JLabel resultLabel = new JLabel(result);
		
		JPanel boutonEquation = new JPanel();
		boutonEquation.setLayout(new GridLayout(4,3));
		for (int i =0 ;  i < 12 ; i++){
			String type = String.valueOf(i);
			boutonEquation.add(new JButton(type));	
		}
		
		JPanel boutonOp = new JPanel();
		boutonOp.setLayout(new GridLayout(4, 1));
		for (int i =0 ;  i < 4 ; i++){
			String type = String.valueOf(i);
			boutonOp.add(new JButton(type));	
		}
		
		this.setLayout(new BorderLayout());
		this.getContentPane().add(resultLabel, BorderLayout.NORTH );
		this.getContentPane().add(boutonEquation, BorderLayout.CENTER );
		this.getContentPane().add(boutonOp, BorderLayout.EAST );
		

		
		
		
		
		
		this.setVisible(true);
	}
}