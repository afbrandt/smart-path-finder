import javax.swing.JFrame;
import java.awt.*;

public class PathFinder
{

	public static void displayGUI()
	{
		
		JFrame window = new JFrame("Path Finder");

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setPreferredSize(new Dimension(1050,610));
		
		window.add(new ImageHandler());
		window.setJMenuBar(new MenuHandler());
		window.addMouseListener(new MouseHandler());

		window.pack();
		window.setVisible(true);

	}

	public static void main(String[] args)
	{
		
		displayGUI();
		
	}

}
