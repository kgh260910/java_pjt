import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 데이터 타입
		 * 메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게 됩니다.
		 * 각각의 메모리 크기에 따라 데이터 종류를 구분하는 것을 말합니다.
		 * 
		 * 메모리 단위
		 * 1bit(비트) > 메모리 최소단위
		 * 8bit(비트) -> 1byte(바이트)
		 * 1024Byte -> 1KB(킬로 바이트)
		 * 1024KB -> 1MB(메가 바이트)
		 * 1024MB -> 1GB(기가 바이트)
		 * 1024GB -> 1TB(테라 바이트)
		 */
		// 오버플로우 : 데이터가 저장하거나 처리할 수 있는 최대 범위를 초과하는 현상
		// 언더플로우 : 데이터가 표현할 수 있는 최솟값보다 작은 값을 만들려고 할 때 발생합니다.
		
		// 정수 데이터 타입
		/*
		 * byte 	1byte		-128 ~ 127
		 * short	2byte		-32,768 ~ 32,767
		 * int		4byte		-2,147,483,648 ~ 2,147,483,647
		 * long		8byte	-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		 */
		
		byte byteNum = 115;
		System.out.println("byteNum: " + byteNum); // 115
		
//		아래 예시는 불가능
//		byteNum = 128;
//		byteNum = byteNum + 1;
		
		byte byteNum01 = -128;
		System.out.println("byteNum01: " + byteNum01); // -128
		
		byteNum01 = (byte)(byteNum01 - 1);
		System.out.println("byteNum01: " + byteNum01); // -129(X) 127(O)
//		(byteNum01 - 1)은 int형이 되지만 앞에 (byte)를 붙여 byte형이되어 -129는 언더플로우되어 127이 되었습니다.
		
		short shortNum = 22768;
		System.out.println("shortNum: " + shortNum); // 22768
		
		int intNum = 1147483648;
		System.out.println("intNum: " + intNum); // 1147483648
		
		int intNum01 = -2147483648;
		System.out.println("intNum01: " + intNum01); // -2147483648
		intNum01 = intNum01 - 1; 
		System.out.println("intNum01: " + intNum01); // -2147483649(X) 2147483647
		
//		long longNum = 7223372036854775808;
		long longNum = 7223372036854775808L;
		System.out.println("longNum: " + longNum);
		
		System.out.println("byte 최솟값: " + Byte.MIN_VALUE);  // 래퍼 클래스(Wrapper Class)
		System.out.println("byte 최댓값: " + Byte.MAX_VALUE);
		
		System.out.println("short 최솟값: " + Short.MIN_VALUE);
		System.out.println("short 최댓값: " + Short.MAX_VALUE);
		
		System.out.println("int 최솟값: " + Integer.MIN_VALUE);
		System.out.println("int 최댓값: " + Integer.MAX_VALUE);
		
		System.out.println("long 최솟값: " + Long.MIN_VALUE);
		System.out.println("long 최댓값: " + Long.MAX_VALUE);
		
		// 실수(부동소수점)
		/*
		 * float	4byte
		 * double	8byte
		 */
		
		float floatNum = 3.14f;
		System.out.println("floatNum: " + floatNum);
		
		double doubleNum = 3.14159265358979;
		System.out.println("doubleNum: " + doubleNum);
		
		System.out.println("float 최솟값: " + Float.MIN_VALUE); // 1.4E-45
		System.out.println("float 최댓값: " + Float.MAX_VALUE); // 3.4028235E38
		
		System.out.println("double 최솟값: " + Double.MIN_VALUE);
		System.out.println("double 최댓값: " + Double.MAX_VALUE);
		
		float num1 = 3.14159265358979323846264338327950288f;
	    double num2 = 3.14159265358979323846264338327950288d;
	    
	    // 일반적으로 float는 소수점 6~7번째 자리까지 표현되고, doule은 15번째 자리까지 표현됩니다.
	    System.out.println("num1: " + num1);
	    System.out.println("num2: " + num2);
		// 통상적으로 웹프로그래밍에서는 double사용이 추천되고, 임베디드 등에서는 float를 사용합니다.
	    
	    // 논리 데이터 타입
	    // 참(true), 거짓(false)          // 파이썬만 True, False로 적습니다.
	    // boolean	1byte	true, false
	    boolean flag = true;
	    System.out.println("flag: " + flag);
	    
	    // 문자와 문자열 데이터 타입
	    // 문자
	    /*
	     * 메모리에 문자 데이터를 저장하기 위해서 사용하는 데이터 타입
	     * char	 2byte  // 한개의 문자가 존재해야합니다.
	     */
	    char ch = 'a';
