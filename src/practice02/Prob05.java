package practice02;

import java.util.Scanner;

import java.util.Random;

public class Prob05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		System.out.println(k);
		
		System.out.println("수를 결정 하였습니다. 맞추어 보세요");
		System.out.println("1-100");
		
		int temp =100;
		int temp2 = 1;
		for(int i = 1; i <=100 ; i ++) {
			System.out.println(i +">>");
			int a = scanner.nextInt();
				if(a == k) {
					System.out.println("맞았습니다.");
					break;
				}
				else if(a > k) {
					temp =a;
					System.out.println("더 낮게");
					
				}
				else {
					temp2 =a;
					System.out.println("더 높게");
				}
				
				System.out.println( temp2 +"-" + temp);
		}
		

		System.out.println("다시 하겠습니까?(y/n)");
		/* 코드를 완성합니다 */

		String answer = scanner.next();
		if( answer.equals("y") ){
		    //종료하도록 작성한다.	
			main(args);
			
		}else if(answer.equals("n")) {
			System.out.println("종료합니다");
		    return;   
		}

		
		scanner.close();
	}



}
