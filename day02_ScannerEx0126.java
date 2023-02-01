package edu.inha.scanner;

import java.util.Scanner;


public class ScannerEx0126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		System.out.print("이름을 입력 하시오 : ");
		name = sc.nextLine();
		System.out.printf("name = %s\n", name);
		
		int age = 0;
		System.out.print("나이를 입력 하시오 : ");
		age = sc.nextInt();
		System.out.printf("age = %d\n", age);
		
		System.out.print("혈액형을 입력 하시오 : ");
		char blood = sc.next().charAt(0);
		System.out.printf("blood = %c\n", blood);
		
		System.out.print("키를 입력 하시오 : ");
		double height = sc.nextDouble();
		System.out.printf("heigth = %.1f\n", height);
		
	}

}
