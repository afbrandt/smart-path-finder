import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class SimulationHandler
{
	private JFrame window;
	private JPanel selection;
	private ButtonGroup leftGroup, rightGroup;
	
	
	public SimulationHandler()
	{
		generateOptions();
	}

	public void generateOptions()
	{
		window = new JFrame("Configure");
		selection = new JPanel(new BorderLayout());
		leftGroup = new ButtonGroup();
		rightGroup = new ButtonGroup();

		leftGroup.add(new JRadioButton("One"));
		leftGroup.add(new JRadioButton("Two"));

		rightGroup.add(new JRadioButton("A"));
		rightGroup.add(new JRadioButton("B"));

		selection.add(leftGroup, BorderLayout.WEST);
		selection.add(rightGroup, BorderLayout.EAST);

		window.setMinimumSize(new Dimension(300,200));
		window.setAlwaysOnTop(true);
		window.setLocation(200,200);

		window.add(selection);
		window.setVisible(true);
	}
}
