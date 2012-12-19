import java.util.Comparator;

public class AStarComparator implements Comparator<Hop>
{
	public int compare( Hop h1, Hop h2 )
	{
		return (h1.getDistanceTraveled() + h1.getDistanceToTarget()) - 
		 	   (h2.getDistanceTraveled() + h2.getDistanceToTarget());
	}
}
