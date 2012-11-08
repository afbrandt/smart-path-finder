import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuHandlerOptions extends JMenu
{
	public MenuHandlerOptions()
	{
		super("Options");
		addSelections();
	}

	public void addSelections()
	{
		add(new JMenuItem("Settings"));
		add(new JMenuItem("Debug"));
	}
}
