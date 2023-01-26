package edu.inha.scanner;

import java.util.Scanner;

public class day02_prob6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요 : ");
		double f = sc.nextDouble();
		double c = (5.0/9.0)*(f-32.0);
		System.out.printf("섭씨 온도 = %.2f", c);
		
	}

}
