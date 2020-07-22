package lecture06;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		boolean result = service.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다.");
			service.logout("hong");
		}else {
			System.out.println("아이디 아니면 패스워드가 틀렸습니다.");
		}
		
		
		Printer.println(true);
	}
}
