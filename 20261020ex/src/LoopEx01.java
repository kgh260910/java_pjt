import java.util.Scanner;

public class LoopEx01 {

	public static void main(String[] args) {
		
		/*
		 * while문: 조건에 의한 반복문
		 * while(조건식 {
		 *  실행문
		 * }
		 */
		/*
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
		
		int i = 0;
		while (i < 5) {
			System.out.println("Hello");
			i++;
		}
		*/
		
		// while문 내부에 if문을 넣어 무한루프를 제어할 수 있다.
		/*
		int i = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("i : " + i);
			i++;
			
			if (i > 100)
				flag = false;
		}
		*/
		
		// do ~ while문
		// do 이하 코드를 조건에 상관없이 1회를 시행합니다.
		/*
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			i++;
			
		} while(i <= 10);
			
		System.out.println("sum: " + sum);
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int condition = 0;
		
		do {
			System.out.println("우유를 배송한다.");
			System.out.println("정기 배송 진행 여부를 선택한다.");
			
			System.out.println("1.맛있다.    2.맛없다.");
			condition = scanner.nextInt();
			
			if (condition == 2) {
				System.out.println("그만 배송하세요.");
			}
			
		} while(condition == 1);
		
		scanner.close();

	}

}
