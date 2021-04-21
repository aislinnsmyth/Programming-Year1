import java.util.Scanner;

public class ResizableCircle extends Circle implements Resizable {

	private int percentage;
	Circle circleClass = new Circle();
	
	ResizableCircle() {
		super();
	}
	
	public void resize(int percentage) {
		
		int radius = (int)(circleClass.getRadius()*(percentage/100.0f));
		radius = 100 - radius;
		
		setRadius(super.getRadius() + (super.getRadius() * (-percentage/100.0f)));
		
	}
	
	public double getPerimeter() {
		return super.getPerimeter();
	}
	
	public double getArea() {
		return super.getArea();
	}
}