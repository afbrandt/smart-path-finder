import java.util.LinkedList;

public class Path
{
	private LinkedList<Hop> closedList, finalPath;
	private Intersection endNode;

	public Path(Intersection end)
	{
		endNode = end;
		closedList = new LinkedList<Hop>();
		finalPath = new LinkedList<Hop>();
	}

	public void addNode(Hop node)
	{
		closedList.add(node);
	}

	public boolean endOfLine()
	{
		//return closedList.getLast()
		return true;
	}

	public LinkedList<Hop> generateFinalPath()
	{
		return null;
	}
}
