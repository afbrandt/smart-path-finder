import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class MenuHandlerSimulationNewSimulation extends AbstractAction
{

	private SimulationHandler simulator;

	public MenuHandlerSimulationNewSimulation()
	{
		super("New Simulation", null);
	}

	public void actionPerformed(ActionEvent e)
	{
		//JOptionPane.showMessageDialog(null, "New Simulation!");
		simulator = new SimulationHandler();
	}
}
