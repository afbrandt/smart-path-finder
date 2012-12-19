import java.util.Comparator;

public class ManhattanComparator implements Comparator<Hop>
{
	public int compare( Hop h1, Hop h2 )
	{
		return h1.getDistanceToTarget() - h2.getDistanceToTarget();
	}
}
