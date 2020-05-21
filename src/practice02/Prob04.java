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

		
		/* 코드를 완성합니다 */
		// 배열의 맨 뒤쪽 주소부터 반대로 호출 되도록 해야함 
		
     	int count = result.length / 2;
			for(int j = 0; j < count ; j++) {
				char swap = result[j];
				result[j] = result[result.length -1 -j];
			result[result.length -1 -j] = swap;
			}
		
		
			
		return result;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}
