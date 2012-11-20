import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuHandlerHelp extends JMenu
{
	public MenuHandlerHelp()
	{
		super("Help");
		addSelections();
	}

	public void addSelections()
	{
		add(new JMenuItem("Quick Start"));
		add(new JMenuItem("README"));
	}
}
