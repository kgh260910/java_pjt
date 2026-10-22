
public class Tree {

	public static void main(String[] args) {
		
		int loopCnt3 = 10;      // 반복 횟수

	    for (int i = 1; i <= loopCnt3; i++) {
	          
	          for (int j = 0; j < loopCnt3 - i; j++) {
	              System.out.print(" ");
	          }
	          
	          for (int j = 0; j < (i + 1) * 2 - 3; j++) {
	              System.out.print("*");
	          }
	          
	          System.out.println();
	      }

	}

}
