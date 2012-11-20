import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseHandler implements MouseListener
{

	public void mouseClicked(MouseEvent e)
	{
		System.out.printf("Mouse was clicked at %d, %d\n", e.getX(), e.getY());
	}

	public void mouseExited(MouseEvent e)
	{
		System.out.println("Mouse exited.");
	}

	public void mouseEntered(MouseEvent e)
	{
		System.out.println("Mouse entered.");
	}

	public void mouseReleased(MouseEvent e)
	{
		System.out.println("Mouse released.");
	}

	public void mousePressed(MouseEvent e)
	{
		System.out.println("Mouse pressed.");
	}

}
