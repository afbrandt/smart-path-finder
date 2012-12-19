import java.util.Comparator;

public class GreedyComparator implements Comparator<Hop>
{
	public int compare(Hop h1, Hop h2)
	{	
		return h1.getHopLength() - h2.getHopLength();
	}
}
