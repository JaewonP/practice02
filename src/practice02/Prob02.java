package practice02;

import java.util.Scanner;

public class Prob02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double sum = 0.;
		int[] intArray = new int[5];

		System.out.println("5개의 숫자를 입력하세요.");

		//배열 사용
		/* 코드를 완성합니다 */
		
		for(int i = 0; i< intArray.length; i++) {
			int number = scanner.nextInt();		
			intArray[i] = number;
			sum += number;
		
		}
		System.out.println(sum / intArray.length);
		scanner.close();
	}

}
