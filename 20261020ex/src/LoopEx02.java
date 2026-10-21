
public class LoopEx02 {

	public static void main(String[] args) {
		
		/*
		 * 반복 흐름 제어
		 * break, continue
		 * 
		 * 
		 * break: 프로그램 실행 중 break를 만나면 즉시 중단
		 * continue: 반복 실행 시 continue를 만나면 다음 반복으로 넘어간다.
		 */
		
		// 1 ~ 10까지 정수의 합을 구하되, 합이 30을 넘으면 중단
//		int sum = 0;
//		for(int i = 1; i < 11; i++) {
//			sum += i;
//			if (sum > 30)
//				break;
//		}
		
//		System.out.println("sum: " + sum);
		
		// 1부터 10까지의 정수를 출력하되, 짝수만 출력한다.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				continue;             
			// if문을 만족할시 continue;를 진행하여 다음 반복을 진행합니다.
			System.out.println("i : " + i);
		}
		
		/*
		 * 명찰(Label) 달기 (현재는 사용하지 않는 방법) 
		 * 반복문에 이름을 부여하는 것에 대해서 살펴보겠습니다. 
		 * 반복문에 이름을 부여한다는 것은 for문 또는 while문에 
		 * 명찰(Label)을 달아주는 것이라고 생각하면 됩니다. 
		 * 그리고 명찰뒤에 콜론(:)을 붙여 줍니다.
		 */
		
		/*
		 * 요구사항
		 * 1. 구구단을 출력하시오.
		 * 2. 구구단을 출력할 때 짝수 곱셈은 생략하시오.
		 * 3. 모든 구구단 곱셈 결괏값을 덧셈하고, 합이 200을 초과하면 출력을 중단하시오.
		 */
		
		int sum = 0;
		
		loopLabel1:
		for (int i = 2; i < 10; i++) {
			
			loopLabel2:
			for(int k = 1; k < 10; k++) {
				
				if (k % 2 == 0)
					continue loopLabel2;
				
				sum += i * k;
				if (sum > 200)
					break loopLabel1;
				
				System.out.printf("%d * %d = %d \n", i, k, sum);
			}
		}

	}

}
