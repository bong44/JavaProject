package lecture06;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	

	public Car() {
	}
	
	public Car(String color) {
		this.setColor(color);
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	static public double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	public String toString() {
		return null;
	}
	
	public boolean speedUp(double speed) {
		if (speed <= MAX_SPEED && speed >= 0) {
			this.setSpeed(getSpeed()+speed);
			return true;
		}
		return false;
	}
	
}
