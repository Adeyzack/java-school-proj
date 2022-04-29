package OS;
import java.util.*;


public class SphereDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Sphere sph = new Sphere();
			Sphere sph2 = new Sphere();
			Sphere sph3 = new Sphere();
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter radius #1");
			double radius_1 = scan.nextDouble();

			System.out.println("Enter radius #2");
			double radius_2 = scan.nextDouble();
		
			System.out.println("Enter radius #3");
			double radius_3 = scan.nextDouble();
			
			System.out.println("Area _1: " + sph.area(radius_1));
			System.out.println("Area_2: " + sph.area(radius_2) );
			System.out.println("Area_3: " + sph.area(radius_3));
	}

}
