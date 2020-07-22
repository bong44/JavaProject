package lecture07;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("아이폰 11 pro","블랙",10);
		
		System.out.println(dmb.model+"\t"+dmb.color+"\t"+dmb.channel);
		
		dmb.powerOn();
		
		dmb.bell();
		
		dmb.sendVoice("Hi");
		
		dmb.receiveVoice("WTF!?");
		
		dmb.turnOnDmb();
		
		dmb.changeChannelDmb(10000);
		
		dmb.turnOnDmb();
	}
}
