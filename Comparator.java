package Comparator;

import java.util.Comparator;

class CircleComparator implements Comparator<Circle>
{
	@Override
	public int compare(Circle c1, Circle c2)
	{
		if (c1.getRadius() > c2.getRadius())
		{
			return 1;
		}
		if (c2.getRadius() > c1.getRadius())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
