import javax.swing.JFrame;
public class Saver 
{
 public static void main(String args[])
 {
	 JFrame frame = new JFrame("Line ScreenSaver");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 Saver1JPanel saver1JPanel = new Saver1JPanel();
	 frame.add(saver1JPanel);
	 frame.setSize(700, 700);
	 frame.setVisible(true);
 }
}
