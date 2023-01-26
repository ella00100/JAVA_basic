package edu.inha.scanner;

import java.util.Scanner;

public class day02_prob2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		int square = i*i;
		System.out.printf("%d의 제곱은 %d", i, square);
		
	}

}
