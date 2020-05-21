package practice02;

public class Prob03 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}
	
	public static void replaceSpace( char[] c ) {
		/* 코드를 완성합니다 */
		c[4] = ',';
		c[7] = ',';
		c[9] =',';
		
	}
	
	public static void printCharArray( char[] c ) {
		System.out.println( c );
	}
}
