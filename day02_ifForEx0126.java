package edu.ifex;

import java.util.Scanner;

public class ifForEx0126 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		if (a>0) {
			System.out.printf("%d는 양수임\n", a);
		}
		else if (a==0) {
			System.out.printf("%d는 0임\n",a);
		}
		else {
			System.out.printf("%d는 음수임\n",a);
		}

	}

}
