package interfaceGraphique;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Background extends JPanel{
	String pathImage;
	
	public Background(String path) {
		// TODO Auto-generated constructor stub
		pathImage = path;
		
	}
	  public void paintComponent(Graphics g){
		    try {
		      Image img = ImageIO.read(new File(pathImage));
		      //Pour une image de fond
		      g.drawImage(img, 0,0,this.getWidth(), this.getHeight(),  this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }                
		  }    
}