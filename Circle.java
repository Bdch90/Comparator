package Comparator;

public class Circle {
	private int radius = 1;

	public Circle(){}
	public Circle(int radius)
	{
		this.radius = radius;
	}
	public int getRadius()
	{
		return this.radius;
	}
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	public String toString()
	{
		return "this Circle radius: " + this.getRadius();
	}
}
