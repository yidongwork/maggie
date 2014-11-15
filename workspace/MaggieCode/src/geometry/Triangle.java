package geometry;//under the package of geometry//

import java.awt.geom.Point2D;//import the Point2D package from java.awt.geom.//

public class Triangle {//declare a class named Triangle//
	private Point2D pointA;//declare a pointA privately in Point2D//
	private Point2D pointB;//declare a pointB privately in Point2D//
	private Point2D pointC;//declare a pointC privately in Point2D//
	
	private double segmentA;//declare a segmentA privately in "double" type//
	private double segmentB;//declare a segmentB privately in "double" type//
	private double segmentC;//declare a segmentC privately in "double" type//
	
	public Triangle (Point2D ptA, Point2D ptB, Point2D ptC){//declare a constructor and call the function from three points in Point2D. A constructor share the same name with the class and has no return value// 
		this.pointA = ptA;//"this." refers to Point2D function. Assign a local variable ptA with Point2D function//
		this.pointB = ptB;//Assign a local variable ptB with Point2D function//
		this.pointC = ptC;//Assign a local variable ptC with Point2D function//
	}
	
	public double calculateLength(){//declare function named calculateLength in "double" type//
		double edge_length;//declare a local variable named edge_length in "double" type//
		
		segmentA = Math.sqrt(Math.pow((this.pointB.getX() - this.pointC.getX()), 2) + Math.pow((this.pointB.getY() - this.pointC.getY()), 2) );
		segmentB = Math.sqrt(Math.pow((this.pointA.getX() - this.pointC.getX()), 2) + Math.pow((this.pointA.getY() - this.pointC.getY()), 2) );
		segmentC = Math.sqrt(Math.pow((this.pointA.getX() - this.pointB.getX()), 2) + Math.pow((this.pointA.getY() - this.pointB.getY()), 2) );
		//calculate the length of three segments with package Math//
		
		edge_length = segmentA + segmentB + segmentC;//local variable edge_length is the sum of three segments//
		
		return edge_length;//return the value of local variable edge_length//
	}//this is the end of function calcualteLength//
	
	public double getArea(double edge_length){//declare a function named "getArea" and call the variable of edge_length//
		double area = 0;//declare a local variable named "area", assign the initial value 0 to this variable//
		if(segmentA + segmentB <= segmentC || segmentB + segmentC <= segmentA || segmentC + segmentA <= segmentB){//this "if" condition determines whether three segments can construct a triangle //
			System.out.println("These three segments cannot form a trangle.");//if the previous conditions are fulfilled, no triangle could be built//
		}else{//if the previous conditions are not fulfilled, continue from conditions in "else"//
	
			double p = edge_length/2;//declare a local variable named p under type "double". p is equal to half of the value of edge_length//
			area = Math.sqrt(p * (p-segmentA) * (p-segmentB) * (p-segmentC));//assign an equation for local variable area to calculate the area of a triangle//
		}	
		return area;//return local variable area//
	}//this is the end of function getArea//
	
	public static void main(String [] args){//declare the main method of this class//
		Point2D ptA = new Point2D.Double(2, 2);//declare a local variable name ptA with type "Point2D", assign memory space and an actual instance (2, 2) to this local variable using "new", so that we could use this local variable in main function//
		Point2D ptB = new Point2D.Double(10, 6);
		Point2D ptC = new Point2D.Double(8, 6);
	
		
		
		Triangle triangle = new Triangle (ptA, ptB, ptC);//declare a constructor with type "Triangle" and name it "triangle". In this function, it calls from local variables ptA, ptB, ptC//
		double sumOfEdge = triangle.calculateLength();//declare a local double variable named sumOfEdge and call the function from calculateLength//
		double area = triangle.getArea(sumOfEdge);//declare a local double variable named area and call the function from getArea. Since getArea function calculateLength, which is referred as sumOfLength in main function, so sumOfLength is in bracket//
		
		System.out.println("The side length of the trangle is: " + sumOfEdge);//print out sumOfEdge//
		System.out.println("The area of the trangle is: " + area);//print out area//
	}
}
