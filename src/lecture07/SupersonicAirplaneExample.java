package lecture07;


public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sp = new SupersonicAirplane();
		
		sp.taskOff();
		sp.fly();
		sp.flyMode = SupersonicAirplane.SUPERSONIC; //클래스의 상수 가져다 씀
		sp.fly();
		sp.flyMode = SupersonicAirplane.NORMAL;
		sp.fly();
		sp.land();
		
	}
}
