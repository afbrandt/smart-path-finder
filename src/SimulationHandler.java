import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class SimulationHandler
{
	private JFrame window;
	private JPanel selection;
	private ButtonGroup speedGroup;
	private JRadioButton singleItem;
	private JCheckBox multiItem;


	public SimulationHandler()
	{
		generateOptions();
	}

	public void generateOptions()
	{
		window = new JFrame("Configure");
		selection = new JPanel(new BorderLayout());
		speedGroup = new ButtonGroup();

		singleItem = new JRadioButton("Slow");
		speedGroup.add(singleItem);
		selection.add(singleItem, BorderLayout.EAST);
		
		singleItem = new JRadioButton("Fast");
		speedGroup.add(singleItem);
		selection.add(singleItem, BorderLayout.EAST);

		multiItem = new JCheckBox("A* Algorithm");		
		selection.add(multiItem, BorderLayout.WEST);

		window.setMinimumSize(new Dimension(300,200));
		window.setAlwaysOnTop(true);
		window.setLocation(200,200);

		window.add(selection);
		window.pack();
		window.setVisible(true);
	}
}
