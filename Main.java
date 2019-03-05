package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Circle[] circles = new Circle[3];
		circles[0] = new Circle(3);
		circles[1] = new Circle(4);
		circles[2] = new Circle(2);
		System.out.println("Before:");
		for (Circle circle : circles)
		{
			System.out.println(circle);
		}
		Comparator circleComparator = new CircleComparator();
		Arrays.sort(circles,circleComparator);
		System.out.println("After:");
		for (Circle circle : circles)
		{
			System.out.println(circle);
		}
	}
}
