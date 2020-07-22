package lecture06;

import com.sun.org.apache.regexp.internal.recompile;

public class Circle {
	private double radius;
	private double x;
	private double y;
	
	private Circle() {
		
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setRadius(double radius) {
		if (radius < 1) {
			this.radius = 0.0;
		} else {
			this.radius = radius;
		}
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	

}
