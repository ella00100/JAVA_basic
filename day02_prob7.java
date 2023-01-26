package edu.inha.scanner;

import java.util.Scanner;

public class day02_prob7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		if (x%4 == 0 && x%5 == 0) {
			System.out.print("4와 5로 나누어지는가 : true\n");
		}
		else
			System.out.print("4와 5로 나누어지는가 : false\n");
		
		if (x%4 == 0 || x%5 == 0) { 
			System.out.print("4 또는 5로 나누어지는가 : true\n");
		}
		else 
			System.out.print("4 또는 5로 나누어지는가 : false\n");
			
		if (x%4 == 0 || x%5 ==0 && x%20!=0 ){
			System.out.print("4나 5중 하나로 나누어지지만 두 수 모두로는 나누어 지지지 않는가 : true\n");
		}
		else
			System.out.print("4나 5중 하나로 나누어지지만 두 수 모두로는 나누어 지지지 않는가 : false\n");
		
	}
}


