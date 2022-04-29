package OS;

public class PolygonFunDemo {

	public static void main(String[] args) {
		
		PolygonFun poly = new PolygonFun(5,5); //create obj
		
		System.out.println("Area: " + poly.Area(5, 5));
		System.out.println("Perimeter: " + poly.perimeter(5, 5));
		System.out.println("Side Length: " + poly.getsideLength());

	}

}
