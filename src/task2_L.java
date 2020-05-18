import java.util.Scanner;

public class task2_L {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("500원짜리 동전의 갯수: ");
	int Fwon = sc.nextInt()*500;
	System.out.print("100원짜리 동전의 갯수: ");
	int Owon = sc.nextInt()*100;
	System.out.print("50원짜리 동전의 갯수: ");
	int fwon = sc.nextInt()*50;
	System.out.print("10원짜리 동전의 갯수: ");
	int owon = sc.nextInt()*10;
	int re = Fwon + Owon + fwon + owon;
	System.out.println("저금통 안의 동전의 총 액수: "+re);
	}
}
