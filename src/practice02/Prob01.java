package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		Scanner scanner = new Scanner(System.in);

		//순환문

		/* 코드를 완성합니다 */

		int money = scanner.nextInt();
		int moneyLength = MONEYS.length;
	
		
		for(int i =0; i < moneyLength ; i++) {
			int count = money/MONEYS[i]; 
			
			money = money - (count*MONEYS[i]);
			
			System.out.println(MONEYS[i]+ ":"+count);
		}
	
		
		scanner.close();
	}

}
