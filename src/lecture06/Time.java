package lecture06;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Time(int hour, int minte, int second) {
		if (hour >= 0 && 23 <= hour) {
			this.hour = hour;
		}else {
			this.hour = 0;
		}
		if (minte >= 0 && 59 <= minte) {
			this.minute = minte;
		}else {
			this.minute = 0;
		}
		if (second >= 0 && 59 <= second) {
			this.second = second;
		}else {
			this.second = 0;
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
}
