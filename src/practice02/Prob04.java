package practice02;

public class Prob04 {
	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] result = str.toCharArray();

		int swap =0;
		/* 코드를 완성합니다 */
		// 배열의 맨 뒤쪽 주소부터 반대로 호출 되도록 해야함 
		for(int i = 0; i < result.length ; i++) {
			for(int j = result.length; j > i ; j--) {
				swap = result[j];
				result[j] =.;
				c1 = swap;
			}
		}
		
		
		return result;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}
