package lecture07;

public class CellPhone {
	
	String model;
	String color;
	
	void powerOn() {System.out.println("온");}
	void powerOff() {System.out.println("오프");}
	void bell() {System.out.println("링~링~");}
	void sendVoice(String message) {System.out.println("me: "+message);}
	void receiveVoice(String message) {System.out.println("you: "+message);}
	void hangUp() {System.out.println("DisConnect!");}
}
