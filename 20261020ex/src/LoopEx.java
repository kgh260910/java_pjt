import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		
		// 안녕하세요.를 3회 출력하자!
		// for(초기화; 조건식; 단계)
		// for(시작; 끝; 단계)
//		
//		for (int i = 1; i < 4; i++) {
//			System.out.println("안녕하세요" + i);
//		}
//		
//		int i = 1;					// 전역 변수 i
//		for (; i < 10; i += 2) {
//			System.out.println("hello");
//		}
//		
//		int j = 0;
//		for (j = 5; j < 10; j += 2) {
//			System.out.println("Hi" + j);
//		}
//		
//		for (int k = 0; k < 10; ++k) {   // 전위나 후위나 10번 출력한다.
//			System.out.println("O");
//		}
//		
		// 1부터 사용자가 입력한 정수까지의 합을 구하는 프로그램을 만들어 보자.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수 입력하세요.");
//		int inputData = scanner.nextInt();
//		
//		int sum = 0;
//		for(int i = 1; i <= inputData; i++) {
//			sum += i;
//		}
//		
//		System.out.println("sum: " + sum);
//		
//		scanner.close();
//		
		// 3단 구구단 출력
//		for (int i = 1; i < 10; i++) {
//			System.out.println("3 * " + i + " = " + (3 * i));
//			System.out.printf("3 * %d = %d%n", i, (3 * i));
//			System.out.println(String.format("3 * %d = %d%n", i, (3 * i)));
//		}
		
		// 전체 구구단 (가로모드, 세로모드) 출력하자!
		// 구구단 가로모드
//		System.out.println("구구단 가로");
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//			}
//			
//			System.out.println();
//		}
//		
//		System.out.println("------------------------------------");
//		// 구구단 세로모드
//		System.out.println("구구단 세로");
//		for (int i = 1; i < 10; i++) {
//			for (int j = 2; j < 10; j++) {
//				System.out.print(j + "*" + i + "=" + j * i + "\t");
//			}
//			
//			System.out.println();
//		
//		}
		
//		boolean flag = true;
//		for(int k = 1; flag; k++) {
//			System.out.println("k: " + k);
//			if (k > 10)
//				break;
//		}
		
		for(double d = 0.0; d < 1; d += 0.1) {
			System.out.printf("d: %f \n", d);
		}
		
		/*
		 * 0.0
		 * 0.1
		 * ...
		 * 0.9 ---> 10회 반복
		 */
		
		// 중요*****************
		// 중첩 for문을 이용할 때 절대 3단계 이상을 사용하지 말자!
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j <= 5 - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * ***** 
		 */
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		 * 달력 만들기
		 */
		
		System.out.println("MON\tTUE\tWED\tTHU\tFRI\tSAT\tSUN");
		int offset = 3;
		int day = 1;
		for (int i = 0; i < 5; i++) {
			
			// - 찍음
				for (int j = 0; j < offset; j++) {  // 비어있는 날
					System.out.print(String.format("%3c\t", '-'));
				}
			
			// 날짜
				for (int j = 0; j < 7 - offset; j++) {
				
					if (day <= 30) {
					System.out.print(String.format("%3d\t", day));
					day++;
				} else {
					System.out.print(String.format("%3c\t", '-'));
				}
			
			}
			
			offset = 0;
			System.out.println();
			
			
		}
	}

}
