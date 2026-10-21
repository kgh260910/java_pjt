import java.util.Scanner;

public class ConditionEx {

	public static void main(String[] args) {
		
		// if문
		/*
		 * 문법 구조
		 * if (조건식) {
		 * 	  실행문
		 * }
		 */
		
		Scanner scanner = new Scanner(System.in);
		
//		int userInputData = scanner.nextInt();
//		
//		if (userInputData > 10) {
//			System.out.println("userInputData는 10보다 크다.");
//		}
//		
//		if (userInputData == 10) {
//			System.out.println("userInputData는 10이다.");
//		}
//		
//		if (userInputData < 10) {
//			System.out.println("userInputData는 10보다 작다.");
//		}
//		
		// if ~ else문: 양자 택일
		/*
		 * 시험 점수가 70이상이면 '합격' 그렇지 않으면 '불합격'을 출력하자.
		 */
		
//		int myScore = scanner.nextInt();
//		if (myScore >= 70) {
//			System.out.println("합격!!");
//		} else {
//			System.out.println("불합격!!");
//		}
//		
		// if ~ else if문: 다중 비교
		/*
		-점수가 90점 이상이면 ‘수’를 출력한다.
        -점수가 80점 이상 90점 미만이면 ‘우’를 출력한다.
        -점수가 70점 이상 80점 미만이면 ‘미’를 출력한다.
        -점수가 60점 이상 70점 미만이면 ‘양’를 출력한다.
        -점수가 60점 미만이면 ‘가’를 출력한다.
		*/
		
//		int myScore = scanner.nextInt();
//		if (myScore >= 90) {
//			System.out.println("수");
//		} else if(myScore >= 80) {		
//			System.out.println("우");
//		} else if(myScore >= 70) {		
//			System.out.println("미");
//		} else if(myScore >= 60) {
//			System.out.println("양");
//		} else {
//			System.out.println("가");
//		}
//		
//		if (true) 
//			System.out.println("참");  // 실행문이 1줄이면 {} 생략 가능
		
		// 중첩 조건문
		// 사용자가 입력한 정수가 10보다 크다면 짝수인지 홀수인지 판별하자!
//		int integerNum = scanner.nextInt();
//		if (integerNum > 10) {
//			System.out.println("integerNum은 10보다 크다.");
//			
//			if (integerNum % 2 == 0) {
//				System.out.println("integerNum은 짝수!!");
//			} else {
//				System.out.println("integerNum은 홀수!!");
//			}
//		} else {
//			System.out.println("integerNum은 10보다 작거나 같다.");
//		}
		
		/*
		 * switch ~ case문
		 * 문법 구조
		 * switch(조건식) {
		 *  case 조건식 결괏값:
		 *   실행문
		 *   break;
		 *  }
		 */
		
		// 컴퓨터 시스템 종료 메뉴
		// 1. The power saving mode
		// 2. The system shut-down
		// 3. Re-start
		/*
		final int THE_POWER_SAVING_MODE = 1;
		final int THE_SYSTEM_SHUT_DOWN = 2;
		final int RE_START = 3;
		System.out.println("1. The power saving mode");
		System.out.println("2. The system shut-down");
		System.out.println("3. Re-start");
		
		System.out.println("Please select menu number");
		
		int selectedMenuNumber = scanner.nextInt();
		
		switch (selectedMenuNumber) {
		case THE_POWER_SAVING_MODE:
			System.out.println("1. The power saving mode");
			break;
		
		case THE_SYSTEM_SHUT_DOWN:
			System.out.println("2. The system shut-down");
			break;
		
		case RE_START:
			System.out.println("3. Re-start");
			break;
		}
		*/
		
		/*
		 * LGU+
		 * NORMAL	월 문자 50개 무료 증정
		 * VIP		NORMAL + 월 1회 무료 영화권
		 * VVIP		VIP + 월 1회 크루즈 여행권 1매
		 */
		final int NORMAL_GRADE = 3;
		final int VIP_GRADE = 2;
		final int VVIP_GRADE = 1;
		
		System.out.println("등급 입력: 1.VVIP\t2.VIP\t3.NORMAL");
		int customerGrade = scanner.nextInt(); 
		
		switch (customerGrade) {
		case VVIP_GRADE:
			System.out.println("월 1회 크루즈 여행권 1매");
		case VIP_GRADE:
			System.out.println("월 1회 무료 영화권");
		case NORMAL_GRADE:
			System.out.println("월 문자 50개 무료 증정");
			break;
		
		default:
			System.out.println("잘못 입력했어요.");
			break;
		}
		
		scanner.close();
	}

}
