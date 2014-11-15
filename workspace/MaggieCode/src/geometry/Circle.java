package geometry;

import java.awt.geom.Point2D;
import java.lang.Math; 
import java.util.ArrayList;

public class Circle{
	public ArrayList<Point2D> points;//declare an ArrayList with type Point2D
	public double num;//declare the number of edges in the figure
	public double radius;//declare the radius
	
	public Circle(double num, double radius){//declare a constructor with two variables num and radius
		this.num = num;//I am not very clear about this. I goodled, it says to distinguish two variables. Not fully understood
		this.radius = radius;
		this.points = new ArrayList<Point2D>();
	}
	
	public static void main(String args[]){//declare main method
		double radius = 5;
		double num = 720;
		double alpha = 360/num;
		System.out.println("The length of each side is: " + alpha);
		
		Circle circle = new Circle(num, radius);//instantiate a circle with type Circle, including to variables
		for (int i = 0; i < circle.num; i++){//calculating coordinates
			double x1, y1;
			x1 = circle.radius  * Math.cos(alpha * i);
			y1 = circle.radius  * Math.sin(alpha * i);

			circle.points.add(new Point2D.Double(x1, y1));
		}
		
		System.out.println("The points construct the circle are: " );
		
		for (int i=0; i<circle.points.size(); i++){
			System.out.println(circle.points.get(i).getX() + ";" + circle.points.get(i).getY());//why we have to use "get(i)"?
		}		
	}
}
