package lecture10;

public class LoginExample {
	public static void main(String[] args) {
		
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "21345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void login(String id, String passward) throws NotExistIDException, WrongPasswardException {
		
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if (!passward.equals("12345")) {
			throw new WrongPasswardException("패스워드가 올바르지 않습니다.");
		}
	}
}
