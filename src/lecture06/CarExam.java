package lecture06;

public class CarExam {
	public static void main(String[] args) {
		NewCar car = new NewCar("red");
		System.out.println("색"+car.getColor());
		System.out.println("최대속력"+Car.getMaxSpeed());
		
		if (car.speedUp(100.0)) {
			System.out.println("가능");
		}else {
			System.out.println("불가능");
		}
		System.out.println("현재 속력" + car.getSpeed());
	}
}

//public class CarExam {
//	public static void main(String[] args) {
//		Car car = new Car("red");
//		System.out.println("색"+car.getColor());
//		System.out.println("최대속력"+Car.getMaxSpeed());
//		
//		if (car.speedUp(100.0)) {
//			System.out.println("가능");
//		}else {
//			System.out.println("불가능");
//		}
//		System.out.println("현재 속력" + car.getSpeed());
//	}
//}

