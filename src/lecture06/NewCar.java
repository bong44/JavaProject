package lecture06;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	
	public NewCar() {
	}
	
	public NewCar(String color) {
		this.setColor(color);
	}
	
	public double getSpeed() {
		return mileToKillo(speed);
	}

	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
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
		return "";
	}
	
	public boolean speedUp(double speed) {
		if (killoToMile(speed) <= killoToMile(MAX_SPEED) && killoToMile(speed) >= 0) {
			setSpeed(getSpeed() + speed);
			return true;
		}
		return false;
	}
	
	public double killoToMile(double distance) {
		return distance*1.6;
	}

	public double mileToKillo(double distance) {
		return distance/1.6;
	}


	
}
