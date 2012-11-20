import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class MenuHandler extends JMenuBar
{

	private JMenu first, second, third;

	public MenuHandler()
	{
		super();
		addMenus();	
	}

	public void addMenus()
	{
		add( new MenuHandlerSimulation() );
		add( new MenuHandlerOptions() );
		add( new MenuHandlerHelp() );
	}
}
