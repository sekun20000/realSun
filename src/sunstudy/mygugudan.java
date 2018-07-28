package sunstudy;
import java.util.Scanner;
public class mygugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("몇 단을 해볼까요");
		int number = scanner.nextInt();
		System.out.println(number + "단을 시작하겠습니다");
		for(int x =1; x <10 ; x ++) {
			System.out.println(number * x);
		}
	}

}
