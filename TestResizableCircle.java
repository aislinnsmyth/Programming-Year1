import java.text.DecimalFormat;
import java.util.Scanner;

public class TestResizableCircle {
	
	public static ResizableCircle resCircle;
	private static DecimalFormat decimalPoints = new DecimalFormat("#.##");

	public static void main(String[] args) {
		
		ResizableCircle resCircle = new ResizableCircle();
		
		Scanner circleInput = new Scanner(System.in);
	
		resCircle.setRadius(100);
		resCircle.resize(10);
		
		System.out.println("The dimensions of the circle are: ");
		System.out.println("Perimeter of the resized circle is " + decimalPoints.format(resCircle.getPerimeter()));
		System.out.println("Area of the resized circle is " + decimalPoints.format(resCircle.getArea()));
		

	}

}