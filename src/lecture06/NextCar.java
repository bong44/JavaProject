package lecture06;

public class NextCar {
	
	private int speed;
	private boolean stop;
	
	
	NextCar(int speed, boolean stop) {
		this.speed = speed;
		this.stop = stop;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	
	public void setStop(Boolean stop) {
		this.stop = stop;
		
	}
}
