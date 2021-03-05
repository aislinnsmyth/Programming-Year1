public class Circle implements GeometricObject {
	
	private double radius;
	private double perimeter = 2 * Math.PI * radius ;
	private double area = Math.PI * radius * radius;
	
	Circle() {
		this.radius = radius;
		this.perimeter = perimeter;
		this.area = area;
	}
	
	public double getPerimeter() {
		 return this.perimeter;
	
	}
	
	public double getArea() {
		return this.area;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.area = Math.PI * this.radius * this.radius;
		this.perimeter = 2 * Math.PI * this.radius;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public void setArea(double area) {
		this.area = area;
	}

}