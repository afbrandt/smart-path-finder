import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MenuHandlerSimulation extends JMenu
{

	private JMenuItem entry;

	public MenuHandlerSimulation()
	{
		super("Simulation");
		addSelection();
	}

	public void addSelection()
	{
		addNewSimulation();
		addClearSimulation();
	}

	public void addNewSimulation()
	{
		entry = new JMenuItem("New Simulation");
		entry.setAction(new MenuHandlerSimulationNewSimulation());
		add(entry);
	}

	public void addClearSimulation()
	{
		entry = new JMenuItem("Clear Simulation");
		add(entry);
	}
}
