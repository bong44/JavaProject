package lecture08;

import kim.chopper.MyArrays;

public class Person implements Comparable<Person>{
	private String name;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
//	public int compareTo(Person o) {
//		if (this.height > o.getHeight()) {
//			return 1;
//		}else if (this.height < o.getHeight()) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
//	
	
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.getName());
	}
	
	
	
	public String getTallest(Person[] people) {
		int max = MyArrays.getMaximum(people);
		return people[max].getName();
	}
	
	@Override
	public String toString() {
		return String.format("이름: %s, 키: %.1f", name, height);
	}
	
}
