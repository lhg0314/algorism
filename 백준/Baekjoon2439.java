package algorism.백준;

import java.util.Scanner;

public class Baekjoon2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 별찍기
		Scanner in = new Scanner(System.in);
		System.out.printf("몇줄 출력하시겠습니까?: ");
		int num = in.nextInt();
		
		for(int i=num; i> 0; i--) {
			for(int j = 1; j<i;j++) {
				System.out.printf(" ");
			}
			for(int k =0; k<=num-i; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}
