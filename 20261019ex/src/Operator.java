
public class Operator {

	public static void main(String[] args) {
		
		/*
		 * 연산자(Operator)
		 * 산술연산자, 대입(복합) 연산자, 비교 연산자, 논리 연산자, 조건식 연산자 등등...
		 */
		
		/*
	     *  산술 연산자   +, -, *, /, %, ++, --
	        할당 연산자   =, +=, -=, *=, /=, %=, &=(비트연산자), |=(비트연산자)
	        비교 연산자   ==, !=, >, <, >=, <=
	        논리 연산자   &&, ||, !
	     */
		
		// 1. 덧셈 연산
		// 1-1. 숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2: " + (num1 + num2)); // 30
		
		float num3 = 0.1f;
		float num4 = 0.2f;
		System.out.println("num3 + num4: " + (num3 + num4)); // 0.3
		
		// 1-2. 문자열 덧셈(연결 연산자)
		String str1 = "Hello ";
		String str2 = "world";
		System.out.println("str1 + str2: " + (str1 + str2)); // Hello world
		
		// 1-3. 숫자 + 문자열 = 문자열 + 문자열 = 문자열(연결 연산자)
		System.out.println(10 + "Hello"); // 10Hello
		
		// 참고: 문자 덧셈
		System.out.println('A' + 'B');   // 131  (65 + 66 = 131)
		System.out.println("A" + "B");   // AB
		
		// 2. 뺄셈 연산
		// 2-1. 숫자 뺄셈
		num1 = 10; num2 = 20;
		System.out.println("num1 - num2: " + (num1 - num2)); // -10 
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 - num4: " + (num3 - num4)); // -0.1
		
		// 2-2. 문자열 뺄셈(X)
//		str1 = "Hello"; str2 = "world";
//		System.out.println("str1 - str2: " + (str1 - str2)); // 에러
		
		// 참고: 문자뺄셈(O)
		System.out.println('A' - 'B'); // (65 - 66) = -1
		System.out.println('가' - '나'); // (44032 - 45208) = -1176
		
		// 3. 곱셈
		num1 = 10; num2 = 20;
		System.out.println("num1 * num2: " + (num1 * num2)); // 200
		num3 = 0.1f; num4 = 0.2f;
		System.out.println("num3 * num4: " + (num3 * num4)); // 0.020000001(가비지데이터가 붙는다)
		
		System.out.println('A' * 'B');  // 65 * 66 = 4290
		System.out.println('가' * '나'); // 44032 * 45208 = 1990598656
		
		// 4. 나눗셈
		num1 = 10; num2 = 20;
		
//		4byte방과 4byte방이어서 계산후에도 4byte방이라 소숫점 자리가 표현가능한 8byte방이 아니어서 0만 표기됩니다.
		System.out.println("num1 / num2: " + (num1 / num2)); // 0(오버플로우가 일어나서 0.5가 0이 된다)
//		(float)를 계산식 한군데에 추가해 8byte형으로 만들어서 문제를 해결합니다.
		System.out.println("num1 / num2: " + (num1 / (float)num2)); // 0.5
		
		num3 = 0.8f; num4 = 0.2f;
//		8byte방과 8byte방이어서 계산후에도 8byte방이라 소숫점 자리를 표현합니다.
		System.out.println("num3 / num4: " + (num3 / num4)); // 4.0
		
		System.out.println((int)'a');   // 97
		System.out.println((int)'A');   // 65
		System.out.println('a' / 'A');  // 97/65 => 1.4923...이 아닌 1 (4byte방)
		
		System.out.println(0/100);  // 0
//		System.out.println(100/0);  // 에러
		
		// 5. 나머지 연산자
		num1 = 10; num2 = 3;
		System.out.println("num1 % num2: " + (num1 % num2));  // 1
		System.out.println('a' % 'A');  //  97 % 65 = 32
		
		
		

	}

}
