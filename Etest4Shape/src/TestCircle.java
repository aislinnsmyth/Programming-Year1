import java.util.Scanner;
import java.text.DecimalFormat;

public class TestCircle {
	
	public static Circle circleClass;
	private static DecimalFormat decimalPoints = new DecimalFormat("#.##");

	public static void main(String[] args) {
		
		Circle circleClass = new Circle();
		
		Scanner circleInput = new Scanner(System.in);
		
		circleClass.setRadius(100);
		
		System.out.println("The dimension for this circle are: ");
		System.out.println("Perimeter of the circle is " + decimalPoints.format(circleClass.getPerimeter()));
		System.out.println("Area of the circle is " + decimalPoints.format(circleClass.getArea()));
		
	}

}
