package OS;

public class Sphere {
	
	private int radius;
	private int id;
	//constructor: sets the initial value of radius
	public Sphere()
	
	{
		radius = 0;
		
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int newId)
	{
		this.id = newId;
	}
	public double area(double radius) 
	{
		double area;
		area = 4*3.14*radius*radius;
		return area;
	}
	
	public double volume(double radius)
	{
		double volume;
		volume = (4/3)*3.14*(radius*radius*radius);
		return volume;
	}
	
	public String toString()
	{
		//String ID = Integer.toString(id++);
		String Radiu = Integer.toString(id++);
		return ("S" + id);
	}

}
