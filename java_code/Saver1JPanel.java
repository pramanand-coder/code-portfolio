import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Saver1JPanel extends JPanel
{
  private Random generator= new Random();
  
  public void paintComponent(Graphics g)
  {
	  super.paintComponent(g);
	  
	  int x1, y1, x2, y2;
	  long timeStep = System.currentTimeMillis();
	  
	  for(int i=0;i<100;i++)
	  {
		  x1=generator.nextInt(700);
		  y1=generator.nextInt(700);
		  x2=generator.nextInt(700);
		  y2=generator.nextInt(700);
		  g.setColor(new Color(generator.nextInt(256),
				  generator.nextInt(256),generator.nextInt(256)));
		  g.drawLine(x1, y1, x2, y2);
	  }
	  while (System.currentTimeMillis()- timeStep < 1000/60);
	  repaint();
  }
}
