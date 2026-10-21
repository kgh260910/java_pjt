
public class Operator3 {

	public static void main(String[] args) {
		
		/*
		 * 비교 연산자
		 * 크고 작음을 나타내는 연산자입니다.
		 */
		
		System.out.println(10 < 20); // true
		System.out.println(10 > 20); // false
		
		System.out.println(10 <= 20); // true
		System.out.println(10 >= 20); // false
		
		System.out.println(10 == 20); // false
		System.out.println(10 != 20); // true
		
//		System.out.println(10 === 20); // 문법 오류
//		System.out.println(10 !== 20); // 문법 오류
		
		float num5 = 0.1f;  // 0.10000000149 > double
		double num6 = 0.1;  // 0.10000000000 > double
		System.out.println("num5: " + num5);  // 0.1
		System.out.println("num6: " + num6);  // 0.1
		System.out.println("num5 + num6: " + (num5 + num6)); // 0.200000001490116112
		
		System.out.println("num5 == num6: " + (num5 == num6)); // false
		System.out.println("num5 == num6: " + (num5 != num6)); // true
		
		System.out.println("num5 > num6: " + (num5 > num6));   // true // float가 double보다 크다.
		
		int num7 = 10;
		float num8 = 10.0f;
		
		// int + float => float + float (형 변환)// num7: 10.0  num8: 10.0
		System.out.println("num7 > num8: " + (num7 > num8));	// false
		System.out.println("num7 >= num8: " + (num7 >= num8));	// true	
		System.out.println("num7 < num8: " + (num7 < num8));	// false
		System.out.println("num7 <= num8: " + (num7 <= num8));	// true
		System.out.println("num7 == num8: " + (num7 == num8));	// true
		System.out.println("num7 != num8: " + (num7 != num8));	// false
		
		// 중요************************************************
		// 문자열 비교
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println("str1 == str2: " + (str1 == str2)); // true
		// 이 방법은 사용하지 않습니다.
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println("str3 == str4: " + (str3 == str4)); // false
		
		System.out.println(str3.equals(str4));  // str3 == str4  // true
		// ***문자열 비교는 이 방법을 사용합니다.***
		
	}

}
