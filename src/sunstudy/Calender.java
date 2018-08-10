package sunstudy;

import java.util.Scanner;

public class Calender {
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	public  int maxDaysofMounth(int mounth) {
		return MAX_DAYS[mounth-1];
	}
	
	public static void main(String[] args) {
	//숫자를 입력받아 해당하는 달의 최대일수를 출력하는 것
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		System.out.println("반복횟수를 입력하세요");
		int repeat = scanner.nextInt();
		for (int i=0;i<repeat;i++) {
			System.out.println("달을 입력하세요");
			int mounth = scanner.nextInt();
			System.out.printf("%d 월은 %d 일 까지있습니다.\n",mounth,cal.maxDaysofMounth(mounth));
			
		}
		System.out.println("계산끝");
	}

}
