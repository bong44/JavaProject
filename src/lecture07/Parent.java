package lecture07;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("부모()");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("부모(nation)");
	}
}
