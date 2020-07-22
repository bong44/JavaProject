package lecture06;

public class MemberService {
	
	private String id[] = {"hong"};
	private String password[] = {"12345"};
	
	boolean login(String id, String password) {
		
		for (int i = 0; i < this.id.length; i++) {
			
			if (id.equals(this.id[i]) && password.equals(this.password[i])) {
				
				return true;
			
			}
		}
		
		return false;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
