
public class Operator4 {

	public static void main(String[] args) {
		
		/*
		 * 논리연산자(Boolean)
		 * && :	and 연산자		A && B => A와 B가 모두 true인 경우에만 true
		 * || : or 연산자			A || B => A 또는 B 중 하나라도 true이면 결과는 true
		 * !  : 부정(not) 연산자  !A 	   => A의 현재 상태를 부정 true -> false, false -> true
		 */
		
		int num1 = 10; int num2 = 20; int num3 = 30;
		
		boolean result = (num1 < num3) && (num2 < num3);
		System.out.println("result: " + result);  // true
		result = (num1 > num3) && (num2 < num3); // false && true => false
		System.out.println("result: " + result);  // false
		result = (num1 > num3) || (num2 < num3); // false && true => true
		System.out.println("result: " + result);  // true
		
		/*
		 * python에서는 and, or, not으로 표시한다.
		 */
		
		result = (num1 < num2) && (num2 < num3) && (num3 > num1);
				// true && true => true
								// true && true => true
		System.out.println("result: " + result);  // true
		
		System.out.println(!true);  // false
		System.out.println(!!true); // true
		
		/*
		 * &&와 ||중에서 어떤 연산자의 연산 우선순위가 높을까요?
         * 쉽게 생각하면 &&와 ||는 모두 논리연산자로 연산 우선순위가 같아서 왼쪽부터 순차적으로 연산할거라 
         * 생각하기 쉽습니다. 하지만 실제 연산 우선순위는 &&가 ||보다 높습니다. 
		 */
		
		boolean res = false;
		
		int no1 = 10;
		int no2 = 20;
		int no3 = 30;
		
		res = (no1 < no3) || (no2 < no3) && (no1 > no3);
		//		true	  ||	true	 &&		false
		//		true 	  ||			false
		//		=> true
		System.out.println("res: " + res); // true
		
		// 앞에서부터 차례로 연산하려면...
		res = ((no1 < no3) || (no2 < no3)) && (no1 > no3);
		System.out.println("res: " + res); // false
		
		/*
		 * 조건식 연산자 or 삼항식 연산자
		 */
		
		int passScore = 80;
		int myScore = 90;
		
		// 나의 점수가 80이상이면 'PASS'를 출력 그렇지 않으면 'FAIL'출력하자!
		
//		String resultStr = (myScore >= passScore) ? true인경우 : false인경우
		String resultStr = (myScore >= passScore) ? "PASS" : "FAIL";
		System.out.println(resultStr);  // PASS
		
		/*
		 * python에서 삼항연산자
		 * true인경우 if 조건식 else false인경우
		 */

	}

}
