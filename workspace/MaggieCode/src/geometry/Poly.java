package geometry;

import java.awt.geom.Point2D;
import java.lang.Object;
import java.util.ArrayList;
import java.awt.Polygon;

public class Poly extends Polygon{//declare a subclass, calling the methods from package Polygon

	public Poly(double[] x, double[] y, int nPoints){//declare a constructor with the same format of Package Polygon
		super();//call methods from Package Polygon
	}
	
	public static void main (String args[]){//declare the main method of this class
		double[] x = new double[] {0.0,0.0,4.0};//declare an array. Put the horizontal coordinates of the polygon in it
		double[] y = new double[] {0.0,4.0,0.0};//declare anther array. Put the vertical coordinates of the polygon in it
		ArrayList<Segment> tester = new ArrayList<Segment>();//declare an arrayList. Put the test segments in it

		Point2D testPt = new Point2D.Double(1.0,1.0);//declare an object test point. Initialize it. 
		Point2D endPt = new Point2D.Double(testPt.getX(), Double.MAX_VALUE);//declare an object end point. It has same horizontal coordinate with the test point and any vertical coordinate 
		
		
		Segment Seg = new Segment (testPt, endPt);//declare an object segment with test point and end point
		int nPoints = 3;//declare the number of the vertex of the polygon
		for (int i = 0; i < nPoints ; i++) {//射线跟所有边做一个测试
//			for (int j = 0; j < nPoints; j++) {
				tester.add(new Segment(new Point2D.Double(x[i%nPoints], y[i%nPoints]), new Point2D.Double(x[(i+1)%nPoints], y[(i+1)%nPoints])));
//			}//I did not write this. It means 添加一个新的segment， segment是由连个array里一一对应的点组成的端点来计算的。%5:最后一个点和第一个点??
		}
		int counter = 0;//declare counter to calculate the number of intersections between the ray and the polygon
		for (int i = 0; i < tester.size(); i++) {//tester.size = nPoints
			if (Segment.isIntersected(Seg, tester.get(i)))
				counter++;
		}
		if (counter%2 == 0) {//check if the number of intersection is odd or even number. 
			System.out.println("The point is in the polygon. ");
		}
		else 
			System.out.println("The point is NOT in the polygon. ");
		return;
			
		}	
}


