package lecture08;


public class Triangle extends Shape{
	private double side;

	public Triangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return Math.sqrt(3)*side*side*0.25;
	}
	
	@Override
	public double perimeter() {
		return side*3;
	}

	@Override
	public String toString() {
		return String.format("도형의 종류: %s ,둘레: %2f ,넓이: %2f","삼각형",perimeter(),area());
	}
	
}
