package interfaceGraphique;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauCompetence extends JPanel{

	
	String pathImage;
	Dimension dim;
	double width;
	double height;
	

	public PanneauCompetence(String path, Dimension dim) {
		// TODO Auto-generated constructor stub
		pathImage = path;
		this.dim = dim;
		this.setPreferredSize(dim);
		width = dim.getWidth();
		height = dim.getHeight();
		
		System.out.println(dim.getWidth());
		System.out.println(dim.getHeight());
		
	}
	  public void paintComponent(Graphics g){
		    try {
		      Image img = ImageIO.read(new File(pathImage));
		      //Pour une image de fond
		      g.drawString("Competence", 10, 20);

		      g.drawImage(img, 0,0, (int) width,(int) height, this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }                
		  } 
}
