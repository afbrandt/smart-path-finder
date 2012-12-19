public class Intersection
{

	private final int x, y;
	private int status;

	public Intersection(int x, int y)
	{
		this.x = x;
		this.y = y;
		status = 0;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void setStatus(int s)
	{
		status = s;
	}

	public int getStatus()
	{
		return status;
	}
}
