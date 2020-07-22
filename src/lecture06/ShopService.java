package lecture06;

public class ShopService {
	private static ShopService instance = new ShopService();
	//지금은 기본생성자를 만들어 싱글톤 형식으로 만들어줌(기본생성자에 대한 객체)
	//필드값은 보통 private로
	private ShopService() {
	// 기본 생성자 
	}
	
	public static ShopService getInstance(){
		return instance; //getter사용
	}
	
}
