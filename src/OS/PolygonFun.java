package OS;

import java.util.*;
/*
 * 1. The attributes of PolygonFun class are as follows: ( 1pt) 
a. int sides; // should be a default of 3 
b. double sideLength; // should be a default of 1 
c. double xCoordinate; // should be a default of 0 
d. double yCoordinate; // should be a default of 0 
2. Create three constructors – (3 pts) 
a. A polygon with default values 
b. A polygon with a user-specified number of sides and length of sides with the xCoordinate 
and yCoordinate set to 0. 
c. A polygon with user-specified number of sides, length of sides, xCoordinate and 
yCoordinate 
3. Create the accessor and mutator methods for sides, sideLength, xCoordinate, yCoordinate (3 pts) 
4. Create two additional methods getPerimeter() and getArea (3 pts) 
5. Create the UML diagram for the class (2 pts) 
6. Create PolygonFunDemo – use all three constructors (step 2) (3 pts
 */
public class PolygonFun {
	 int sides; 
	 double sideLength; 
	 double xCoordinate; 
	 double yCoordinate; 
	 
	 //constructor, initialize attributes
	 public PolygonFun() {
		 sides = 3;
		 sideLength = 1;
		 xCoordinate = 0;
		 yCoordinate = 0;
				 
	 }
	//constructor
	 public PolygonFun(int side, double sideLeng) {
		 sides = side;
		 sideLength = sideLeng;
	 }
	 
	 //constructor 
	 public PolygonFun(int userSide, double userLeng, double xCoord, double yCoord) {
		 sides = userSide;
		 sideLength = userLeng;
		 xCoordinate = xCoord;
		 yCoordinate = yCoord;
		 
	 }
	 
	 //accesser 
	 public int getSides() {
		 return sides;
	 }
	 //Accessor
	 public double getsideLength() {
		 return sideLength;
	 }
	 
	 //Accessor
	 public double getXcoord() {
		 return xCoordinate;
	 }
	 
	 //Accessor
	 public double getYcoord() {
		 return yCoordinate;
	 }
	 
	 //calculate area
	 public double Area(int numSides, double sideLen) {
		 
		 double degree =180/numSides;
		 
		 double radians = Math.toRadians(degree);
		 double tanValue = 4*Math.tan(radians);
		 
		 double sideSquare = numSides*(sideLen * sideLen);
		 
		 double area = sideSquare/tanValue;
		 return area;
	 }
	 //calculate perimeter
	 public double perimeter(int numSides, double sideLen) {
		 double perime = numSides*sideLen;
		 return (perime);
	 }
}


