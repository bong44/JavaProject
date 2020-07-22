package lecture08;

public abstract class Shape implements Comparable<Shape>{ //<>이건 제네릭이란 것.
	
	public abstract double area();
	public abstract double perimeter();
	
	@Override
		public int compareTo(Shape o) {
		if (area() > o.area()) {
			return 1;
		}else if (area() > o.area()) {
			return -1;
		}else {
			return 0;
		}	
	}
}
