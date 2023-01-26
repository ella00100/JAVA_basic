package edu.ifex;

import java.util.Scanner;

public class ifForEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA점수 (0~100)입력 : ");
		int score = sc.nextInt();
		
		if (90<= score && 100>= score) {
			System.out.print("A학점");
		}
		else if (80<= score && score <90) {
			System.out.print("B학점");
		}
		else if (70<= score && score <80) {
			System.out.print("C학점");
		}	
		else if (60<= score && score <70) {
			System.out.print("D학점");
		}
		else
			System.out.print("F학점");

	
	if (90<= score) {
		System.out.print("A학점");
	}
	else if (80<= score) {
		System.out.print("B학점");
	}
	else if (70<= score) {
		System.out.print("C학점");
	}	
	else if (60<= score) {
		System.out.print("D학점");
	}
	else
		System.out.print("F학점");

	}
}
