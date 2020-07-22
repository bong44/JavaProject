package lecture07;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
		System.out.println("도형의 종류 원, 둘레:" +perimeter()+"cm, 넓이: "+area()+"cm2");

	}
	
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public double perimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
	
}
