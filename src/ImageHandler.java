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
		g.drawImage(image, 10, 10, null);
	}
	
	public ImageHandler()
	{
		try
		{
			image = ImageIO.read(new File("images/cambridge-map-small.png"));
		}
		catch (IOException e)
		{
			System.err.println("Error");
		}
	}
}
