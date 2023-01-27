package edu.forex;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		System.out.print("소수구하기 프로그램\n");
		Scanner sc = new Scanner (System.in);
		System.out.print("소수를 구할 정수 한개 입력 : ");
		int input = sc.nextInt();
		int prime = 0;
		for (int i = 2; i <= input; i++) {
			int count = 0;
			for( int j = 1; j <= i; j++) {
				if (i % j == 0) 
					count += 1;
			}
			if (count == 2) {
				prime += 1;
				System.out.printf("%d은(는) 소수이다.\n",i);
			}
		}
		System.out.printf("1~%d 사이의 소수 개수 = %d" , input, prime);
	}
}