//	    char ch = "a";   (문법 오류)
	    System.out.println("ch: " + ch);
	    
	    ch = 'b';
	    System.out.println("ch: " + ch);  // ch: b
	    
//	    ch = 'hello';  (Invalid character constant)
	    
	    // 빈문자(empty) vs 공백문자(space)
//	    char char1 = '';   // 문자가 0개라 (불가능)
//	    char char2 = ' ';  // (가능)
	    
	    // 문자는 메모리에 저장될 때 정수(유니코드)로 저장이 됩니다.
	    char char1 = 'A';
	    System.out.println("char1: " + char1);  // A
	    
	    int unicode = char1;
	    System.out.println("unicode: " + unicode); // 65
	    
	    char char2 = 'ㄱ';
	    System.out.println("char2: " + char2); // ㄱ
	    
	    unicode = char2;
	    System.out.println("unicode: " + unicode); // 12593
	    
	    char char3 = 65;
	    System.out.println("char3: " + char3); // A
	    
	    char3 = 12593;
	    System.out.println("char3: " + char3); // ㄱ
		
	    
	    // 문자열
	    // String
	    String str1 = "Hello";
	    System.out.println("str1: " + str1);
	    
	    /*
	     * str1 = "";  O
	     * str1 = " "; O
	     */
	    
	    // 콘솔을 이용한 데이터 입력, 출력
	    // 데이터 출력
	    System.out.print("hello python");
	    System.out.println("hello java");  // ln = line
	    System.out.print("hello python\n");  //  \n = 개행
	    System.out.println("hello java");
	    
	    String str = "hello~";
	    System.out.println(str);
	    /*
	     * 특수 문자 정리
	     * \n 	개행(줄바꿈)
	     * \t	탭(4칸 공백)
	     * \'	작은 따옴표(')
	     * \"	큰 따옴표(")
	     * \\	역 슬래시(\)
	     */
	    
	    System.out.print("이름\t학번\n");
	    System.out.println("Mr. H\t2020_000123");
	    System.out.println("Mr. K\t2020_00124");
	    
	    System.out.println("어머님께서는 \"밥 먹고 설거지 해놔라.\"라고 하셨습니다.");
	    System.out.println("그래서 나는 \'네.\'라고 했습니다.");
	    
	    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	    System.out.println("\\\\\\2020-08-01\\\\\\");
	    
	    // 데이터 입력
	    Scanner scanner = new Scanner(System.in);
	    		
	    String inputStr = scanner.nextLine();
	    System.out.println("inputStr: " + inputStr);
	    
	    int inputInt = scanner.nextInt();				// 10 
	    System.out.println("inputInt: " + inputInt);	// inputInt: 10
	    
	    scanner.nextLine(); 	//nextInt()는 위에서 10을 입력하고 Enter를 눌러 입력하게되어 
	    						//남는 \n(Enter)를 처리해줍니다.			
	    String inputString = scanner.nextLine();			// java
	    System.out.println("inputString: " + inputString);	// inputString: java
	    
	    
//	    String inputString = scanner.next();            	// hello java
//	    System.out.println("inputString: " + inputString);	// inputString: hello
	    
	    inputString = scanner.nextLine();
	    System.out.println("inputString: " + inputString);  // inputString: (공백)java
	    
	    scanner.close();  // 외부자원을 사용후 끊어주어야 한다.
	                      // 생략시 메모리누수로 시스템이 먹통될 수 있습니다.
	    
	    /*
	     * nextByte()  	 : 정수 입력
	     * nextInt()   	 : 정수 입력
	     * nextLong()  	 : 정수 입력
	     * nextFloat() 	 : 실수 입력
	     * nextDouble()	 : 실수 입력
	     * nextLine()  	 : 문자열 입력
	     * nextBoolean() : 논리 입력
	     */
	    
	    
	    

	}

}
