package lecture07;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		System.out.println("도형의 종류 원, 둘레:" +perimeter()+"cm, 넓이: "+area()+"cm2");
	}
	
	@Override
	public double area() {
		return width*height;
	}
	
	@Override
	public double perimeter() {
		return width*2+height*2;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
