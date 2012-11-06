import javax.imageio.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;

public class ImageHandler extends Component
{

	BufferedImage image;

	public void paint(Graphics g)
	{
		g.drawImage(image, 0, 0, null);
	}
	
	public ImageHandler()
	{
		try
		{
			image = ImageIO.read(new File("boston.jpg"));
		}
		catch (IOException e)
		{
			System.err.println("Error");
		}
	}
}
