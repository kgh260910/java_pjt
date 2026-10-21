
public class MainClass {
	
	public static void main(String[] args) {
		
		
		// 변수
		/*
		 * 변수란, 메모리의 특정 공간을 의미한다. 이곳에 데이터가 들어간다.
		 * 변수 선언 & 변수 초기화
		 * 변수 선언이란, 메모리의 특정 공간을 청소하고 변수명을 달아주는 작업이다.
		 * 변수 초기화란, 변수에 특정 데이터를 저장하는 작업이다.
		 * 그리고 변수 선언 + 변수 초기화 = 변수를 정의 했다라고 한다.
		 */
		
		// 정수를 이용한 변수 선언과 초기화
		// let 변수명 = 데이터;   <- 자바스크립트
		// 데이터타입	 변수명  =  데이터;  <- 자바
		int num = 10;  // 변수 선언 & 초기화
		
		int num2;  // 변수 선언
		num2 = 20;  // 변수 초기화  /변수선언과 초기화를 따로따로 사용 가능하다.
		
		System.out.println("num: " + num);  // num: 10
		System.out.println("num2: " + num2);  // num2: 20
		
		int address = System.identityHashCode(num);   // num의 메모리주소 
		System.out.println("address: " + address);   // 자바는 메모리주소를 알 필요가 없다.
		
		// 변수명 작명 가이드
		// 1. 변수명의 시작은 일반적으로 소문자로 시작한다.
		int money = 1000;   // 권장
		int Money = 1000;   // class명과 혼동되기때문에 비권장
		
		// 2. 변수명은 일반적으로 영문자를 사용한다.
		int myMoney = 1000;  // 권장
		int 나의자산 = 1000;   // 비권장
		
		// 3. 변수명은 데이터의 의미를 쉽게 파악할 수 있도록 작명한다.
		int score = 80;   		 // 권장,   int s = 80; (비권장)
		String player = "홍길동"; // 권장
		String map = "지도";		 // 권장
		
		// 4. 2개 이상의 단어가 조합된 경우 낙타표기법을 사용한다.
		int myScore = 80;  		// 나의 점수
		int totalScore = 80;	// 전체 점수
		int highScore = 80;		// 최고 점수
		int averageScore = 80;	// 평균 점수
		String newItem = "칼";	// 새로운 아이템
		
		// 5. 키워드는 변수명으로 사용할 수 없다.
		/*
		 * public class void for it switch case ...
		 */
		
		// 6. '_'를 제외한 특수문자는 변수명으로 사용할 수 없다.
		int my_score = 100;		// 가능
//		int my-score = 100;		// X (문법 오류)
//		int my^^score = 100;	// X (문법 오류)
		
		// 7. 변수명에 공백문자는 사용할 수 없다.
//		int my number = 80;		// X
		
		// 8. 변수명에 숫자를 사용하는 경우 첫 글자를 제외한 나머지 글자에 사용할 수 있다.
//		int 1number = 10;		// X
		int num1ber = 10;		// O
		int number1 = 10;		// O
				
		/* 요 약
		 ㆍ 변수명은 영문으로 하고, 첫 글자는 소문자로 한다.
         ㆍ 2개 이상의 단어가 조합된 경우 낙타표기법을 따른다. 
         ㆍ 특수문자, 예약어 그리고 공백문자는 사용하지 않는다.
         ㆍ 숫자를 사용해야하는 경우 중간 또는 뒤에 사용한다.
		 */
		
		// 데이터 변경
		int number = 10;
		System.out.println("number: " + number); 	// number: 10
		
		number = 20;
		System.out.println("number: " + number); 	// number: 20
		
		/*
		 * 동일한 이름으로 변수를 선언하면 안된다.
		 */
//		int number = 30;
		
		// 데이터 복사
		int num1 = 10;
		System.out.println("num1: " + num1);  		// num1: 10
		
		int num22 = num1;
		System.out.println("num22: " + num22); 		// num22: 10
		
		int n1 = 10;
		int n2 = 20;

		// Q) n1과 n2의 값을 교환하시오.
		int n0 = 0;
		n0 = n1;
		n1 = n2;
		n2 = n0;
		System.out.println("n1: " + n1);  	// 20
		System.out.println("n2: " + n2);  	// 10
		
		// Q) 가로와 세로 변수를 각각 만들고 방의 넓이를 구해보자.
		int width;
		int height;
		width = 100;
		height = 50;
		System.out.println("방의 넓이: " + (width * height)); // 5000
		
		
	}
}
