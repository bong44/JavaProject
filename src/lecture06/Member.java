package lecture06;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String setName() {
		return name;   
	}      
	public String setId() {
		return id;
	}      
	public String setPassword() {
		return password;
	}      
	public int setAge() {
		return age;
	}
	public void getName(String name) {
		this.name = name;
	}
	public void getId(String id) {
		this.id = id;
	}
	public void get(String password) {
		this.password = password;
	}
	public void get(int age) {
		this.age = age;
	}
}
