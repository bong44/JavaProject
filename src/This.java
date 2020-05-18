
public class This {
	public String name;
	public String color;
	public double weight;
	public int count;
		 //왜 여기 밑에 얘는 위 클레스 이름이랑 똑같이 해줘야댐?
	public This(String name, String color,double weight,int count) {  //대충 무슨 느낌인지 알겠는데 자세히 모르
		this.name =name; //위 최상위에서 선언된 곳에 저장됨
		this.color = color;  //곧 this는 저기 위에 가르키는 듯?
		this.weight = weight;
		this.count = count;
	}
	public static void main(String[] args) {
		This th = new This("pine apple","blue",5.0,10); //바로 위에 있는 곳으로 가는데 뭔 느낌인지 잘 모름
		System.out.println(th.name);  //DB에서 테이블 생성하고 컬럼불러오는 느낌이네
		System.out.println(th.color); //객체 생성하고 객체안의 변수들을 불러올 수 있음
		System.out.println(th.weight);  
		System.out.println(th.count);
	}
}
