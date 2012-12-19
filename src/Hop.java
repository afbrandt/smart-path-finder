public class Hop
{

	private Intersection start, end;
	private int distanceTraveled, distanceToTarget, hopLength, hopStatus;

	public Hop(Intersection s, Intersection e, int dist, Intersection destination)
	{
		start = s; 
		end = e;
		setHopStatus();
		hopLength = getDistance(start, end); 
		distanceTraveled = dist + getHopLength();
		distanceToTarget = getDistance(end, destination);
	}

	public int getDistance( Intersection start, Intersection end)
	{
		int xDist = start.getX() - end.getX();
		int yDist = start.getY() - end.getY();
	
		return (int)Math.round(Math.sqrt(xDist * xDist + yDist * yDist));
	}

	public int getHopLength()
	{
		return hopLength;
	}

	public int getDistanceToTarget()
	{
		return distanceToTarget;
	}

	public int getDistanceTraveled()
	{
		return distanceTraveled;
	}

	public void setHopStatus()
	{
		hopStatus = (start.getStatus() + end.getStatus())/2; 
	}

	public Intersection getEndNode()
	{
		return end;
	}	
}
